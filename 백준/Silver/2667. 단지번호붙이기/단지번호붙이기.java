import java.io.*;
import java.util.*;

public class Main {
    static int num=1;
    static int n;
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    static boolean[][] isVisited;
    static int[][] map;
    static Map<Integer,Integer> cnt = new HashMap<>();


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        isVisited = new boolean[n][n];

        for(int i=0; i<n; i++){
            String str = br.readLine();
            for(int j=0; j<n; j++){
                map[i][j] = str.charAt(j)-'0';
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(map[i][j]==1 && !isVisited[i][j]){
                    cnt.put(num, 1);
                    dfs(i,j);
                    num++;
                }
            }
        }
        List<Integer> list = new ArrayList<>();
        Set<Integer> keySet = cnt.keySet();
        for(Integer i : keySet){
            list.add(cnt.get(i));
        }
        Collections.sort(list);

        System.out.println(cnt.size());
        for (Integer i : list) {
            System.out.println(i);
        }



    }

    static void dfs(int x, int y){
        isVisited[x][y]=true;

        int nextX, nextY;
        for(int k=0; k<4; k++){
            nextX = x+dx[k];
            nextY = y+dy[k];

            if(nextX<0|| nextX>=n ||nextY<0 || nextY>=n|| map[nextX][nextY]==0 || isVisited[nextX][nextY]){
                continue;
            }

            cnt.put(num, cnt.get(num) + 1);
            dfs(nextX, nextY);

        }

    }
}
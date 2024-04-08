import java.io.*;
import java.util.*;

public class Main {
    static int N,M;
    static int[][] map;
    static boolean[][] visited;
    static int[] dx = {-1,-1,-1,0,1,1,1,0};
    static int[] dy = {-1,0,1,1,1,0,-1,-1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        map = new int[N][M];

        Queue<int[]> q = new LinkedList<>();

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                map[i][j]= Integer.parseInt(st.nextToken());
                if(map[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        System.out.println(BFS(q)-1);

    }

    public static int BFS(Queue<int[]> q){
        visited = new boolean[N][M];
        int check = 2;

        while (!q.isEmpty()){
            int [] now = q.poll();
            // 좌상, 상, 우상, 우, 우하. 하, 좌하,, 좌
            for(int i =0; i<8;i++){
                int nextX = now[0]+dx[i];
                int nextY = now[1]+dy[i];
                if(nextX<0 || nextY<0|| nextX >=N || nextY >=M){
                    continue;
                }
                if(map[nextX][nextY] >=1){
                    continue;
                }
                visited[nextX][nextY] =true;
                map[nextX][nextY] = map[now[0]][now[1]] +1;
                q.add(new int[]{nextX,nextY});
                check = Math.max(map[nextX][nextY], check);
            }

        }
        return check;
    }
}

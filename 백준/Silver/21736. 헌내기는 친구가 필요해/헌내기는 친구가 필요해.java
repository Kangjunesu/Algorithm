import java.io.*;
import java.util.*;

public class Main {
    static int N, M, x, y,cnt;
    static int[] dx ={1,-1,0,0};
    static int[] dy = {0,0,1,-1};
    static Character [][] campus;
    static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        campus = new Character[N][M];
        isVisited = new boolean[N][M];

        for(int i =0; i<N; i++){
            String str = br.readLine();
            for(int j=0; j<M; j++){
                char ch = str.charAt(j);
                campus[i][j] =ch;
                if(ch=='I'){
                    x=i;
                    y=j;
                }
            }
        }
        search(x,y);
        if(cnt ==0){
            System.out.println("TT");
        }else{
            System.out.println(cnt);
        }

    }
    static void search(int x, int y){
        isVisited[x][y] = true;
        int nextX, nextY;

        for(int i=0; i<4; i++){
            nextX=x+dx[i];
            nextY=y+dy[i];
            if(nextX<0 || nextX>=N || nextY<0 || nextY>=M){
                continue;
            }

            if(!isVisited[nextX][nextY]){

                if(isVisited[nextX][nextY] ||campus[nextX][nextY]=='X'){
                    continue;
                }

                if (campus[nextX][nextY] =='P') {
                    cnt++;
                }
                search(nextX, nextY);
            }
        }
    }
}

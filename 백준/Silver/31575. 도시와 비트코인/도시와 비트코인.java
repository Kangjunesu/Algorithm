import java.io.*;
import java.util.*;

public class Main {
    static int [] dx = {1,0};
    static int[] dy ={0,1};
    static int N,M;
    static int[][] map;
    static boolean[][] isVisited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken()); 
        M = Integer.parseInt(st.nextToken()); 
        map = new int[M+1][N+1];
        isVisited = new boolean[M+1][N+1];

        for(int i =1; i<=M; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=N; j++){
                int n = Integer.parseInt(st.nextToken());
                map[i][j]=n;
            }
        }

        dfs(1,1);

        if(isVisited[M][N]){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }

    static void dfs(int x, int y){
        isVisited[y][x] =true;

        int nextX, nextY;
        for(int i=0; i<2;i++){
            nextX = x+dx[i];
            nextY = y + dy[i];

            if( nextX>N || nextY>M || map[nextY][nextX]==0 || isVisited[nextY][nextX]){
                continue;
            }
            dfs(nextX, nextY);
        }
    }
}
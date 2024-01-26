import java.io.*;
import java.util.*;

public class Main {
    static boolean [][]boards;
    static int [][] papers;
    static int cnt;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        papers = new int[n][2];

        StringTokenizer st;
        for(int i =0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<2; j++) {
                papers[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        // System.out.println(Arrays.deepToString(papers));

        boards = new boolean[100][100];
        cnt=0;
        for(int i =0; i<n; i++){
            check(papers[i][0], papers[i][1]);
        }
        System.out.println(cnt);
        
    }

    private static void check(int x, int y){
        for(int i= x; i<x+10; i++){
            for(int j =y; j<y+10; j++){
                if(!boards[i][j]){
                    boards[i][j]= true;
                    cnt++;
                }
            }
        }
    }


}
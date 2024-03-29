import java.io.*;
import java.util.*;

public class Main {
    static int [][] rectangle;
    static int d;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        rectangle = new int[N][M];  //초기화
        for(int i =0; i<N; i++){
            String line = br.readLine();
            for(int j =0; j<M; j++) {
                rectangle[i][j] = line.charAt(j) - '0';
            }
        }

        int D=0;
        for(int i =0; i<N; i++){
            for(int j=0; j<M; j++){
                n = rectangle[i][j];

                for(int k=j+1; k<M; k++){
                    if(n==rectangle[i][k]){
                        d = k-j;
                        if(i+d<N && j+d < M){ //ArrayIndexExc~방지
                            if(Check(i,j)){
                               if(d>D){
                                   D=d;
                               }
                            }
                        }

                    }
                }
            }
        }
        if(D==0){
            System.out.println("1");
        }else{
            System.out.println((int)Math.pow(D+1,2));
        }
        
    }

    private static boolean Check (int i, int j){
        if(n==rectangle[i+d][j] && n== rectangle[i+d][j+d]){
            return true;
        }else{
            return false;
        }
    }

}

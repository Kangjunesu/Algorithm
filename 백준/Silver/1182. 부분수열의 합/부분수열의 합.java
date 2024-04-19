
import java.io.*;
import java.util.*;

public class Main {
    static int N,S,cnt;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        arr= new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            arr[i] =Integer.parseInt(st.nextToken());
        }

        dfs(0,0);

        if(S==0){
            System.out.println(cnt-1);
        }else{
            System.out.println(cnt);
        }

    }

    static void dfs(int sum, int idx){
        if(idx==N){
            if(sum==S){
                cnt++;
            }
            return;
        }

        dfs(sum,idx+1);
        dfs(sum+arr[idx],idx+1);
    }

}

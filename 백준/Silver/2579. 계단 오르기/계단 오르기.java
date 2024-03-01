import java.io.*;
import java.util.*;

public class Main {

    static int[] arr;
    static Integer[]d;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        arr = new int[Math.max(N+1,3)];
        for(int i=1; i<=N; i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
 //       System.out.println(Arrays.toString(arr));

        d = new Integer[Math.max(N+1,3)];
        Arrays.fill(d,-1);
        d[0]=0;
        d[1]= arr[1];
        d[2]= arr[1]+arr[2];
        dp(N);
        System.out.println(d[N]);

    }

    static int dp(int n){
        if(d[n]==-1){
            d[n]=Math.max(dp(n-3)+arr[n-1], dp(n-2)) + arr[n];
        }
//        System.out.println(Arrays.toString(d));
        return d[n];

    }
}

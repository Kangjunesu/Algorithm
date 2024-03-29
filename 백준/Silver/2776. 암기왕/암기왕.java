import java.io.*;
import java.util.*;

public class Main {
    static int [] arr, nums;
    static StringBuilder sb= new StringBuilder();;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int t=0; t<T; t++){
            int N = Integer.parseInt(br.readLine());

            arr = new int[N];

            int i =0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                arr[i++] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);

            int M = Integer.parseInt(br.readLine());
            nums = new int[M];

            i=0;
            st= new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()){
                nums[i++] = Integer.parseInt(st.nextToken());
            }

            for(int n : nums){
                search(n,0,N-1);
            }
           
        }
        System.out.println(sb);

    }

    static void search(int n,int left, int right){
        if(left>right){
            sb.append("0").append("\n");
        }else{
            int mid = (left+right)/2;
            if(n<arr[mid]){
                search(n, left, mid-1);
            }else if(arr[mid]<n){
                search(n, mid+1,right);
            }else{
                sb.append("1").append("\n");
            }
        }

    }
}
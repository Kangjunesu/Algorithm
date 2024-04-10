import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] nums = new int[N+1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i =1; i<=N; i++){
            nums[i]=Integer.parseInt(st.nextToken());
        }

        List<Integer> arr = new ArrayList<>();
        for(int i=N; i>0; i--){
            int n = nums[i];
            arr.add(n,i);
        }
        for (Integer i : arr) {
            System.out.print(i);
            System.out.print(" ");
        }

    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken()); // 가지고 있는 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수
        List<Long> cables = new ArrayList<>(K);

        long max = 0;
        for (int i = 0; i < K; i++) {
            long a = Long.parseLong(br.readLine());
            cables.add(a);
            if (max < a) {
                max = a;
            }
        }

        long min = 1;
        long mid = 0;

        while (min <= max) {
            mid= (min+max)/2;

            long sum =0;
            for(long l : cables){
                sum+= l/mid;
                if(sum>N) {
                    min = mid+1;
                    break;
                }
            }

            if(sum==N){
                min = mid+1;
            }else if(sum <N){
                max = mid-1;
            }
 //         System.out.println("min, mid, max = " + min+", " + mid +", " + max);

        }
        System.out.println((max+min)/2);

    }
}

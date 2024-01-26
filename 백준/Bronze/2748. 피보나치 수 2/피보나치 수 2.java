import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        long [] nums = {0,1};
        long tmp =0;

        for(int i=0; i<n; i++){
            tmp =nums[0];
            nums[0] +=nums[1];
            nums[1]=tmp;

        }
        System.out.println(nums[0]);

    }
}

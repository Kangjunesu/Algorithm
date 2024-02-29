import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long mem[] = new long[Math.max(N,3)];

        mem[0]=1;
        mem[1]=2;
        mem[2]=3;

        for(int i=3; i<N; i++){
            mem[i]= (mem[i-1] + mem[i-2])%10;
  //          System.out.println(Arrays.toString(mem));
        }
        System.out.println(mem[N-1]);
    }


}
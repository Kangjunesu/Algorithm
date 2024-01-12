import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long s =Long.parseLong(br.readLine());
        
        //n(n+1) <= 2s 인 최대의 n
        int asw =0;

        for (int n = 1; ; n++) {
            if (((long)n*(n + 1)) > 2 * s) {
                break;
            } else {
                asw = n;
            }
        }

        System.out.println(asw);
        
    }
}

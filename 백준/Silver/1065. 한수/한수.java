import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt=0;
        for(int i=1; i<=N; i++){
             if(Check(i)){
                 cnt++;
             }

        }
        System.out.println(cnt);

    }

    private static boolean Check(int i) {
        if (i < 100) {
            return true;
        } else { //100이상인경우
            String I = String.valueOf(i);
            int d = I.charAt(0) - I.charAt(1); //공차

            for (int j = 1; j < I.length()-1; j++) {
                if (d != Integer.parseInt(String.valueOf(I.charAt(j))) - Integer.parseInt(String.valueOf(I.charAt(j + 1)))) {
                    return false;
                }
            }
            return true;

        }
    }

}

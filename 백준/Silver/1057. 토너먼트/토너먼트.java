import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int [] N = new int[3];
        for(int i =0; i<3; i++){
            N[i] = Integer.parseInt(st.nextToken());
        }

        int cnt =1;
        for(int i=0; i<Math.sqrt(N[0])+1; i++){
           // System.out.println(N[1] + ", " + N[2]);
            boolean abs = Math.abs(N[2] - N[1]) == 1;

            if (abs && N[1] < N[2] && N[1] % 2 == 1 && N[2] % 2 == 0) {
                break;
            } else if (abs && N[1] > N[2] && N[1] % 2 == 0 && N[2] % 2 == 1) {
                break;
            } else {
                cnt++;
                if (N[1] % 2 == 0) {
                    N[1] /= 2;
                } else {
                    N[1] = (N[1] + 1) / 2;
                }
                if (N[2] % 2 == 0) {
                    N[2] /= 2;
                } else {
                    N[2] = (N[2] + 1) / 2;
                }
//                System.out.println(cnt);
//                System.out.println(N[1] +", " + N[2]);
            }

        }
        System.out.println(cnt);


    }

}
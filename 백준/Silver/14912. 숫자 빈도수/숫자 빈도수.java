import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        String d = st.nextToken();


        int cnt =0;
        for(int i=1; i<=n; i++){
            String num = String.valueOf(i);
            for(int j =0; j<num.length(); j++){
                if(("" + num.charAt(j)).equals(d)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}
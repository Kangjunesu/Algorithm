import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine()); //N은 100이하

        String [] cross = new String[10];
        Arrays.fill(cross, "");

        for(int i=0; i<n; i++){
            StringTokenizer st= new StringTokenizer(br.readLine());;
            int j = Integer.parseInt(st.nextToken());
            String k = st.nextToken();
            cross[j-1] +=k;
        }

        int cnt = 0;
        for(int i =0; i< cross.length; i++){
            StringBuilder zeroOne = new StringBuilder();
            for(int j=0; j<cross[i].length(); j++){
                
                zeroOne.append(cross[i].charAt(j)); 

                if(zeroOne.toString().equals("00")){
                    zeroOne = new StringBuilder("0");
                } else if (zeroOne.toString().equals("11")){
                    zeroOne = new StringBuilder("1");
                } else if(zeroOne.toString().equals("10")){
                    cnt++;
                    zeroOne = new StringBuilder("0");
                } else if(zeroOne.toString().equals("01")){
                    cnt++;
                    zeroOne = new StringBuilder("1");
                }

            }
        }
        System.out.println(cnt);



    }
}
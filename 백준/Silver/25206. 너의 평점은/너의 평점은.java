import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double TotalSum = 0;
        double BSum =0;

        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); //공백단위로 읽어드릴수 있는 라인 추가

            String a = st.nextToken();
            String b = st.nextToken(); // 1.0 2.0 ~ 4.0
            String c = st.nextToken(); // A+ ~~

            if(!Objects.equals(c, "P")){
                BSum += Double.parseDouble(b);
            }

            switch (c){
                case "A+" :
                    TotalSum += Double.parseDouble(b) * 4.5;
                    break;
                case "A0" :
                    TotalSum += Double.parseDouble(b) * 4.0;
                    break;
                case "B+" :
                    TotalSum += Double.parseDouble(b) * 3.5;
                    break;
                case "B0" :
                    TotalSum += Double.parseDouble(b) * 3.0;
                    break;
                case "C+" :
                    TotalSum += Double.parseDouble(b) * 2.5;
                    break;
                case "C0" :
                    TotalSum += Double.parseDouble(b) * 2.0;
                    break;
                case "D+" :
                    TotalSum += Double.parseDouble(b) * 1.5;
                    break;
                case "D0" :
                    TotalSum += Double.parseDouble(b);
                    break;
                case "F" :
                    TotalSum += 0;
                    break;
                default :
                    break;
            }
        }
        System.out.println(TotalSum/BSum);
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<3; i++){
            int sum =0;
            StringTokenizer st = new StringTokenizer(br.readLine()); //공백단위로 읽어드릴수 있는 라인 추가

            for(int j=0; j<4; j++){
                sum+= Integer.parseInt(st.nextToken()); //한줄에서 공백 단위로 읽음
            }
            switch (sum) {
                case 0:
                    System.out.println("D");
                    break;
                case 1:
                    System.out.println("C");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("A");
                    break;
                case 4:
                    System.out.println("E");
                    break;
            }

        }
    }
}
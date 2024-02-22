import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int asw =0;

        while(N>0){
            if(N%5==0){
                asw+= N/5;
                N %=5;
            }else if(N>=3) {
                N -= 3;
                asw++;
            }else{
                break;
            }

        }

        if(N!=0){
            System.out.println(-1);
        }else{
            System.out.println(asw);
        }
    }
    


}
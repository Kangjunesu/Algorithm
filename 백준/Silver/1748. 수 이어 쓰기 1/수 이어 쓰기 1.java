import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String N = br.readLine();

        long asw=0;

        if(N.length()==1){
            System.out.println(Integer.parseInt(N));
        }else{
            for(int i=1; i<N.length(); i++){
                asw +=  9 * Math.pow(10, i - 1) * i;
            }
            asw += ((Long.parseLong(N) - Math.pow(10, N.length() - 1) + 1) * N.length());
            System.out.println(asw);
        }
        
    }
}

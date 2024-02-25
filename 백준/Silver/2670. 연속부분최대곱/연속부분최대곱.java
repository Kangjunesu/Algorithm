import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        double[] arr = new double[N + 1];
        double[] d = new double[N + 1];

        for (int i = 1; i <= N; i++) {
            arr[i] = Double.parseDouble(br.readLine());
        }
        d[1]= arr[1];

  //      System.out.println(Arrays.toString(arr));
        double asw = d[1];
        for(int i=1; i<=N; i++){
            d[i]=Math.max(arr[i], arr[i]*d[i-1]);
            if(d[i]>asw){
                asw = d[i];
            }
        }

 //       System.out.println(Arrays.toString(d));
        System.out.println(String.format("%.3f",asw));


    }
}
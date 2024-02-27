import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int D = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


//        System.out.println(Arrays.toString(arr));

        int [] xy = {1,0};  //x y의 계수

        for(int i = 0; i<D-1; i++){
            int tmp =xy[1];
            xy[1] += xy[0];
            xy[0]= tmp;
        }
//        System.out.println(Arrays.toString(xy));

        loop1:
        for(int i=1; i< K; i++){
            for(int j=i+1; j<=K; j++){
                if(xy[0]*i + xy[1]*j==K){
                    System.out.println(i);
                    System.out.println(j);
                    break loop1;
                }

            }
        }



    }

}

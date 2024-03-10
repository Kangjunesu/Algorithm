import java.io.*;
import java.util.*;

public class Main {

    static long Z;
    static long X,Y,asw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        X = Long.parseLong(st.nextToken());
        Y = Long.parseLong(st.nextToken());
        Z = (100 * Y )/ X;

        if(Z>=99){
            System.out.println(-1);
        }else{
            bs(0,X+1);
            System.out.println(asw);
        }


    }

    static void bs(long l, long r) {
        if (l <= r) {
            long mid = (l + r) / 2;
            if (check(mid) > Z) { //확률이 높게 나옴.
                bs(l, mid - 1);
            } else {
                bs(mid + 1, r);
            }
        }else{
            asw =l;
        }
    }

    static long check(long n){
        return  (100*(Y+n))/(X+n);
    }

}
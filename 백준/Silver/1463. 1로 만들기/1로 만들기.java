import java.io.*;
import java.util.*;

public class Main {
    static Integer[] mem;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        mem = new Integer[N+1];
        mem[0] = mem[1] =0;

        System.out.println(recur(N));

    }

    static int recur(int n) {
  //      System.out.println(Arrays.toString(mem));
  //      System.out.println();
        if (mem[n] == null) {
            if (n % 6 == 0) {
                mem[n] = Math.min(recur(n - 1), Math.min(recur(n / 3), recur(n / 2))) + 1;
            } else if (n % 3 == 0) {
                mem[n] = Math.min(recur(n / 3), recur(n - 1)) + 1;
            } else if (n % 2 == 0) {
                mem[n] = Math.min(recur(n / 2), recur(n - 1)) + 1;
            } else {
                mem[n] = recur(n - 1) + 1;
            }
        }
        return mem[n];
    }
    
}
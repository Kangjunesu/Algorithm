import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> cards = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (cards.containsKey(n)) {
                int cnt = cards.get(n);
                cards.put(n, ++cnt);
            } else {
                cards.put(n, 1);
            }
        }
//        System.out.println(cards);

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (cards.containsKey(n)) {
                sb.append(cards.get(n)).append(" ");
            } else {
                sb.append("0 ");
            }
        }

        System.out.println(sb);


    }

}
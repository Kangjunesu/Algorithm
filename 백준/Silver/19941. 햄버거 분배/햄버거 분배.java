import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String row = br.readLine();
        char[] table = row.toCharArray() ;  //char 배열로 초기화


        int cnt =0;
        loop1 :
        for(int i=0; i<N; i++){
            if (table[i] == 'P') { //탐색중 P 발견

                if (i - K >= 0) { //초기 탐색중 인덱스0보다 작은 구간 탐색x
                    for (int j = K; j > 0; j--) { //왼쪽끝부터 탐색
                        if (table[i - j] == 'H') {
                            table[i] = 'p';
                            table[i - j] = 'h';
                            cnt++;
                          //  System.out.println("1 : " + Arrays.toString(table));
                            continue loop1;
                        }
                    }
                } else if(i!=0 && i - K < 0){  //i-k가 0보다 작은 경우
                    for (int j = 0; j < i; j++) {
                        if (table[j] == 'H') {
                            table[i] = 'p';
                            table[j] = 'h';
                            cnt++;
                         //   System.out.println("2 : " + Arrays.toString(table));
                            continue loop1;
                        }
                    }
                } //좌측 탐색 끝


                for (int t = 1; t <= K; t++) { //우측 탐색
                    if (i + t <= N - 1) {
                        if (table[i + t] == 'H') {
                            table[i] = 'p';
                            table[i + t] = 'h';
                            cnt++;
                         //   System.out.println("3 : " + Arrays.toString(table));
                            continue loop1;
                        }
                    }
                }

            }
        }
        System.out.println(cnt);
        
    }
}
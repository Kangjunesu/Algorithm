import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] arr;
    static boolean[] isVisited;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 수

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());  //국가의 수
            int M = Integer.parseInt(st.nextToken());  //비행기 종류
            arr = new ArrayList[N + 1];
            isVisited = new boolean[N+1];

            for (int t = 0; t < N + 1; t++) {
                arr[t] = new ArrayList<>();
            }

            for (int k = 0; k < M; k++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                arr[a].add(b);
                arr[b].add(a);
            }
//            System.out.println(Arrays.toString(arr));
            int init =1;
            for(int j=1; j<M;j++){
                if(!arr[j].isEmpty()){
                    init = j;
                    break;
                }
            }
            cnt =0;
            dfs(init);
            System.out.println(cnt-1);


        }

    }
    static void dfs (int n){
        isVisited[n] = true;
        cnt++;
        for(int i : arr[n]){
            if(!isVisited[i]){
                dfs(i);
            }
        }
    }
    

}

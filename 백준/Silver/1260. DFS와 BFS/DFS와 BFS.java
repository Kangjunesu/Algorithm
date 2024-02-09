import java.io.*;
import java.util.*;

public class Main { 

    static int N;
    static int M;
    static int K;
    static ArrayList<Integer>[] arr;
    static boolean[] isVisit;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new ArrayList[N+1];
        isVisit = new boolean[N+1];
        sb = new StringBuilder();
        for(int i=0; i<arr.length; i++){
            arr[i]=new ArrayList<>();
        }

        for (int i = 0; i <M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            arr[a].add(b);
            arr[b].add(a);
        }

        for(int i =0; i<arr.length; i++){
            Collections.sort(arr[i]);
        }
//        System.out.println(Arrays.toString(arr));

        dfs(K);
        sb.append("\n");
        isVisit = new boolean[N+1];
        bfs(K);

        System.out.println(sb);
    }

    static void dfs(int idx){
        isVisit[idx]= true;
        sb.append(idx).append(" ");
//        System.out.println(sb);
        for(int i: arr[idx]){
            if(!isVisit[i]){
                dfs(i);
            }
        }
    }

    static void bfs(int idx){
        isVisit[idx] = true;
        Queue<Integer> q = new LinkedList<>();
        q.add(idx);
        while (!q.isEmpty()){

            int a = q.poll();
            sb.append(a).append(" ");
//            System.out.println(sb);
            for(int i : arr[a]){
                if(!isVisit[i]){
                    q.add(i);
                    isVisit[i] = true;
                }
            }
        }
    }

}
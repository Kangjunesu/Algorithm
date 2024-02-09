import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int M;
    static List<Integer>[] arr;
    static boolean[] isVisit;
    static Set<Integer> asw;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        arr = new ArrayList[N+1];
        isVisit= new boolean[N+1];
        asw = new HashSet<>();

        for(int i =0; i<arr.length; i++){
            arr[i] = new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            arr[a].add(b);
            arr[b].add(a);
        }

        bfs(1);
        System.out.println(asw.size()-1);


    }


    static void bfs(int i){
        Queue<Integer> q = new LinkedList<>();
        isVisit[i]= true;
        q.add(i);
        while (!q.isEmpty()){
            int a = q.poll();
            asw.add(a);
//            System.out.println(asw);
            for(int j: arr[a]){
                if(!isVisit[j]){
                    q.add(j);
                    isVisit[j] =true;
                }
            }

        }

    }


}

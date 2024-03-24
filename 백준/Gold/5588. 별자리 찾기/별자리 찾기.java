import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken()); //기준
        int y1 = Integer.parseInt(st.nextToken());
        
        int[][] displacement = new int[m-1][2];
        for(int i=0; i<m-1;i++){  //기준에 대해서 다른 점들의 편차
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            displacement[i][0]=x-x1;
            displacement[i][1]=y-y1; 
        }

        int n = Integer.parseInt(br.readLine());
        Set<List<Integer>> stars = new HashSet<>();
        for(int i=0; i<n;i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            List<Integer> xy = Arrays.asList(x, y);
            stars.add(xy);
        }

        loop1:
        for (List<Integer> star : stars) {
            int x = star.get(0);
            int y = star.get(1);
            int cnt=0;

            for(int[] d : displacement){
                List<Integer> a = Arrays.asList(x + d[0], y + d[1]);

                if (stars.contains(a)) {
                    cnt++;
                }else{
                    break;
                }
                if (cnt == displacement.length) {
                    System.out.println((x-x1) + " " + (y-y1));
                    break loop1;
                }

            }

        }

    }
}
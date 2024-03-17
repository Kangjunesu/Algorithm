import java.io.*;
import java.util.*;

public class Main {
    static int N,C,answer;
    static long []coordinates;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt((st.nextToken())); //집 수
        C = Integer.parseInt((st.nextToken())); // 공유기 수

        coordinates = new long[N]; //집의 좌표

        for(int i=0; i<N; i++){
            coordinates[i]= Long.parseLong(br.readLine());
        }
        Arrays.sort(coordinates);
        bs(1,coordinates[N-1]-coordinates[0]+1);
        System.out.println(answer);

    }
    
    static void bs(long l, long r) {
        if(l<=r){
            long mid = (l + r) / 2;
            int count = 0;
            List<Long> houseWithWifi = new ArrayList<>();
            houseWithWifi.add(coordinates[0]);

            for (int i = 1; i < coordinates.length; i++) {
                if (coordinates[i] >= mid + houseWithWifi.get(houseWithWifi.size() - 1)) {
                    count++;
                    houseWithWifi.add(coordinates[i]);
                    if (houseWithWifi.size() > C) {
                        break;
                    }
                }
            }

            if (houseWithWifi.size() >= C) {
                bs(mid + 1, r);
            } else {
                bs(l, mid - 1);
            }
        }else{
            answer = (int) ((l+r)/2);
        }
    }


}

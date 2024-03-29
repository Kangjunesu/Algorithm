import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String s = st.nextToken(); //개강총회 시작 시간
        String e = st.nextToken(); //총회 끝난 시간
        String q = st.nextToken(); //스트리밍 종료 시간
        
        int[] S = new int[2];
        int[] E = new int[2];
        int[] Q = new int[2];
        
        for(int i=0; i<2;i++){
            S[i] = Integer.parseInt(s.split(":")[i]);
            E[i] = Integer.parseInt(e.split(":")[i]);
            Q[i] = Integer.parseInt(q.split(":")[i]);
        }

        Set<String> participants = new HashSet<>();
        String inputLine;
        int cnt =0;
        while ((inputLine = br.readLine()) != null && !inputLine.isEmpty()) {
            st = new StringTokenizer(inputLine);
            String t = st.nextToken();

            int time = Integer.parseInt(t.split(":")[0]);
            int min = Integer.parseInt(t.split(":")[1]);
            String name = st.nextToken();

            if(time<S[0] || (time==S[0]&& min<=S[1])){
                participants.add(name);
            }
            if((time > E[0] || (time == E[0] && min >= E[1])) && (time < Q[0] || (time == Q[0] && min <= Q[1]))) {
                if(participants.contains(name)){
                    participants.remove(name);
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Map<String, String> siteMap = new HashMap<>(n);
        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            String site = st.nextToken();
            String pw = st.nextToken();
            siteMap.put(site,pw);
        }

        for(int i=0; i<m; i++){
            String site = br.readLine();
            System.out.println(siteMap.get(site));
        }

    }
}

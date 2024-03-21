import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String, Integer> ex = new HashMap<>();
        String extension = "";
        for (int i = 0; i < N; i++) {
            String[] fileName = br.readLine().split("\\.");
            extension = fileName[1];
            
            if (ex.containsKey(extension)) {
                ex.put(extension, ex.get(extension) + 1);
            } else {
                ex.put(extension, 1);
            }
        }

        if(ex.size()==1){
            System.out.println(extension + " " + ex.get(extension));
        }else{
            List<String> keys = new ArrayList<>(ex.keySet());
            Collections.sort(keys);
            for(String k : keys){
                System.out.println(k + " " + ex.get(k));
            }
        }
        
    }
}
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Map<String,Integer> books = new HashMap<>();

        for(int i=0; i<N; i++){
            String bookName = br.readLine();
            books.merge(bookName, 1, Integer::sum);

//            if(!books.containsKey(bookName)){
//                books.put(bookName,1);
//            }else{
//                books.put(bookName, books.get(bookName) + 1);
//            }
        }
        Integer maxValue = books.values().stream().max(Integer::compare).orElse(null);
        
        Optional<String> max = books.entrySet().stream()
                .filter(entry-> entry.getValue().equals(maxValue))
                .min(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey);

        System.out.println(max.get());
    }
}
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<String> SNs = new ArrayList<>();

        for(int i=0; i<N; i++){
            SNs.add(br.readLine());
        }

        Collections.sort(SNs, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    int n1 = calculator(o1);
                    int n2 = calculator(o2);
                    if(n1== n2){
                        return o1.compareTo(o2);
                    }else{
                        return n1-n2;
                    }
                }else{
                    return o1.length()-o2.length();
                }
            }
            
            public int calculator(String o){
                int sum = 0;
                for(int i=0; i<o.length(); i++){
                    int tmp = o.charAt(i)-'0';
                    if(0<=tmp && tmp<=9) {
                        sum+=tmp;
                    }
                }
                return sum;
            }
        });

        for(String a : SNs){
            System.out.println(a);
        }
        

    }
}
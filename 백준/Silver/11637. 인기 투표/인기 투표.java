import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for(int i =0; i<T; i++){

            int n =Integer.parseInt(br.readLine());

            int [] votes = new int[n];
            for(int j=0; j<n; j++){
                votes[j]=Integer.parseInt(br.readLine());
            }
            
            //투표 결과 오름차순 
            int[] votesSort = Arrays.stream(votes).sorted().toArray();

            if(votesSort[n-1]==votesSort[n-2]){ //최다 득표자가 여러명인경우
                System.out.println("no winner");
                continue;
            }

            double sum = 0;
            for(double a : votesSort){
                sum+=a;
            }

            if(votesSort[n-1] > sum/2){ // 최다 득표자가 과반 득표
                for(int p =0; p<n; p++){
                    if(votes[p]==votesSort[n-1]) System.out.println("majority winner "+ (p+1) );
                }
            }else { //과반 미달의 최다 득표
                for (int p = 0; p < n; p++) {
                    if (votes[p] == votesSort[n - 1]) System.out.println("minority winner " + (p+1));
                }
            }

        }
        

    }
}

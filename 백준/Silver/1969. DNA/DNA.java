import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken()); //dna 수
        int m = Integer.parseInt(st.nextToken()); //각 dna 문자열 길이

        String [] DNAs = new String[n];
        for(int i=0; i<n; i++ ){  //입력받은 DNA 염기 서열 초기화
            DNAs[i]=br.readLine();
        }

        String Yumgi ="ACGT";
        String answer ="";
        int HammingDst = 0;

        for(int i=0; i<m; i++){ //각 DNA의 1번째~m번째 문자 비교
            int[] cnt = {0,0,0,0}; //ACGT순서로 몇개씩 나오는지

            for(int j=0; j<n; j++){
                char ACGT = DNAs[j].charAt(i);
                switch (ACGT) {
                    case 'A':
                        cnt[0]++;
                        break;
                    case 'C':
                        cnt[1]++;
                        break;
                    case 'G':
                        cnt[2]++;
                        break;
                    case 'T':
                        cnt[3]++;
                        break;
                }
            }
            
            int maxIdx = 0;  //가장 빈번한 염기서열 인덱스 구하기
            int max = cnt[0];
            for(int k=0; k<4; k++){
                if(max < cnt[k]){
                    max=cnt[k];
                    maxIdx = k;
                }
            }

            HammingDst += (n-cnt[maxIdx]);
            answer += Yumgi.charAt(maxIdx)+"";
        }
        
        System.out.println(answer);
        System.out.println(HammingDst);

    }
}
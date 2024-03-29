import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int [][] board = new int[5][5];
        for(int i=0; i<5; i++){  //빙고판 초기화
            st =new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        String [] num = new String[25]; //불러주는 번호 순서대로 초기화
        Arrays.fill(num, "");

        int cnt=0;
        for(int i =0; i<5; i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                num[cnt] = st.nextToken();
                cnt++;
            }
        }

        // 빙고가 나오는 조합은 12가지 : 가로 세로 각 5 + 대각선 2
        String[] bingoList = new String[12]; //12가지 빙고인 경우 초기화
        Arrays.fill(bingoList, "");

        for(int i=0; i<12; i++){
            if(i<5){  //가로
                for(int j =0; j<5; j++){
                    bingoList[i] += " " + board[i][j] +" ";
                }
            }else if (i<10){  //세로
                for (int j = 0; j < 5; j++) {
                    bingoList[i] += " " + board[j][i-5] + " ";
                }
            }else if (i==10){  //대각선 1
                for(int j=0; j<5; j++){
                    bingoList[i] += " " + board[j][j] + " ";
                }
            }else {  //대각선 2
                for(int j=0; j<5; j++) {
                    bingoList[i] += " " + board[j][4 - j] + " ";
                }
            }
        }

        Set<Integer> bingoNum= new HashSet<>(); //빙고 되는 경우 인덱스 추가
        loop1 :
        for(int i =0; i<num.length; i++){  //불러준 수25개 순서대로
            
            for(int j=0; j< bingoList.length; j++){ //12개의 빙고의 경우 순회
                if(bingoList[j].contains(" "+ num[i]+ " ")){
                    bingoList[j] = bingoList[j].replace(" " + num[i]+" ", " x ");
                }
            }

            for(int j =0; j< bingoList.length; j++){
                if(Objects.equals(bingoList[j], " x  x  x  x  x ")){
                    bingoNum.add(j); //빙고인 경우 발생하면 set에 추가
                }
                if(bingoNum.size()>=3){
                    System.out.println(i+1);
                    break loop1;
                }
            }
            
        }
        
    }
}

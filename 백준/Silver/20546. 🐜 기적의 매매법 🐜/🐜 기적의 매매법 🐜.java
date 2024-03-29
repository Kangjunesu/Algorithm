import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int capital = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] stockPrice = new int[14];
        for(int i =0; i<14; i++){
            stockPrice[i] = Integer.parseInt(st.nextToken());
        }

        //배열 idx 0 : 현금 / 1: 주식 수량 /
        int [] JH = {capital, 0};
        int [] SM = {capital, 0};

        //준현 JH : BNP 매매, 최대한 가격 되는 대로 풀매수. 매도는 X
        for(int i =0; i< stockPrice.length; i++){
            if(JH[0]/stockPrice[i]>=1){ //현재 자금으로 매수할 수 있다면
                int buyQtt = JH[0]/stockPrice[i];
                JH[1] += buyQtt;
                JH[0] -= buyQtt*stockPrice[i];
            }else if (JH[0]==0){
                break;
            }
        }

        // int[] stockPrice = {10 20 23 34 55 / 30 22 '19' 12 45 / 23 44 34 38}
        //20 20 33 98 15 / 6 '4' '1' 1 1 / 2 3 6 14
        // 성민  SM: 33매매,   3일이상 하락하면 그날 풀매수. 3일째 상승하면 그날 풀매도.

        int red =0;
        int blue =0;

        for(int i=0; i<14; i++){
            if(i>=1 && stockPrice[i]-stockPrice[i-1]>0){ //상승
                red ++;
                blue = 0;
            }else if(i>=1 && stockPrice[i]-stockPrice[i-1]<0){ //하락
                blue++;
                red=0;
            }else{ //변동이 없을 경우
                red =0;
                blue =0;
            }

            if(blue>=3 && SM[0]/stockPrice[i]>=1 && SM[0]>0){ //매수
                int buyQtt = SM[0]/stockPrice[i];
                SM[1] += buyQtt;
                SM[0] -= buyQtt*stockPrice[i];
            }

            if(red>=3){ //매도
                SM[0] += SM[1]*stockPrice[i];
                SM[1] =0;
            }
        }

        int JHtotal = JH[0]+JH[1]*stockPrice[13];
        int SMtotal = SM[0]+SM[1]*stockPrice[13];

        if(JHtotal>SMtotal){
            System.out.println("BNP");
        } else if (JHtotal<SMtotal) {
            System.out.println("TIMING");
        }else{
            System.out.println("SAMESAME");
        }


    }
}
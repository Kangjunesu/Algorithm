import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        String e = sc.nextLine();

        Character[][] fiveLines = new Character[5][15];
        String[] lines = {a, b, c, d, e};

        for(int i=0; i< 5; i++){
            for(int j=0; j<15; j++){

                if(lines[i].length()>j){
                    fiveLines[i][j] = lines[i].charAt(j);
                }else{
                    fiveLines[i][j] = ' ';
                }
            }
        }
        String answer = "";
        for(int i=0; i<15; i++){
            for(int j =0; j<5; j++){
                if(fiveLines[j][i] !=' ') {
                    answer += fiveLines[j][i];
                }
            }
        }
        System.out.println(answer);

    }
}
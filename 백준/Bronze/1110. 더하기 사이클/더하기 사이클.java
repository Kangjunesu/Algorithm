import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String d = a;

        if(d.length()==1){
            d = "0"+d;
        }

        for(int i =1;i<100 ;i++){

            int b = Integer.parseInt(String.valueOf(d.charAt(0)));
            int c = Integer.parseInt(String.valueOf(d.charAt(1)));
            int sum = b+c;

            if(sum>=10){
                d = (c+ "") + (sum%10);
            }else{
                d = (c+ "") +sum;
            }

            if(Integer.parseInt(a)==Integer.parseInt(d)){
                System.out.println(i);
                break;
            }

        }


    }
}
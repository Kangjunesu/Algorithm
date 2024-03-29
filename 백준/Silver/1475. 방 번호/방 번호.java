import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder inputNum = new StringBuilder(br.readLine()); //12635

        for (int i = 0; i < inputNum.length(); i++) {
            if (inputNum.charAt(i) == '9') {  //9를 전부 6으로
                inputNum.setCharAt(i, '6');
            }
        }

        List<StringBuilder> aswList = new ArrayList<>();
        aswList.add(new StringBuilder("0123456786"));

        for (int i = 0; i < inputNum.length(); i++) { 

            for (int k = 0; k < aswList.size(); k++) {

                for (int j = 0; j < aswList.get(k).length(); j++) { 

                    if (inputNum.charAt(i) == aswList.get(k).charAt(j)) {
                        aswList.get(k).setCharAt(j, 'x');
                        inputNum.setCharAt(i, 'x');
                        break;
                    }
                }
            }

            if(inputNum.charAt(i) !='x'){
                i-=1;
                aswList.add(new StringBuilder("0123456786"));
            }

        }
        System.out.println(aswList.size());
    }
}
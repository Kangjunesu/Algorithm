import java.io.*;

public class Main {

    static int i;
    static int[][] chart;
    static int x;
    static int y;
    static int vector;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int findNumber = Integer.parseInt(br.readLine());

        chart = new int[n][n];

        i = 1;
        x = n / 2;
        y = n / 2;

        vector = 0;
        int[] asw = new int[2];

        while (i <= n * n) {
            chart[x][y] = i;
            if (i == findNumber) {
                asw[0] = x + 1;
                asw[1] = y + 1;
            }
            i++;
            successVectoring(x, y);
        }

        for (int i = 0; i < chart.length; i++) {
            for (int j = 0; j < chart[i].length; j++) {
                bw.write(chart[i][j] + " ");
            }
            bw.newLine(); 
        }
        bw.write(asw[0] + " " + asw[1]);

        bw.flush();
        bw.close();

    }

    static boolean zeroCheck(int x, int y) {
        if (chart[x][y] == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void successVectoring(int x, int y) {

        if (vector == 0) { //N으로 가야할경우
            Main.x -= 1;
        } else if (vector == 1) { //E로 가야 할 경우
            Main.y += 1;
        } else if (vector == 2) { //S로 가야 할 경우
            Main.x += 1;
        } else if (vector == 3) { //W로 가야 할 경우
            Main.y -= 1;
        }

        if (zeroCheck(Main.x, Main.y)) { //다음 좌표가 가능한지 체크
            if (vector != 3) {
                vector++;
            } else {
                vector = 0;
            }
        } else {
            falseVectoring();
        }
    }

    static void falseVectoring() {

        if (vector == 0) { //북으로 못가면 서로
            Main.x += 1;
            Main.y -= 1;
        } else if (vector == 1) { //동으로 못가면 북으로
            Main.x -= 1;
            Main.y -= 1;
        } else if (vector == 2) { // 남으로 못가면 동으로
            Main.x -= 1;
            Main.y += 1;
        } else if (vector == 3) { //서로 못가면 남으로
            Main.x += 1;
            Main.y += 1;
        }

    }

}


import java.io.*;
import java.util.*;

public class Main {
    static boolean[][] paper;
    static int [][] coordinate;
    static int [] dx = {1,-1,0,0};
    static int [] dy ={0,0,1,-1};
    static int height;
    static int width;
    static int cnt;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        height = Integer.parseInt(st.nextToken()); //세로
        width = Integer.parseInt(st.nextToken()); // 가로
        int K = Integer.parseInt(st.nextToken()); //직사각형 개수

        paper = new boolean[width][height];
        coordinate = new int[K][4];

        for(int i =0; i<K; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                coordinate[i][j] = Integer.parseInt(st.nextToken());
            }
        }
 //       System.out.println(Arrays.deepToString(coordinate));

        for(int i=0; i<K; i++){
            rectangleArea(coordinate[i][0],coordinate[i][1],coordinate[i][2],coordinate[i][3]);
        }
 //       System.out.println(Arrays.deepToString(paper));

        List<Integer> area = new ArrayList<>();
        for(int x=0; x<width; x++){
            for(int y=0; y<height; y++){
                if(!paper[x][y]){
                    cnt=0;
                    dfs(x,y);
                    area.add(cnt);
                }

            }
        }

        Collections.sort(area);
        bw.append(area.size()+"\n");
        for(int i=0; i<area.size(); i++){
            bw.append(area.get(i) +" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }

    private static void dfs(int x, int y){
        paper[x][y] = true;
        cnt++;
        for (int i = 0; i < 4; i++) {
            int next_x = x + dx[i];
            int next_y = y + dy[i];
            
            if(check(next_x, next_y)){
                dfs(next_x, next_y);
            }
        }
    }

    private static boolean check(int x, int y){
        return 0 <=x && x < width && 0 <=y && y < height && !paper[x][y];
    }

    private static void rectangleArea(int x1, int y1, int x2, int y2){
        for (int x = x1; x < x2; x++) {
            for (int y = y1; y < y2; y++) {
                if (!paper[x][y]) {
                    paper[x][y] = true;
                }
            }
        }
    }

}

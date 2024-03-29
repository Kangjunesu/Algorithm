import java.io.*;
import java.util.*;

public class Main {
//    static Queue<Integer> q;
static Deque<Integer> q;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] orders = new String[N];

        for(int i=0; i<N; i++){
            orders[i]=br.readLine();
        }
//        q = new LinkedList();
        q = new ArrayDeque<>();

        for(int i = 0; i < N; i++) {
            String s = orders[i];
            if(s.contains("push")) {
                String[] split = s.split(" ");
                add(Integer.parseInt(split[1]));
            } else {
                switch (s) {
                    case "pop":
                        bw.write(pop() + "\n");
                        break;
                    case "size":
                        bw.write(size() + "\n");
                        break;
                    case "empty":
                        bw.write(empty() + "\n");
                        break;
                    case "front":
                        bw.write(front() + "\n");
                        break;
                    case "back":
                        bw.write(back() + "\n");
                        break;
                }
            }
        }

        bw.flush();
        bw.close();
    }

    public static void add(int n) {
        q.offer(n);
    }

    public static String pop() {
        if(!q.isEmpty()) {
            return String.valueOf(q.poll());
        } else {
            return "-1";
        }
    }

    public static int size() {
        return q.size();
    }

    public static int empty() {
        if(q.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    public static int front() {
        if(!q.isEmpty()) {
            return q.peek();
        } else {
            return -1;
        }
    }

    private static int back() {
        if(!q.isEmpty()) {
//            return ((LinkedList<Integer>)q).getLast();
            return q.peekLast();
        } else {
            return -1;
        }
    }
}

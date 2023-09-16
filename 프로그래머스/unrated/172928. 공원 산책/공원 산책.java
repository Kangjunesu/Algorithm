import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        String [][] routeSplit = new String[routes.length][2];

        int [] xy = {};
        
        Loop1:
        for(int i=0; i<park.length; i++){
            for(int j=0; j< park[0].length(); j++){
                if(park[i].charAt(j)=='S'){
                    xy= new int[]{i, j};
                    break Loop1;
                }
            }
        }
        // System.out.println("xy : " + Arrays.toString(xy)); //S위치 초기화


        for (int i = 0; i < routes.length; i++) {
            routeSplit[i][0] = routes[i].split(" ")[0];
            routeSplit[i][1] = routes[i].split(" ")[1];
        }
        // System.out.println("routeSplit : "+ Arrays.deepToString(routeSplit));
        // System.out.println();

        for(int i=0; i< routes.length; i++){

            switch (routeSplit[i][0]) {
                case "E":
                    if ((xy[1] + Integer.parseInt(routeSplit[i][1]))<=(park[xy[0]].length()-1)) {
                        String a = park[xy[0]].substring(xy[1], xy[1] + Integer.parseInt(routeSplit[i][1]) + 1);
                        // System.out.println("이동구간 substring : " + a);
                        if ((!a.contains("X"))) {
                            xy[1] += Integer.parseInt(routeSplit[i][1]);
                        }
                    }
                    // System.out.println("E 처리후 xy : " +Arrays.toString(xy));
                    // System.out.println();
                    break;

                case "W":
                    if ((xy[1] - Integer.parseInt(routeSplit[i][1]))>=0) {
                        String a = park[xy[0]].substring(xy[1]-Integer.parseInt(routeSplit[i][1]), xy[1]);
                        // System.out.println("이동구간 substring : " + a);
                        if ((!a.contains("X"))) {
                            xy[1] -= Integer.parseInt(routeSplit[i][1]);
                        }
                    }
                    // System.out.println("W 처리후 xy : " +Arrays.toString(xy));
                    // System.out.println();
                    break;

                case "S":
                    if(xy[0]+Integer.parseInt(routeSplit[i][1])< park.length){
                        String a = "";
                        for(int j =0; j <= Integer.parseInt(routeSplit[i][1]); j++ ){
                            a+=park[xy[0]+j].charAt(xy[1]);
                            // System.out.println("S에서 a : " + a);
                        }
                        if ((!a.contains("X"))) {
                            xy[0] += Integer.parseInt(routeSplit[i][1]);
                        }
                    }
                    // System.out.println("S 처리후 xy : " +Arrays.toString(xy));
                    // System.out.println();
                    break;

                case "N":
                    if((xy[0]-Integer.parseInt(routeSplit[i][1]))>=0){
                        String a = "";
                        for(int j =0; j <= Integer.parseInt(routeSplit[i][1]); j++ ){
                            a+=park[xy[0]-j].charAt(xy[1]);
                            // System.out.println("N에서 a : " + a);
                        }
                        if ((!a.contains("X"))) {
                            xy[0] -= Integer.parseInt(routeSplit[i][1]);
                        }
                    }
                    // System.out.println("N 처리후 xy : " +Arrays.toString(xy));
                    // System.out.println();
                    break;
            }



        }
        return xy;
    }
}
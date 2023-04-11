import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int[] answer;
        //sum을 Hashset으로
        Set<Integer> sum = new HashSet<>();

        for(int a =0; a< numbers.length; a++){
            for(int b = a+1; b< numbers.length; b++){
                sum.add(numbers[a]+numbers[b]);
            }
        }
        // Set을 배열로
        Integer[] arr = sum.toArray(new Integer[sum.size()]);

        // 배열 오름차순 정렬
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        // 배열을 answer에
        answer = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            answer[i] = arr[i];
        }
        return answer;
    }
}
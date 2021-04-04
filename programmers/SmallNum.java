public class SmallNum {
    public int[] solution(int[] arr) {
        if (arr.length <= 1) {
            int[] answer = {-1};
            return answer;
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }

        int[] answer = new int[arr.length - 1];
        int idx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            answer[idx++] = arr[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        SmallNum sn = new SmallNum();
        int[] arr = {4,3,2,1};
        int[] result = sn.solution(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}

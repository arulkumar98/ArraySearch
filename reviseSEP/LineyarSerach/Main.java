public class Main {
    public static void main(String[] args) {
        int[] arr = {22,44,88,777,22,88,8};
        int target = 4;

        int ans = simplserch(arr,target);
        System.out.println(ans);
    }

    private static int simplserch(int[] arr, int target) {
        if (arr.length == 0){
            return -1;
        }


        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
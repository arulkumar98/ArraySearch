public class Search2D {
    public static void main(String[] args) {
        int[][] arr ={
                {44,42,48,44},
                {77,88,33,6},
                {72,66,44,9}
        };
        int target = 72;
        boolean ans = searchMatrix(arr,target);
        System.out.println(ans);
}
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0){
            return false;
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                if (anInt == target) {
                    return true;
                }
            }
        }
        return false;
    }
}

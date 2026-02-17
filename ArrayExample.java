public class ArrayExample {
    public static void main(String[] args) {
        final int[] arr = new int[5];
        int[][] arr2D = new int[3][3];
        System.out.println("1D Array:"+arr[1]);
        System.out.println("2D Array:"+arr2D[1][1]);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

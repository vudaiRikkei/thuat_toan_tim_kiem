import java.util.Arrays;

/**
 * tìm só nhỏ nhất =  thuật toán tìm kiếm tuyến tính
 */

public class Bt2 {
    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rikkei Academy*/
    }

    public static void main(String[] args) {
        int[] arr = {0, 312, 4, 12, 31, 424, 234, 32};
        System.out.println(Arrays.toString(arr));
        int min = 0;
        int min2 = 0;
        int found = 0;
        int found2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min2 = min;
                min = arr[i];
                found = i;
            } else if ((min < arr[i] && min2 > arr[i]) || min2 == min) {
                min2 = arr[i];
                found2 = i;
            }

        }
        System.out.println("Số nhỏ nhất trong mảng là: " + min + " co vi tri la " + found);
        System.out.println("Số nhỏ t2 trong mảng là: " + min2 + " co vi tri la " + found2);
    }

}

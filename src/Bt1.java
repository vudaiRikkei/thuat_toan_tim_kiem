import java.util.Arrays;

/** tìm só lớn nhất =  thuật toán tìm kiếm tuyến tính*/

public class Bt1 {
    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    public static void main(String[] args) {
        int []arr = getArr();
        System.out.println(Arrays.toString(arr));
        int max=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Số lớn nhất trong mảng là: "+ max);
    }

}

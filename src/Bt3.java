import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/** Bài tập tìm kiếm số bất kỳ trong mảng 2 chiều (advance)*/
public class Bt3 {
    public static void main(String[] args) {
        int[][] arr = getArr();
        for (int i=0;i < arr.length;i++ ){
            for (int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("nhập vào tìm kiếm trong mảng");
        int number = new Scanner(System.in).nextInt();
        search( arr,  number);


    }

    private static int[][] getArr(){
        int arr[][] = new int[20][15];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }

        }
        return arr;
        /** Copyright belong to Rekkei Academy*/
    }

    private static int search(int[][] arr, int number) {
        boolean check = false;
        List<Integer> index1 = new ArrayList<>();
        List<Integer> index2 = new ArrayList<>();

        for (int i =0; i<arr.length; i++){
            for (int j=0; j< arr.length;j++){
                if (arr[i][j] == number){
                    check = true;
                    index1.add(i);
                    index2.add(j);
                }
            }
        }

        if(!check){
            System.out.println("số bạn cần tìm không có trong mảng");
        }else{
            System.out.println("sô bạn tìm xuât hiện:" + index1.size()+1);
            for (int i = 0; i < index1.size(); i++) {
                System.out.println(index2.get(i) + "." + index1.get(i) + ", ");
            }
//            for (Integer index: index1
//                 ) {
//                System.out.println("tại vị trí "+ index1 + " " + index2);
//            }
        }
        return 1;
    }


}

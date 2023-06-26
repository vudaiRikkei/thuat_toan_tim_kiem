import java.util.Scanner;

/** tìm số lớn thứ 3 trong mảng*/
public class Baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arrays = {2342343,615,2345,51,61,61,65,16,15,67890,3516,516,13,123,51,651,35,135,165};
        System.out.println("hay nhap so n ngau nhien");
        int number = scanner.nextInt();
        boolean checkNumber = false;

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == number) {
                System.out.println(number + " co trong mang, o vi tri index thu: " + i);
                checkNumber = true;
                break;
            }
        }
        if (!checkNumber) {
            System.out.println("Khong tim thay " + number + " trong mang");
        }

        int max1 = 10000000;
        int max2 = 10000000;
        int max3 = 10000000;
        int found1 = 0;
        int found2 = 0;
        int found3 = 0;
        for (int i = 0; i < arrays.length; i++) {
            if ((arrays[i] > max1) || (max2 == max1 || max2 == max3 || max3 == max1)) {
                max3 = max2;
                max2 = max1;
                max1 = arrays[i];
            }else if (arrays[i] > max2 && arrays[i] < max1){
                max3 = max2;
                max2 = arrays[i];
            }else if (arrays[i] > max3 && arrays[i] < max2){
                max3 = arrays[i];
                found3 = i;
            }
        }

        System.out.println("maax 1 "+ max1 + " " + found1 );
        System.out.println("max 2 "+max2 + " " + found2 );

        System.out.println("so lon thu 3 trong mang la: " + max3 + " co vi tri index trong mang la: " + found3);

    }
}

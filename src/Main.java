import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số nguyên");
        int num = sc.nextInt();
        int low = 0;
        int height = arr.length - 1;
        while (height >= low) {
            int mid = (low + height) / 2;
            if (arr[mid] == num) {
                System.out.println("phần tử " + num + "nằm ở vị trí số " + mid);
                break;
            } else if (num < arr[mid]) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (num == arr[low]) {
            System.out.println("so ban tim o vi tri so: "+low);
        }else {
            System.out.println("khong tim thay");
        }
    }
}
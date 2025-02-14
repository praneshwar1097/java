import java.util.Scanner;

public class LeftRotate {
    public static void leftRotate(String str, int n) {

        char[] arr = str.toCharArray();

        n = n % arr.length;

        reverse(arr, 0, n - 1);
        reverse(arr, n, arr.length - 1);
        reverse(arr, 0, arr.length - 1);

        System.out.println(new String(arr));
    }

    private static void reverse(char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
     
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter number of rotations: ");
        int n = sc.nextInt();

        leftRotate(str, n);

        sc.close();
    }
}

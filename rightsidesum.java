import java.util.*;
public class RightSideSum {

    public static int[] rightSideSum(int n, int[] arr) {
        int[] rightSum = new int[n]; 
        int sum = 0;

        for (int i = n - 1; i >= 0; i--) {
            rightSum[i] = sum;
            sum += arr[i];
        }

        return rightSum;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int[]arr=new int[s];
        for(int i=0;i<=s-1;i++){
            arr[i]=sc.nextInt();
        }
         int n = arr.length;  

         int[] result = rightSideSum(n, arr);

         for (int val : result) {
             System.out.println(val);
         }
    }
}
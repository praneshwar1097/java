import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a[] = {500,600,700,800,900};
        System.out.println("Enter your Element:");
        int key = sc.nextInt();
        
        int start = 0;
        int end = a.length-1;
        int flag=0;
        
        for(int i=0; i<a.length-1;i++){
            if(a[i]==key){
                System.out.println("Element Found :" + i);
                flag=1;
            }
        }
        if(flag==0){
        System.out.println("Element not found");
    }
    }
}
import java.util.*;
public class Temporaryvariable{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("enter a  :");
        int a=in.nextInt();
        System.out.println("enter b  :");
        
        int b=in.nextInt();
        //int a=10;
        //int b=6;
        int temp;

        
        temp=a;
        a=b;
        b=temp;
        
        System.out.println("The value is swapped   :  "+a);
        System.out.println("The value is swapped   :  "+b);
    }
}
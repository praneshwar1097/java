import java.util.*;
public class Oddeven{
    
    void val(int num){

        if(num%2==0)
        {
            System.out.println(num +"is even number");
            
        }
        else
        {
            System.out.println(num +"is odd number");
            
        }
    }


    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number  :  ");
        int num=in.nextInt();
        Oddeven n=new Oddeven();
        n.val(num);
        
    }
}
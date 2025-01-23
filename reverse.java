import java.util.*;
public class Main{
        public static void main(String[] args) {
            int answer;
            Scanner in=new Scanner(System.in);
            System.out.println("Enter a number  :  ");
            int n=in.nextInt();
            int s=0;
            int rem;
            while(n!=0){
                rem=n%10;
                s=s*10+rem;
                n=n/10;
            
        }
        System.out.println("reversed number is  :  "+s);
        }
}

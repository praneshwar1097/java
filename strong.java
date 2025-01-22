import java.util.*;
public class tile
{
	public static void main(String[] args) {
	    
	    Scanner num=new Scanner(System.in);
        int m=num.nextInt();
        int n=m;
        int rem;
        int s=0;
         while(n>0){
            rem=n%10;
            int fact=1;
            for(int i=1;i<=rem;i++){
                fact=fact*i;
            }
            
            s=s+fact;
            n=n/10; 
            
            
        }
        System.out.println(s);
        if (s==m){
            System.out.println("Strong number");
            
        }
        else{
            System.out.println("not a strong number");
        }
       
}
     
}
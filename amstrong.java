import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner num=new Scanner(System.in);
	    int count=0;
        int m=num.nextInt();
        int n=m;
        int t=m;
        int rem;
        int s=0;
         while(n!=0){
            n=n/10;
            count++;
        }
         while(m>0){
            rem=m%10;//3
            int cube=0;
                cube=(int)Math.pow(rem,count);
            //System.out.println(cube);
            
            s=s+cube;
            m=m/10; 
            
            
        }
        System.out.println(s);
        if (s==t){
            System.out.println("AmStrong number");
            
        }
        else{
            System.out.println("not a Amstrong number");
        }
       
}
     
}
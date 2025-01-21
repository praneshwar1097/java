import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner num=new Scanner(System.in);
	    System.out.println("enter a number");
	    int a=num.nextInt();
	    int s1=0;
	    int s2=0;
	    int rem;
	    int sq=a*a;
	    System.out.println("sq"+sq);
	    while(sq>0)
	    {
	        rem=sq%10;
	        s1=s1*10+rem;
	        sq=sq/10;
	        
	    }
	    System.out.println("sq num rev"+s1);
	    int sqrt=(int)Math.sqrt(s1);
	    System.out.println("sqrt num"+sqrt);
	    while(sqrt>0)
	    {
	        rem=sqrt%10;
	        s2=s2*10+rem;
	        sqrt=sqrt/10;
	        
	    }
	    System.out.println("reversed num"+s2);
	    if(a==s2){
	        System.out.println("ït is a adam's num");
	    }
	    
	    else{
	        System.out.println("not an adam s number");
	        
	    }
	    
	}
}
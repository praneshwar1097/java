import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    System.out.println("enter array size  :  ");
	    int n=in.nextInt();
	    int a[]=new int[n];
	    System.out.println("enter a elements  :  ");
	    for (int i=0;i<n;i++){
	        a[i]=in.nextInt();
	        
	    }
	    for (int i=0;i<n;i++){
	        System.out.println(a[i]+" ");
	        
	}
	System.out.println("number searched  :  ");
	int b=in.nextInt();
	boolean found=false;
	for(int i=0;i<n;i++){
	    if(b==a[i]){
	        found=true;
	        break;
	    }
	}
	if(found==true){
	    System.out.println("true");
	    }
	 else {
	    System.out.println("false");
	     }
	    
	}
}

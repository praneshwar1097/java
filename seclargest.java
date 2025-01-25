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
	    System.out.println();  
        Arrays.sort(a);
        System.out.println(a[n-2]);
}
}
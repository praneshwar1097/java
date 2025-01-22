import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();

	        for(int i=1;i<=n;i++){
	            for(int sp=1;sp<=n-i;sp++){
	                System.out.print("  ");
	                }
	                for(int j=1;j<=(2*i)-1;j++){
	                    if(i==1 || j==1 || j==(2*i)-1){
	                    System.out.print("* ");
	                
	            }
	            else{
	                System.out.print("  ");
	            }
	                    
	                }
	            System.out.println();
	            }
	            for(int i=n-1;i>=1;i--){
	            for(int sp=1;sp<=n-i;sp++){
	                System.out.print("  ");
	                }
	                for(int j=1;j<=(2*i)-1;j++){
	                    if(j==1 || j==(2*i)-1){
	                    System.out.print("* ");
	                
	            }
	            else{
	                System.out.print("  ");
	            }
	                    
	                }
	            System.out.println();
	            }
	}
}
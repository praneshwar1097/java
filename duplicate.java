import java.util.*;
public class Main
{
	public static void main(String[] args) {
        int a[]={1,2,3,3,3,4,6};
        for (int i=0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
        System.out.println();
        // int val=1;
        Arrays.sort(a);
        for (int i=0;i<a.length;i++){
            // if(val==a[i]){
                
            //     continue;
            // }
            // else{
            //     System.out.print(a[i] +" ");
            // }
            // for (int j=i+1;j<a.length;j++){
                if(i==0 || a[i]!=a[i-1]){
                    System.out.println(a[i]);
                }
                
            // } 
        } 
	}
}
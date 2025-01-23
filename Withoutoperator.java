import java.util.*;
public class Withoutoperator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int answer=0;
        
        for(int i=1;i<=b;i++){
            answer=answer+a;
        }
        System.out.println(" the answer is  :  "+answer);
    }
}
import java.util.*;
public class Si{
    int answer;
    void val(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a amount  :  ");
        int p=in.nextInt();
        System.out.println("Enter a interest  :  ");
        int r=in.nextInt();
        System.out.println("Enter a time  :  ");
        int t=in.nextInt();
    
    
        answer=(p*r*t)/100;
        System.out.println("the si is  :  "+answer);
        
    
}


    public static void main(String[] args) {

        Si n=new Si();
        n.val();
    }
}
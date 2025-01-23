import java.util.*;
public class Calc{
    int num;
    int ans;
    void val(){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a num  :  ");
        int num=in.nextInt();
            ans=num-(2*num+1);
            System.out.println("the answer is  :  "+ans);
}


    public static void main(String[] args) {

        Calc n=new Calc();
        n.val();
    }
}
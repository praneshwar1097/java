import java.util.*;
class Main{
        int a;
        int b;
        int c;
        int d;
        int p;
        int q;
    void inp(){
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
    }
    public void add(){
        c=a+b;
        
    }
    public void sub(){
        d=a-b;
    }
    public void mul(){
        p=a*b;
    }
    public void div(){
        q=a/b;
    }
    public void disp(){
        System.out.println(c);
        System.out.println(d);
        System.out.println(p);
        System.out.println(q);
    }
    public static void main(String[] args){
        Main x=new Main();
        x.inp();
        x.add();
        x.mul();
        x.div();
        x.disp();
        
        
    }
}
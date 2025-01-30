class Node{
    int data;
    Node.Next;
    Node.Prev;
    
    Node(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    class DLL{
        Node head,tail;
        public void Insertatbegin(int data)
        if(head==null){
            head=tail=newNode;
        }
        else{
            newNode.next=head;
            head prev=newnode;
        }
    }
    public void display{
        Nodetemp=head;
        if(temp==null)
        {
            System.out.println("list is empty  :  ");
            
        }
        if(temp!=null){
            System.out.println(temp.data);
            while(tempnext!=null){
                System.out.println("<-->");
            }
            temp=temp.next;
        }
        System.out.println();
    }
    public class Main{
        public static void main(String[] args){
            DLL doubly=new DLL();
            doubly.insertatbegin()
        }
    }
}
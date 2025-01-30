/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next =null;
        this.prev = null;
    }
}
class DLL{
    Node head,tail;
    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail=newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(tail==null){
            head=tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }
    public void display(){
        Node temp = head;
        if(temp==null){
            System.out.println("Empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data);
            if(temp.next!=null){
                System.out.print(" <--> ");
            }
             temp = temp.next;
            
        }
        System.out.println();
    }
    public void deleteAtBeg(){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        if(head==tail){
            head=tail=null;
        }
        else{
            head=head.next;
            head.prev = null;
        }
    }
    public void deleteAtEnd(){
        
    }
}
public class Main
{
	public static void main(String[] args) {
		DLL doubly = new DLL();
		doubly.insertAtBeg(100);
		doubly.insertAtBeg(200);
		doubly.insertAtBeg(300);
		doubly.insertAtEnd(400);
		doubly.deleteAtBeg();
		doubly.display();
	}
}
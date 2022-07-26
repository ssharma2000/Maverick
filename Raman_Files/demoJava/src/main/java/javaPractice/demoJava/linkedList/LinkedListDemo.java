package linkedList;

import org.w3c.dom.Node;

class DataStructLinkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }
    public DataStructLinkedlist insert(DataStructLinkedlist dsl,int d){
        Node newNode=new Node(d);
        newNode.next=null;
        if(dsl.head==null){
            dsl.head=newNode;
        }
        else{
            Node last=dsl.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=newNode;
        }
        return dsl;
    }
    public static void printList(DataStructLinkedlist dsl){
        Node currNode=dsl.head;
        while(currNode!=null){
            System.out.println(currNode.data);
            currNode=currNode.next;
        }
    }
}


public class LinkedListDemo {
    public static void main(String[] args) {
        System.out.println("creating linked list");
        DataStructLinkedlist dsl=new DataStructLinkedlist();
        dsl= dsl.insert(dsl,1);
        dsl= dsl.insert(dsl,2);
        dsl= dsl.insert(dsl,3);
        dsl= dsl.insert(dsl,4);
        dsl= dsl.insert(dsl,5);
        dsl= dsl.insert(dsl,6);
        dsl= dsl.insert(dsl,7);
        DataStructLinkedlist.printList(dsl);

    }
}

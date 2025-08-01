package LinkedList;



// Linked List Creation
class Node<T>{

    T data;    // Data to be stored in the node
    Node next; // Pointer to the next node

    Node(){
        this.next = null; // Intially next pointer will be null
    }

    Node(T data){
        this.data = data;  
        this.next = null;  // if next is not specified the consider next as null
    }
}

class Insersion{


    public static void main(String[] args) {
        Insersion obj = new Insersion();
        obj.insertHead(50);
        obj.printList();
    }


   
    Node<Integer> head;
    int size;

    Insersion(){
        this.head = null;
        this.size = 0;
    }

    public void insertHead(int data){
        
        Node <Integer> newNode = new Node(data);

        if(head == null){
            newNode = head;
            System.out.println("Insertion at head is successful");
            size++;
            return;
        }

        newNode.next = head;
        head = newNode;
        System.out.println("Insertion at head is successful");
        size++;
    }


    public void insertTail(int data){
        
        Node <Integer> newNode = new Node(data);

        if(head == null){
            newNode = head;
            System.out.println("Insertion at tail is successful");
            size++;
            return;
        }

        Node <Integer> temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
        System.out.println("Insertion at tail is successful");
        size++;

    }

    public void insertMid(int data , int position){

        if(position > size + 1 || position <= 0){

            System.out.println("Wrong Input");
            return;
        }
        
        if(position == 1){
            insertHead(data);
            System.out.println("Insertion is successful at position" + position);
        }
        
        else if (position == size + 1){
            insertTail(data);
            System.out.println("Insertion is successful at position" + position);
        }
        else{
            int counter = 1;
            Node<Integer> newNode = new Node<>(data);
            Node<Integer> temp = head;

            while(counter < position - 1 && temp != null){
                counter++;
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            System.out.println("Insertion is successful at position" + position);
            size++;
        }
    }

    public void printList(){
        Node<Integer> temp = head;

        while(temp != null){
            System.out.println("data is ->" + temp.data);
            temp = temp.next;
        }
    }
}
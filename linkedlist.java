public class LinkedList18{

//creation of linkedlist
    public static class Node{
        //singly linked list
    //     int data;
    //     Node next;

    //     public Node(int data){
i    //         this.data=data;
    //         this.next=null;
    //     }


    // }
    // public static Node head;
    // public static Node tail;
    //  public static int size;
    //


     //doubly linked list
     int data;
     Node next;
     Node prev;
     public Node (int data){
            this.data=data;
            this.next=null;
            this.prev=null;
     }
     }


     public static Node head;
    public static Node tail;
     public static int size;



     //addfirst(ddl)
     public void addFirst(int data){
        Node newNode= new Node(data);
        size++;
        if(head == null){
            head=tail=newNode;
            return;

        }
        newNode.next=head;
        head.prev= newNode;
        head=newNode;


     }

     //print ddl
     public void print(){
        Node temp=head;
        while(temp!= null){
            System.out.print(temp.data+ "<-> ");
            temp=temp.next;
        }
        System.out.println("null");
     }





     //remove first
     public int removefirst(){
        if(head == null){
            System.out.println("dll is empty.");
        return Integer.MIN_VALUE;
        }

        if(size == 1){
         int val =head.data;
         head=tail=null;
         size --;
         return val;

        }

        int val =head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
     }

// reverse the doubly linked list (clean and correct)
public void reverse() {
    Node curr = head;
    Node temp = null;


    while (curr != null) {
        // Swap prev and next
        temp = curr.prev;
        curr.prev = curr.next;
        curr.next = temp;

        // Move to the next node (originally prev)
        curr = curr.prev;
    }

    // After loop, temp will be at the old head; update head
    if (temp != null) {
        head = temp.prev;
    }
}





        

     //reverse dll
     public void reverse(){
        Node curr=head;
        Node prev=null;
        Node next;

        while( curr != null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;

            prev=curr;
            curr=next;




        }
        head=prev;
     }
// addLast function for doubly linked list
public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (tail == null) {  // if list is empty
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}

// findMiddle function for doubly linked list
public Node findMiddle() {
    if (head == null) {
        System.out.println("List is empty.");
        return null;
    }
    Node slow = head;
    Node fast = head;


    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;  // slow will be at middle node
}
public int removeLast() {
    if (head == null) {
        System.out.println("DLL is empty.");
        return Integer.MIN_VALUE;
    }

    if (size == 1) {
        int val = head.data;
        head = tail = null;
        size = 0;
        return val;
    }

    int val = tail.data;
    tail = tail.prev;
    tail.next = null;
    size--;
    return val;
}
public int search(int key) {
    Node temp = head;
    int index = 0;

    while (temp != null) {
        if (temp.data == key) {
            return index;
        }
        temp = temp.next;
        index++;
    }

    return -1; // not found
}



    //singly linked list
    //add operation (add first)
//     public void addFirst(int data){
//         //step1:create new node
//         Node newNode= new Node (data);
//         size++;

//         if(head == null){    //if linkedlist is empty
//             head = tail = newNode;   //newnode that is created it will be both head and tail
//             return;
//         }

//         //step2:new node's next= head//         newNode.next=head;

//         //step3:head= newNode
//         head=newNode;

//     }

//         //added operation(addLast)
//         public void addLast(int data){
//             //create the node
//             Node newNode= new Node(data);
//             size++ ;
//             if( head ==  null) {    //ll is empty
//                 head=tail=newNode;
//                 return;
//             }


//             //tail.next = newNode
//             tail.next=newNode;

//             //tail= newNode
//             tail= newNode;










// Add last (DLL)
public void addLast(int data) {
    Node newNode = new Node(data);
    size++;
    if (head == null) {
        head = tail = newNode;
        return;
    }
    tail.next = newNode;
    newNode.prev = tail;
    tail = newNode;
}




//         //print of ll
//         public void printList(){
//             if(head == null){
//                 System.out.println("ll is empty");
//                 return;
//             }
//             Node temp= head;    //storing head in a temporary varible
//             while(temp != null){
//                 System.out.print(temp.data+ "-> ");   //data is printed
//                 temp= temp.next;         //temp moves to next node

//             }
//             System.out.println("null");
//         }


// //added in the miidle
// public void addmiddle(int idx,int data){
//     if(idx == 0)1{
//         addFirst(data);
//         return;
//     }
//     Node newNode = new Node(data);
//     size++;
//     Node temp =head;
//     int i=0;
//     while( i < idx-1){
//         temp= temp.next;
//         i++;

//     }

//     // i = idx-1 -> that is when the temp points the previous node  add the node in the middle

//     newNode.next=temp.next;
//     temp.next= newNode;



// }



// //removing the data from first






public int getAtIndex(int index) {
    if (index < 0 || index >= size) {
        System.out.println("Index out of bounds.");
        return Integer.MIN_VALUE;
    }
    Node temp = head;
    for (int i = 0; i < index; i++) {
        temp = temp.next;
    }
    return temp.data;
}





// //remove the data from first
// public int removeFirst(){
//     if(size == 0){   // ll is empty
//         System.out.println("ll is empty.");
//         return Integer.MIN_VALUE;
//     }else if(size == 1){

//     int val=head.data;
//     head=tail=null;
//     size =0;
//     return val;


//     }
//     //if size is more than  1
//     int val=head.data;
//     head=head.next;
//     size --;
//     return val;
// }




















// //removing the data from last of ll
// public int removeLast(){
//       if(size == 0){   // ll is empty
//         System.out.println("ll is empty.");
//         return Integer.MIN_VALUE;
//     }else if(size == 1){

//     int val=head.data;
//     head=tail=null;
//     size =0;
//     return val;
// }

// //prev : i = size -2
// Node temp= head;
// for(int i=0; i<size-2; i++){
//     temp=temp.next;

// }

// //when we reach the prev node of the next n ode that is to be removed
// int val = temp.next.data;
// temp.next=null;
// tail=temp;
// size--;
// return val;
:wq

// }


//iterative search      O(n)
// public int iterativesearch(int key){
//     Node temp=head;
//     int idx=0;
//     while (temp != null){
//         if(temp.data == key){  // key found
//             return idx;
//         }
//         // if node found
//         temp=temp.next;
//         idx++;

//     }
//     // not found
//     return -1;

// }



//recursive search
// public int helper(Node head,int key){    //O(n)
//     //base case
//     if( head == null){
//         return -1;
//     }

//     if(head.data == key){
//         return 0;
//     }

//     int idx= helper(head.next, key);   // we my helper find the key in the further part of ll
// if(idx == -1){
//     return -1;
// }


// return idx+1;
// }

// public int recursivesearch(int key){
//         return helper(head,key);
// }






//reverse the linekd list        O(n)
// public void reverse(){
//     Node prev= null;
//     Node curr = tail = head;
//     Node next;


//     while( curr != null){
//         //step1
//         next = curr.next;

//         //step 2

//         curr.next = prev;

//         //step 3
//         prev = curr;

//         // step 4
//         curr = next;


//     }
// head = prev;

// }



//find and remone nth node from end
// public void deletenthfromend (int n){
//     //calculate size
//     int size =0;
//     Node temp = head;
//     while(temp != null){
//         temp= temp.next;
//         size ++;

//     }
// if( n == size ){
//     head = head.next;  //remove first
//     return;
// }


// //size -n
// int i =1;
// int itofind= size-n;
// Node prev = head;
// while(i < itofind){
//     prev= prev.next;
//     i++;

// }
// prev.next= prev.next.next;
// return;



// }










//check if ll is palindrome or not
// public Node findmid(Node head){
//     //slow fast approach
//     Node slow=head;
//     Node fast=head;


//     while(fast != null  && fast.next != null) {

//             slow = slow.next;   //+1
//             fast= fast.next.next; // +2

//     }
//     return slow;     // slow is my mid node
// }




// public boolean checkpalindrome()
// {
//     if(head == null && head.next == null){    // if ll is empty or ll has only one node
//         return true;
//     }
//     //step1 find mid
//     Node midnode= findmid(head);

//     //step2 reverse the 2nd half of ll
//          Node prev= null;
//         Node curr = midnode;
//         Node next;
//         while( curr != null){
//         next = curr.next;
//          curr.next = prev;
//         prev = curr;
//         curr = next;


//     }
//     Node right = prev;  //right half head = prev
//     Node left= head;     //left half head = head

//     //step 3 : check if left hald == right half
//     while( right != null){
//         if(left.data != right.data){
//             return false;
//         }
//         left = left.next;
//         right=right.next;

//     }

//     return true;
// }









// //detect a cycle in ll
// public  static boolean detectloop(){
//     Node slow=head;
//     Node fast= head;


//     while(fast != null && fast.next != null){
//         slow= slow.next;
//         fast=fast.next.next;
//         if(slow == fast){
//             return true; //cycle exists

//         }

//     }
//     return false;   // cycle doesnt exists
// }




// public static void removecycle(){
//         //detect cycle
//     Node slow=head;
//     Node fast= head;
//     boolean cycle=false;


//     while(fast != null && fast.next != null){
//         slow= slow.next;
//         fast=fast.next.next;
//         if(fast == slow){
//             cycle=true;
//             break;

//         }

//     }
//     if(cycle == false){
//         return ;
//     }

//         // find the meeting point or cycle creation point
//         slow= head;
//         Node prev= null;    //last node will be stored in prev
//         while(slow != fast){
//             prev = fast;
//             slow= slow.next;
//             fast=fast.next;

//         }
//         //remove cycle =>last.next == null
//         prev.next = null;


// }










//merge sort on ll
//  private Node getMid(Node head){
//     //slow fast approach
//     Node slow=head;
//     Node fast=head.next;


//     while(fast != null  && fast.next != null) {

//             slow = slow.next;   //+1
//             fast= fast.next.next; // +2

//     }
//     return slow;     // slow is my mid node
// }

// private Node merge(Node head1,Node head2){
//     Node mergell= new Node(-1);
//     Node temp = mergell;   //temp variable that points the mergell that is the dumby ll

//     while(head1 != null && head2 != null){
//         if(head1.data <= head2.data){
//             temp.next = head1.next;
//             head1=head1.next;
//             temp=temp.next;


//         }else{
//             temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;

//         }
//     }
//     while(head1 != null){
//          temp.next=head1;
//            head1=head1.next;
//             temp=temp.next;

//     }


//     while(head2 != null){
//          temp.next=head2;
//             head2=head2.next;
//             temp=temp.next;

//     }
//     return mergell.next;


// }

// public Node mergeSort(Node head){
//     if(head == null || head.next == null){
//         return head; //ll is already sorted
//     }
//     //find mid
//     Node mid = getMid(head);

//     // left and right half divide
//     Node righthead=mid.next;
//     mid.next = null;
//     Node newleft=mergeSort(head);  //left half
//     Node newright= mergeSort(righthead); // right half


//      //merge the sorted ll
//     return merge(newleft,newright);


// }











//zigzag linkedlist
// public void zigzag(){
//     //step 1:find mid
//  Node slow=head;
//     Node fast=head.next;


//     while(fast != null  && fast.next != null) {

//             slow = slow.next;   //+1
//             fast= fast.next.next; // +2

//     }
//     Node mid = slow;


//     //step2:reverse 2nd half of ll

//         Node curr = mid.next;
//         mid.next=null;
//         Node prev=null;
//         Node next;

//         while( curr != null){
//         next = curr.next;
//          curr.next = prev;
//         prev = curr;
//         curr = next;


//     }
//     Node right = prev;  //right half head = prev
//     Node left= head;     //left half head = head
//     Node nextL,nextR;



//     //step3:alternate merging  (zigzag code)
//     while(left != null  && right != null){
//         nextL=left.next;
//         left.next=right;
//         nextR=right.next;
//         right.next= nextL;


//         //updation
//         left=nextL;
//         right=nextR;

//     }












public static void main(String[] args) {
            //  Scanner sc =new Scanner(System.in);
             //creation of linked list(using java collection framework)
            //  LinkedList<Integer> ll = new LinkedList<>();
            //  //add operation

            //  ll.addFirst(1);     //O(1)
            //  ll.addFirst(2);

            //  ll.addLast(3);      //O(1)
            //  ll.addLast(4);

            //  System.out.println(ll);



            //printing the ll
            //creating and printing the data from scratch
            // LinkedList18 ll = new LinkedList18();
            // ll.printList();
            // ll.addFirst(1);     //O(1)
            // ll.printList();
            //  ll.addFirst(2);
            // ll.printList();



            //  ll.addLast(3);      //O(1)
            // ll.printList();
            //  ll.addLast(4);
            //  ll.printList();
             //add in the middle
            //  ll.addmiddle(2, 9);
            //  ll.printList();
             //size of ll
            //  System.out.println(ll.size);

             //remove first
            //  ll.removeFirst();
            //  ll.printList();

             //remove last
            //  ll.removeLast();
            //  ll.printList();




             //iterative search
            //  System.out.println(ll.iterativesearch(9));
            //    System.out.println(ll.iterativesearch(10));




            // recursive search
            //    System.out.println(ll.recursivesearch(3));
            //    System.out.println(ll.recursivesearch(10));x



            //reverse ll
            //  ll.printList();
            // ll.addFirst(1);
            // ll.printList();
            //  ll.addFirst(2);
            // ll.printList();



            //  ll.addLast(3);
            // ll.printList();
            //  ll.addLast(4);
            //  ll.printList();
            //  ll.addLast(5);
            //  ll.printList();
            //  ll.reverse();
            //  ll.printList();




            //deletenthfromend
            //   ll.printList();
            // ll.addFirst(1);
            // ll.printList();
            //  ll.addFirst(2);
            // ll.printList();



            //  ll.addLast(3);
            // ll.printList();
            //  ll.addLast(4);
            //  ll.printList();
            //  ll.addLast(5);
            //  ll.printList();
            //  ll.deletenthfromend(3);
            //  ll.printList();







            //check palindrome
            // ll.addLast(1);
            // ll.addLast(2);
            // ll.addLast(2);
            // ll.addLast(1);

            // ll.printList();
            // System.out.println(ll.checkpalindrome());






            //detect cycle
            // head= new Node(1);
            // head.next=new Node(2);
            // head.next.next= new Node(3);
            // head.next.next.next= head;
            // //1->2->3->1
            // System.out.println(detectloop());






            //remove cycle
            // head= new Node(1);
            // Node temp=new Node(2);
            // head.next=temp;
            // head.next.next= new Node(3);
            // head.next.next.next=  temp ;
            // //1->2->3->2
            //   System.out.println(detectloop());     //true
            //     removecycle();
            // System.out.println(detectloop());    //false








            //merge sort in ll     //O(nlogn)
                // ll.addFirst(1);
                // ll.addFirst(2);
                // ll.addFirst(3);
                // ll.addFirst(4);
                // ll.addFirst(5);

                // //5->4->3->2->1->null

                // ll.printList();
                // ll.head =ll.mergeSort(ll.head);
                // ll.printList();






            //zig zag linked list
            // ll.addFirst(6);
            //  ll.addFirst(5);
            //  ll.addFirst(4);
            // ll.addFirst(3);
            // ll.addFirst(2);
            // ll.addFirst(1);

            // ll.printList();
            // ll.zigzag();
            // ll.printList();





            //doubly linked list
            //inbuilt
            //  LinkedList<Integer> dll = new LinkedList<>();
            //  dll.addFirst(3);
            //   dll.addFirst(2);
            //    dll.addFirst(1);
            //    System.out.println(dll);



            //from scracth   creation and print dll
            LinkedList18 dll = new LinkedList18();
            // dll.print();
            // dll.addFirst(4);     //O(1)
            // dll.print();
            //  dll.addFirst(3);
            // dll.print();
            // dll.addFirst(2);
            // dll.print();
            // dll.addFirst(1);
            // dll.print();
            // System.out.println(dll.size);




            //removefirst in dll
            // dll.print();
            // dll.addFirst(4);     //O(1)
            // dll.print();
            //  dll.addFirst(3);
            // dll.print();
            // dll.addFirst(2);
            // dll.print();
            // dll.addFirst(1);
            // dll.print();
            // dll.removefirst();
            // dll.print();




            //reverse dll
             dll.print();
            dll.addFirst(4);     //O(1)
            dll.print();
             dll.addFirst(3);
            dll.print();
            dll.addFirst(2);
            dll.print();
            dll.addFirst(1);
            dll.print();
            dll.reverse();
            dll.print();


     }
    }

class Node9{
    int data;
    Node9 next;

    Node9(int data){
        this.data = data;
        this.next = null;
    }
//    Node9(int data, Node9 next) {   // ✅ new constructor
//        this.data = data;
//        this.next = next;
//    }
}
public class Insertion_head_LL {
    private static Node9 ArrtoLL(int[] arr){
        Node9 head = new Node9(arr[0]);
        Node9 mover = head;
        for(int i = 1 ; i < arr.length ; i ++){
            Node9 temp = new Node9(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
    private static void print(Node9 head){
        while(head!=null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node9 insertHead(Node9 head , int val){
        Node9 temp = new Node9(val); // return new Node9(val , head);
        temp.next = head;
        return temp;
    }
    public static void main(String[] args) {
     int[] arr = {2,4,6,8,9,4,3};
     Node9 head = ArrtoLL(arr);
     head = insertHead(head , 29); // this will also work
        // insertHead(29 ,head);
     print(head);
    }
}

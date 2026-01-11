class Node5{
    int data;
    Node5 next;

    Node5(int data){
        this.data = data;
        this.next = null;
    }
}
public class Deletion_head_LL {
    private static Node5 ArrtoLL(int[] arr){
        Node5 head = new Node5(arr[0]);
        Node5 mover = head;
       for(int i = 1 ; i < arr.length ; i++){
           Node5 temp = new Node5(arr[i]);
           mover.next = temp;
           mover = temp;
       }
       return head;
    }

    private static void print(Node5 head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Node5 removeHead(Node5 head){
        if(head == null) return head;
        head = head.next;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,5,9,3};
        Node5 head = ArrtoLL(arr);
        head = removeHead(head);
        print(head);
    }
}

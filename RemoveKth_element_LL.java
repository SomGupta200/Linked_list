class Node7{
    int data;
    Node7 next;

 Node7(int data) {
     this.data = data;
     this.next = null;
 }
}
public class RemoveKth_element_LL {
    private static Node7 ArrtoLL(int[] arr){
        Node7 head = new Node7(arr[0]);
        Node7 mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node7 temp = new Node7(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node7 head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    //Remove the element by index
    private static Node7 removek(Node7 head , int k){
        if(head == null) return head;
        if(k == 1){
            Node7 temp = head;
            head = head.next;
            return head;
        }
        int cnt = 0 ;
        Node7 temp = head;
        Node7 prev = null;
        while(temp != null){
            cnt ++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,5,9,3};
        Node7 head = ArrtoLL(arr);
       head = removek(head , 1);
        print(head);
    }
}

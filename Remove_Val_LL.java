class Node8{
    int data;
    Node8 next;

    Node8(int data){
        this.data = data;
        this.next = null;
    }
}
public class Remove_Val_LL {
    private static Node8 ArrtoLL(int[] arr) {
        Node8 head = new Node8(arr[0]);
        Node8 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node8 temp = new Node8(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node8 head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
     //Remove the element by given value/element
     private static Node8 Removeval(Node8 head , int val){
        if(head == null) return head;
        if(head.data == val) {
            Node8 temp = head;
            head = head.next;
            return head;
        }
        Node8 temp = head;
            Node8 prev = null;
            while(temp != null){

                if(temp.data==val){
                    prev.next = prev.next.next;
                    break;
                }
                prev = temp;
                temp = temp.next;
            }
            return head;
        }
    public static void main(String[] args) {
        int[] arr = {2,5,3,8,6};
        Node8 head = ArrtoLL(arr);
        head = Removeval(head , 8);
        print(head);
    }
}

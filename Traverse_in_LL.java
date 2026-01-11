class Node2{
    int data;
    Node2 next;

    Node2(int data){
        this.data = data;
        this.next = null;
    }
}
public class Traverse_in_LL {
    private static Node2 ArrtoLL(int[] arr){
        Node2 head = new Node2(arr[0]);
        Node2 mover = head;
        for(int i = 1 ; i < arr.length ; i ++){
            Node2 temp = new Node2(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node2 head = ArrtoLL(arr);
        Node2 temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}

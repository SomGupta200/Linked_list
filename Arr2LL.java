class Node1{
    int data;
    Node1 next;

    Node1(int data){
        this.data = data;
        this.next = null;
    }
}
public class Arr2LL {
    private static Node1 ArrtoLL(int[] arr){
        Node1 head = new Node1(arr[0]);
        Node1 mover = head;
        for(int i = 1 ; i < arr.length ; i ++){
            Node1 temp = new Node1(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node1 head = ArrtoLL(arr);
        System.out.println(head.data);
    }
}

class Node3{
    int data;
    Node3 next;
    Node3(int data){
        this.data = data;
        this.next = null;
    }
}
public class Length_of_LL { // Main class
    private static Node3 ArrtoLL(int[] arr) {
        Node3 head = new Node3(arr[0]);
        Node3 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node3 temp = new Node3(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
// Finding the Length of the linked list
    private static int LengthofLL(Node3 head){
        int cnt = 0;
        Node3 temp = head;
        while (temp != null) {
            temp = temp.next;
            cnt ++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Node3 head = ArrtoLL(arr);
        System.out.println(LengthofLL(head));
    }
}

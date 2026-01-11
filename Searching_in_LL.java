class Node4{
    int data;
    Node4 next;

    Node4(int data){
        this.data = data;
        this.next = null;
    }
}
public class Searching_in_LL {
    private static Node4 ArrtoLL(int[] arr) {
        Node4 head = new Node4(arr[0]);
        Node4 mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node4 temp = new Node4(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }
   private static  int checkIfPresent(Node4 head , int val){
        Node4 temp = head;
        while(temp != null){
            if(temp.data == val) return 1;
            temp = temp.next;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Node4 head = ArrtoLL(arr);
        System.out.println(checkIfPresent(head , 6));
    }
}

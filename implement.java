class Node{
    int data;
    Node next;

    Node(int data){  // Thats the Syntax
        this.data = data;
        this.next = null;
    }
}
public class implement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        Node y = new Node(arr[2]);
        System.out.println(y.data);
    }
}

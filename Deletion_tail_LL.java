class Node6{
    int data;
    Node6 next;

    Node6(int data){
        this.data = data;
        this.next = null;
    }
}
public class Deletion_tail_LL{
    private static Node6 ArrtoLL(int[] arr){
        Node6 head = new Node6(arr[0]);
        Node6 mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Node6 temp = new Node6(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Node6 head){
        while(head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }
   private static Node6 removeTail(Node6 head){
        if(head == null || head.next == null) return null;
        Node6 temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
   }
    public static void main(String[] args) {
        int[] arr = {2,7,5,9,3};
        Node6 head = ArrtoLL(arr);
        head = removeTail(head);
        print(head);
    }
    }



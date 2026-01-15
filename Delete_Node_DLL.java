// delete the given node but node != head
// node never be head

class Nodedel{
    int data;
    Nodedel next;
    Nodedel prev;

    Nodedel(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Nodedel(int data , Nodedel prev , Nodedel next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class Delete_Node_DLL {
    private static Nodedel ArrtoDLL(int[] arr){
        Nodedel head = new Nodedel(arr[0]);
        Nodedel prev = head;
        for(int i = 1 ; i < arr.length ; i++){
            Nodedel temp = new Nodedel(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Nodedel head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    private static void deleteNode(Nodedel temp){
        Nodedel prev = temp.prev;
        Nodedel front = temp.next;
        if(front == null){
            prev.next = null;
            temp.prev = null;
        }
        prev.next = front;
        front.prev = prev;

        temp.next = temp.prev = null;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Nodedel head = ArrtoDLL(arr);
        deleteNode(head.next.next);
        print(head);
    }
}

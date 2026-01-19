// Insert the element before tail
class Nodetl{
    int data;
    Nodetl next;
    Nodetl prev;

    Nodetl(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Nodetl(int data , Nodetl prev , Nodetl next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class Insertion_tail_DLL {
    private static Nodetl ArrtoDLL(int[] arr){
        Nodetl head = new Nodetl(arr[0]);
        Nodetl prev = head;
        for(int i = 1 ; i < arr.length ; i++){
            Nodetl temp = new Nodetl(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Nodetl head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static Nodetl insertBeforeTail(Nodetl head , int val){
        if(head.next == null){
           return insertBeforeTail(head , val);
        }
        Nodetl tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        Nodetl prev = tail.prev;
        Nodetl newNode = new Nodetl(val , prev , tail);
        prev.next = newNode;
        tail.prev = newNode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Nodetl head = ArrtoDLL(arr);
        head = insertBeforeTail(head , 9);
        print(head);
    }
}

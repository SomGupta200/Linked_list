class Nodein{
    int data;
    Nodein next;
    Nodein prev;

    Nodein(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
    Nodein(int data , Nodein prev , Nodein next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}

public class Insertion_before_head_DLL {
    private static Nodein ArrtoDLL(int[] arr){
        Nodein head = new Nodein(arr[0]);
        Nodein prev = head;
        for(int i = 1 ; i < arr.length ; i++){
            Nodein temp = new Nodein(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Nodein head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    private static Nodein insertBeforeHead(Nodein head , int val){
        Nodein newHead = new Nodein(val , null , head);
        head.prev = newHead;
        return newHead;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Nodein head = ArrtoDLL(arr);
        head = insertBeforeHead(head , 9);
        print(head);
    }
}

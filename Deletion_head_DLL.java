class Nodehd{
    int data;
    Nodehd next;
    Nodehd prev;

    Nodehd(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Nodehd(int data , Nodehd prev , Nodehd next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class Deletion_head_DLL {
    private static Nodehd ArrtoDLL(int[] arr){
        Nodehd head = new Nodehd(arr[0]);
        Nodehd prev = head;
        for(int i = 1 ; i< arr.length ; i++){
            Nodehd temp = new Nodehd(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(Nodehd head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    private static Nodehd deleteHead(Nodehd head){
        if(head == null || head.next == null) return null;

        Nodehd prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Nodehd head = ArrtoDLL(arr);
        head = deleteHead(head);
        print(head);
    }
}

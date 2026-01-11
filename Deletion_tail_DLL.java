class Nodedt{
    int data;
    Nodedt next;
    Nodedt prev;

    Nodedt(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    Nodedt(int data , Nodedt prev , Nodedt next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}
public class Deletion_tail_DLL {
    private static Nodedt ArrtoDLL(int[] arr){
        Nodedt head = new Nodedt(arr[0]);
        Nodedt prev = head;
        for(int i =1 ; i < arr.length ; i++){
            Nodedt temp = new Nodedt(arr[i],prev,null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Nodedt head){
        while(head != null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    private static Nodedt daleteTail(Nodedt head){
        if(head == null || head.next == null) return null;
        Nodedt tail = head;
        while(tail.next!=null){
           tail = tail.next;
        }
        Nodedt newtail = tail.prev;
        newtail.next = null;
        tail.prev = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Nodedt head = ArrtoDLL(arr);
        head = daleteTail(head);
        print(head);
    }
}

class Nodekth {
    int data;
    Nodekth next;
    Nodekth prev;

    Nodekth(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
    Nodekth(int data , Nodekth prev , Nodekth next){
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
public class Delete_Kth_Element_DLL {
    private static Nodekth ArrtoDLL(int[] arr){
        Nodekth head = new Nodekth(arr[0]);
        Nodekth prev = head;
        for(int i = 1 ; i < arr.length ; i ++){
            Nodekth temp = new Nodekth(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }
    private static void print(Nodekth head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    private static Nodekth deleteHead(Nodekth head){
        if(head == null || head.next == null) return null;

        Nodekth prev = head;
        head = head.next;

        head.prev = null;
        prev.next = null;

        return head;
    }
    private static Nodekth deleteTail(Nodekth head){
        if(head == null || head.next == null) return null;
        Nodekth tail = head;
        while(tail.next!=null){
            tail = tail.next;
        }
        Nodekth newtail = tail.prev;
        newtail.next = null;
        tail.prev = null;
        return head;
    }
    private static Nodekth removekth(Nodekth head , int k){
        if(head == null) return null;
        int cnt = 0;
        Nodekth temp = head;
        while(temp!=null){
            cnt++;
            if(cnt == k) break;
            temp = temp.next;
        }
        Nodekth prev = temp.prev;
        Nodekth front = temp.next;

        if(prev == null && front == null){
            return null;
        }
        if(prev == null){
            return deleteHead(head);
        }
        else if(front == null){
            return deleteTail(head);
        }
        prev.next = front;
        front.prev = prev;
        temp.next = null;
        temp.prev = null;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Nodekth head = ArrtoDLL(arr);
        head = removekth(head , 4);
        print(head);
    }
}

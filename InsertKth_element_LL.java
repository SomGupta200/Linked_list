class Nodek {
    int data;
    Nodek next;

    Nodek(int data) {
        this.data = data;
        this.next = null;
    }

    Nodek(int data, Nodek next) {
        this.data = data;
        this.next = next;
    }
}
public class InsertKth_element_LL {
    private static Nodek ArrtoLL(int[] arr){
        Nodek head = new Nodek(arr[0]);
        Nodek mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Nodek temp = new Nodek(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Nodek head){
        while(head != null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    private static Nodek Insertk(Nodek head ,int ele , int k) {
        if (head == null) {
            if (k == 1) {
                return new Nodek(ele);
            } else {
                System.out.println("Position out of range");
                return head;
            }
        }
        if (k == 1) {
            return new Nodek(ele, head);
        }
        int cnt = 0;
        Nodek temp = head;
        while (temp != null) {
            cnt ++;
            if (cnt == k - 1) {
                Nodek x = new Nodek(ele, temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {3,6,5,8,9,7};
        Nodek head = ArrtoLL(arr);
        head = Insertk(head , 4 , 9);
        print(head);
    }
}

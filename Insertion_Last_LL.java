class Nodelast{
    int data;
    Nodelast next;

    Nodelast(int data){
        this.data = data;
        this.next = null;
    }

    Nodelast(int data , Nodelast next){
        this.data = data;
        this.next = next;
    }
}
public class Insertion_Last_LL {
    private static Nodelast ArrtoLL(int[] arr){
        Nodelast head = new Nodelast(arr[0]);
        Nodelast mover = head;
        for(int i = 1 ; i < arr.length ; i++){
            Nodelast temp = new Nodelast(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static void print(Nodelast head){
        while(head != null) {
            System.out.println(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    private static Nodelast Insertlast(Nodelast head , int val){
        if(head == null) return new Nodelast(val);
        Nodelast temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        Nodelast newNode = new Nodelast(val);
        temp.next = newNode;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        Nodelast head = ArrtoLL(arr);
         head = Insertlast(head , 8);
        print(head);
    }
}

// Insert element before the x(val)

class Nodeval{
    int data;
    Nodeval next;

    Nodeval(int data){
        this.data = data;
        this.next = null;
    }
    Nodeval(int data , Nodeval next){
        this.data = data;
        this.next = next;
    }
}
public class Insert_value {
    private static Nodeval ArrtoLL(int[] arr){
       Nodeval head = new Nodeval(arr[0]);
       Nodeval mover = head;
       for(int i = 1 ; i < arr.length ; i++){
           Nodeval temp = new Nodeval(arr[i]);
           mover.next = temp;
           mover = temp;
       }
       return head;
    }

    private static void print(Nodeval head){
        while(head!=null){
            System.out.print(head.data + "->");
            head = head.next;
        }
        System.out.println("NULL");
    }

    private static Nodeval insertBeforeValue(Nodeval head , int el , int val){
         if(head == null){
            return null;
         }
          if(head.data == val){
              return new Nodeval(el,head);
          }
          Nodeval temp = head;
          while(temp.next!=null){
            if(temp.next.data == val){
                Nodeval x = new Nodeval(el , temp.next);
                temp.next = x;
                break;
            }
            temp = temp.next;
          }
          return head;
    }
    public static void main(String[] args) {
        int[] arr = {2,6,4,8,7,5};
        Nodeval head = ArrtoLL(arr);
        head = insertBeforeValue(head ,100 , 2);
        print(head);
    }
}

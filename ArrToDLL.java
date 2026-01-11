class NodeDLL{
    int data;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    NodeDLL(int data , NodeDLL prev , NodeDLL next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }
}

public class ArrToDLL {
    private static NodeDLL convertArrtoDLL(int[] arr){
        NodeDLL head = new NodeDLL(arr[0]);
        NodeDLL prev = head;
        for(int i = 1 ; i < arr.length ; i++){
            NodeDLL temp = new NodeDLL(arr[i] , prev , null);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    private static void print(NodeDLL head){
        while(head!=null){
            System.out.print(head.data + "<->");
            head = head.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        NodeDLL head = convertArrtoDLL(arr);
        print(head);
    }
}

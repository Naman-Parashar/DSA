package Queue;
class queue{
   private int [] arr;
   private int front;
  private   int rear;
    queue(int size){
        arr = new int[size];
        front = rear = -1;
    }

    private boolean isEmpty(){
        return front==-1;
    }

    private boolean isFull(){
        return rear == arr.length-1;
    }

    public void enQueue(int data){
        if (isEmpty()){
            front = rear = 0;
            arr[rear] = data;
        }
        else if (isFull()){
            System.out.println("Queue is full");
        }
        else {
            rear++;
            arr[rear] = data;
        }
    }

    public  int deQueue(){
        if (isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        else {
            int e = arr[front];
            arr[front]=0;
            front++;
            return e;
        }
    }

    public void display(){
        try {
            for (int i = front; i <= rear; i++) {
                System.out.println(arr[i]);
            }
        }catch (Exception e){

        }
    }

    public int peek(){
        return arr[front];
    }

    public int getRear(){
        return arr[rear];
    }
}
public class QueueByArray {
    public static void main(String[] args) {
        queue q = new queue(5);

        q.enQueue(10);
        q.enQueue(20);
        q.enQueue(30);
        q.enQueue(40);
        q.enQueue(50);


        System.out.println("deleted element = "+ q.deQueue());

        System.out.println(q.peek());

        System.out.println(q.getRear());
        q.display();
    }
}

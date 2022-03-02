package Queue.CircularQueue;
class que{
    int [] arr;
    int front;
    int rear;

    que(int size){
        arr = new int[size];
        front = rear = -1;
    }

    public boolean isEmpty(){
        return front == -1;
    }

    public boolean isFull(){
        return ((rear+1)% arr.length == front);
    }

    public void enQueue(int data){
        if (isEmpty()){
            front = rear = 0;
            arr[rear] = data;
        }
        else if (rear == (arr.length-1)){
            rear = 0;
            arr[rear] = data;
        }
        else {
            rear++;
            arr[rear]= data;
        }
    }

    public int deQueue(){
        if (isEmpty())
            return -1;
        else if (front == rear){
            int a = arr[front];
            front = rear = -1;
            return a;
        }
        else if (front == arr.length-1){
            int a = arr[front];
            front = 0;
            return a;
        }
        else {
            int a  = arr[front];
            front++;
            return a;
        }
    }


}
public class CQueue {
}

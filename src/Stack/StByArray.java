package Stack;

class stsck{
   private  static int[] arr;
    private static int top;

     stsck(int size){
        arr = new int[size];
        top = -1;
    }

    private static boolean isFull(){
         return top == arr.length-1;
    }

    private static boolean isEmpty(){
        return top == -1;
    }

    public static void push(int data){
        if (isFull())
            System.out.println("Stack is full");
        else if (isEmpty()){
            top=0;
            arr[top]= data;
        }
        else {
            top++;
            arr[top] = data;
        }
    }

    public static int pop(){
         if (isEmpty()) {
             return -1;
         }
         else {
             int c = arr[top];
             top--;
             return c;
         }
     }

    public static int peek(){
        return arr[top];
    }

    public static void display() {
        if (isEmpty())
            System.out.println("stack is empty");
        else {
            int c = top;
            while (c >= 0) {
                System.out.println(arr[c]);
                c--;
            }
        }
    }
}

public class StByArray {
    public static void main(String[] args) {
        stsck obj = new stsck(3);
        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println("Deleted Element = "+obj.pop());

        System.out.println(obj.peek());
        obj.display();
    }
}

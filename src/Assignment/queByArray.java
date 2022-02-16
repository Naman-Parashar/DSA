package Assignment;

class queByArray{
    String  arr2[];
    int front, rear;
    public queByArray(int size){
        arr2 = new String[size];
        front = rear =-1;
    }

    public boolean isEmpty(){
        return front==-1;
    }

    public boolean isFull(){
        return rear == arr2.length-1;
    }

    public void enQueue(String  a){
        if (isFull())
            System.out.println("Overflow");

        else if (isEmpty()){
            front = rear =0;
            arr2[rear] = a;
        }

        else {
            rear++;
            arr2[rear]=a;
        }

    }
}


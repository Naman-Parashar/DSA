package Hashing;

public class Hash_Table<t ,y>{
    private hashNode[] bucket;
    private int noOfBucket;   // capacity.
    private int size;   // No. of Key pair in hash table or Number of hash Node

    public Hash_Table(){
        this(10);
    }
    public Hash_Table(int capicity) {
        bucket = new hashNode[capicity];
        this.noOfBucket = capicity;
    }

    public int getSize(){return size;}

    private boolean isEmpty(){return size == 0;}

    private int hashFunction(t key){

        return (int)key % noOfBucket;
    }
    public void put(t key , y value){
        if (key == null || value == key) {
            System.out.println("Null Value/Key Not Allowed ");
            return;
        }
        int bucketIndex = hashFunction(key);
        hashNode<t,y> head = bucket[bucketIndex];

        while (head != null){
            if (head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucket[bucketIndex];

        // insert at beginning.
        hashNode<t,y> n = new hashNode<>(key,value);
        n.next = head;
        bucket[bucketIndex] = n;
    }

    public y get(t key){
        int bucketIndex = hashFunction(key);
        hashNode<t,y> head = bucket[bucketIndex];

        while (head != null){
            if (head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public y remove(t key){
        int bucketlndex = hashFunction(key);
        hashNode<t ,y> head = bucket[bucketlndex];
        hashNode<t,y> previous = null;
        while(head != null) {
            if(head.key.equals(key)) {
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head == null){ return null;}
            size--;
            if(previous != null) {
                previous.next= head.next;
            } else {
                bucket[bucketlndex] = head.next;
            }
            return head.value;
    }
}

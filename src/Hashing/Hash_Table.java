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
        return null;
    }

    public y remove(t key){
        return null;
    }
}

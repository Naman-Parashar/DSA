package Hashing;

public class HashTable_use {
    public static void main(String[] args) {
        Hash_Table<Integer,String> h = new Hash_Table<>(10);
        h.put(5,"Naman");
        h.put(19,"DJ");
        h.put(19,"DJ HJ");
        System.out.println(h.getSize());

        System.out.println(h.get(9));
    }
}

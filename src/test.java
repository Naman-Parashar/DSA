

public class test {
    static int arr[];
    static int last_use_index;
    public test(int size){
        arr = new int[size+1];
        last_use_index = 1;
    }
    // pre order
      public static void traverse(int index){
          if (index > last_use_index) return;
          System.out.println(arr[index]);
          traverse(index*2);
          traverse((index*2) +1);
      }

    public static void insert(int data){
        if (arr.length -1 < last_use_index) return;
        arr[last_use_index] = data;
        last_use_index++;
    }
    public static void main(String[] args) {
        test t = new test(8);
        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);
        insert(60);
        insert(70);

        traverse(1);
    }
}
package Tree;

public class BT_Using_Array {
    static int arr[];
    static int last_use_index;
    public BT_Using_Array(int size){
        arr = new int[size+1];
        last_use_index = 1;
    }

    public static void insertRoot(int value){
        arr[1] = value;
    }

    public static void set_Left(int val, int last_use_index) {
        int t= (last_use_index * 2);

        if (arr[last_use_index] == 0) System.out.println("No parent found cant set child at "+ t);

        else  arr[t] = val;
    }

    public static void set_Right(int val, int last_use_index) {
        int t= (last_use_index * 2) + 1;

        if (arr[last_use_index] == 0) System.out.println("No parent found cant set child at "+ t);

        else  arr[t] = val;
    }

    public static void print_Tree()
    {
        for (int a1:
                arr) {
            if (a1 != 0)
                System.out.print(a1);
            else
                System.out.print("-");
        }
    }

    public static void main(String[] args) {
        BT_Using_Array a = new BT_Using_Array(8);
        insertRoot(10);
        set_Right(30,1);
        set_Left(40,2);
        set_Right(50,2);
        set_Left(90,3);

        print_Tree();

    }
}


/***
 *     // search
 *     public void search(int value){
 *
 *     }
 *
 *     // we will replace the deleted index value with the last_use_index.
 *
 *     public void delete(int value){
 *
 *     .................................................................................
 *    // pre order
 *     public void traverse(int index){
 *         if (index > last_use_index) return;
 *         System.out.println(arr[index]);
 *         traverse(index*2);
 *         traverse((index*2) +1);
 *     }
 *......................................................................................
 *     }
 */
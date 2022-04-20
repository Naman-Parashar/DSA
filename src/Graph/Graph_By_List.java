package Graph;
/*       how to use hash map
 *     HashMap<Integer,Integer> obj = new HashMap<>();
 *         obj.put(1,10);
 *         obj.put(2,20);
 *         obj.put(3,30);
 *         obj.put(4,40);
 *         obj.put(5,50);
 *
 *         for (Map.Entry<Integer,Integer> res:
 *              obj.entrySet()) {
 *             System.out.println(res);
 *
 *
 *              1---------2
 *              |  \      |
 *              |    5    |           "Given GRAPH"
 *              |      \  |
 *              3--------4
 *
 *           vertices     connected with
 *              1  --------> [2,3,5]
 *              2  --------> [1,4]
 *              3  --------> [1,4]
 *              4  --------> [2,3,5]
 *              5  --------> [1,4]
 */

import java.util.LinkedList;
import java.util.Map;

public class Graph_By_List {
    static Map<Integer, LinkedList<Integer>> m;
    public static void addEdge(int val1 , int val2,boolean isBiDirectional){

        LinkedList<Integer> v1Neighbour = m.getOrDefault(val1,new LinkedList<>());
        v1Neighbour.add(val2);
        m.put(val1,v1Neighbour);

        if (isBiDirectional){
            LinkedList<Integer> v2Neighbour = m.getOrDefault(val2,new LinkedList<>());
            v2Neighbour.add(val1);
            m.put(val2,v2Neighbour);
        }
    }
    public static void main(String[] args) {
        addEdge(1,3,true);
        }
    }
// learn spanning tree??
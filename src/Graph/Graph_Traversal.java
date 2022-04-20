package Graph;

import java.util.*;

/*
    There are 2 graph traversal technique-----:

 1)  BFS (Breath First Search)   use: Queue
 2)  DFS (Depth First Search)    use: Stack

 *) SSS P (Single Source Shortest Path)-----:

 1) BFS (Can't use it on weighted graph)
 2) Bellman Ford Algorithm
 3) Dijkstra Algorithm

               1---------2
               |        |
               |        |           "Given GRAPH"
               |        |
               3--------4                connected Graph
               |
               |
               5-------6

       Source = 1   (  LET )

 */
public class Graph_Traversal {

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


    // 1) BFS

    public static void bfsTraversal(int source){
        Queue<Integer> bfs = new LinkedList<>();
        bfs.add(source);

        Set<Integer> s = new HashSet<>();   // to add element we already visited set do not contain duplicate values
        s.add(source);

        while(!bfs.isEmpty()){
            int front = bfs.poll();
            System.out.println(front);
            LinkedList<Integer> neighbour = m.get(front);

            for (int res:
                 neighbour) {
                if (!s.contains(res)){
                    bfs.add(res);
                    s.add(res);
                }
            }

        }

    }

    public static void main(String[] args) {
        addEdge(1,3,true);
        bfsTraversal(1);
    }
}

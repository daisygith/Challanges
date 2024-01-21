package ex13;

public class AdjacentNodes {
    public static boolean adjacent(int[][] graph, int node1, int node2) {


        if(graph[node1][node2] == 1 && graph[node2][node1] == 1){
            return true;
        } else{
            return false;
        }
    }
}

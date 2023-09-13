package org.collections;

public class ShortestPath {
    public void dijkstra(int graph[][], int src){
        int dist[] = new int[5];
        Boolean b[] = new Boolean[5];
        for (int i =0;i<=5;i++){
            dist[i]=Integer.MAX_VALUE;
            b[i] = false;
        }
    }

    public void minDist(int dist[], Boolean b[]){

    }
    public static void main(String[] args) {
        int graph[][] = new int[][]{
                                    {0,4,0,0,7},
                                    {4,0,1,2,0},
                                    {0,1,0,6,0},
                                    {0,2,6,0,0},
                                    {7,0,0,0,0}};

        ShortestPath path = new ShortestPath();
        path.dijkstra(graph,0);

     }
}

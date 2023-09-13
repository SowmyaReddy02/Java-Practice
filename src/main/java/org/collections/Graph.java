package org.collections;
import java.util.*;

public class Graph {
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }

    }

    public void addEdge(int u, int v) {
        adjacencyList.get(v).add(u);
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + " -> ");
            for (int v : adjacencyList.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public Graph reorient() {
        Graph reversedGraph = new Graph(numVertices);
        for (int v = 0; v < numVertices; v++) {
            for (int u : adjacencyList.get(v)) {
                reversedGraph.addEdge(u, v);
            }
        }
        return reversedGraph;
    }
}

class Main {
    public static void main(String[] args) {
        Graph originalGraph = new Graph(4);
        originalGraph.addEdge(0, 1);
        originalGraph.addEdge(1, 2);
        originalGraph.addEdge(2, 3);
        originalGraph.addEdge(3, 0);

        System.out.println("Original Graph:");
        originalGraph.printGraph();

        Graph reversedGraph = originalGraph.reorient();
        System.out.println("\nReversed Graph:");
        reversedGraph.printGraph();
    }
}

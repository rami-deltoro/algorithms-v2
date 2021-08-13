package org.example.depthfirstsearch;

import org.example.graphimpl.Graph;
import org.example.graphimpl.Vertex;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepthFirstSearchTest {

    private DepthFirstSearch depthFirstSearch = new DepthFirstSearch();

    @Test
    void search() {
        final Graph graph = new Graph(true);

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");
        graph.addVertex("I");
        graph.addVertex("J");
        graph.addVertex("K");

        graph.addEdge("A","B");
        graph.addEdge("B","E");
        graph.addEdge("B","F");
        graph.addEdge("F","I");
        graph.addEdge("F","J");
        graph.addEdge("A","C");
        graph.addEdge("A","D");
        graph.addEdge("D","G");
        graph.addEdge("G","K");
        graph.addEdge("D","H");


        List<String> labels = depthFirstSearch.search(graph,new Vertex("A"));

        System.out.println("labels="+labels);




    }
}
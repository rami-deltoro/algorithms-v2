package org.example.breathfirst;

import org.example.graphimpl.Graph;
import org.example.graphimpl.Vertex;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
O(V+E) time
O(V) Space
 */
public class BFS {


    public List<String> bfs(Vertex vertex,Graph graph) {

        final List<String> nodeNames = new ArrayList<>();

        Deque<Vertex> vertexDeque = new ArrayDeque<>();
        vertexDeque.push(vertex);

        while (!vertexDeque.isEmpty()) {
            Vertex currentVertex = vertexDeque.pop();
            nodeNames.add(currentVertex.getLabel());

            for(Vertex vertex1 : graph.getAdjVertices(currentVertex.getLabel())) {
                vertexDeque.push(vertex1);
            }
        }

        return nodeNames;
    }
}

package org.algo.depthfirstsearch;

import org.algo.graphimpl.Graph;
import org.algo.graphimpl.Vertex;

import java.util.ArrayList;
import java.util.List;

/*
 Time O(V+E)
 Space O(V)

 */
public class DepthFirstSearch {



    public List<String> search(final Graph graph,final Vertex vertex) {
        final List<String> labels = new ArrayList<>();
        searchHelper(graph,vertex,labels);
        return labels;
    }

    private void searchHelper(final Graph graph,final Vertex vertex, List<String> labels) {
        labels.add(vertex.getLabel());
        final List<Vertex> children = graph.getAdjVertices(vertex.getLabel());

        for(Vertex child : children) {
            searchHelper(graph,child,labels);
        }
    }
}

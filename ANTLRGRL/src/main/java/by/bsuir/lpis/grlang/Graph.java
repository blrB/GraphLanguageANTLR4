package by.bsuir.lpis.grlang;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<Vertex> vertices = new ArrayList<>();
    private List<Edge> edges = new ArrayList<>();
    private String name;

    public Graph(String name) {
        this.name = name;
    }

    public List<Vertex> getVertices() {
        return vertices;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public String toString() {
        return "Graph{" +
                "name='" + name +
                ", edges=" + edges +
                ", vertices=" + vertices + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Graph graph = (Graph) o;

        if (vertices != null ? !vertices.equals(graph.vertices) : graph.vertices != null) return false;
        return edges != null ? edges.equals(graph.edges) : graph.edges == null;
    }

    public int hashCode() {
        int result = vertices != null ? vertices.hashCode() : 0;
        result = 31 * result + (edges != null ? edges.hashCode() : 0);
        return result;
    }

    public List<Vertex> getAdjacencyVertices(Vertex vertex){
        List<Vertex> vertices = new ArrayList<>();
        for (Edge edge : edges){
            if (edge.haveAdjacencyVertex(vertex)){
                vertices.add(edge.getSecondVertex(vertex));
            }
        }
        return vertices;
    }

    public Graph add(Vertex vertex){
        if (!contain(vertex)) {
            vertices.add(vertex);
        }
        return this;
    }

    public Graph add(Edge edge){
        if (!contain(edge)){
            edges.add(edge);
        }
        if (!contain(edge.getSource())){
            vertices.add(edge.getSource());
        }
        if (!contain(edge.getTarget())){
            vertices.add(edge.getTarget());
        }
        return this;
    }

    public Graph add(Graph graph){
        for (Vertex vertex: graph.getVertices()){
            add(vertex);
        }
        for (Edge edge: graph.getEdges()){
            add(edge);
        }
        return this;
    }

    public Graph remove(Vertex vertex){
        vertices.remove(vertex);
        getEdges().removeIf(edge -> edge.haveAdjacencyVertex(vertex));
        return this;
    }

    public Graph remove(Edge edge){
        edges.remove(edge);
        return this;
    }

    public Graph remove(Graph graph){
        getVertices().removeAll(getVertices());
        getEdges().removeAll(graph.getEdges());
        return this;
    }

    public boolean contain(Vertex vertex){
        return vertices.contains(vertex);
    }

    public boolean contain(Edge edge){
        return edges.contains(edge);
    }

    public boolean contain(Graph graph){
        return vertices.containsAll(graph.getVertices()) && edges.containsAll(graph.getEdges());
    }

}

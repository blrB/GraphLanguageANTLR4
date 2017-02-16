package by.bsuir.lpis.grlang;

import java.util.ArrayList;
import java.util.List;

public class Edge implements Id{

    private Vertex source;
    private Vertex target;

    public Edge(Vertex source, Vertex target) {
        this.source = source;
        this.target = target;
    }

    @Override
    public List<Vertex> getVertices(){
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(source);
        vertices.add(target);
        return vertices;
    }

    @Override
    public List<Edge> getEdges(){
        List<Edge> edges = new ArrayList<>();
        edges.add(this);
        return edges;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", target=" + target +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Edge edge = (Edge) o;

        if (source != null ? !source.equals(edge.source) : edge.source != null) return false;
        return target != null ? target.equals(edge.target) : edge.target == null;
    }

    @Override
    public int hashCode() {
        int result = source != null ? source.hashCode() : 0;
        result = 31 * result + (target != null ? target.hashCode() : 0);
        return result;
    }

    public boolean haveAdjacencyVertex(Vertex vertex){
        return source.equals(vertex) || target.equals(vertex);
    }

    public Vertex getSecondVertex(Vertex vertex) {
        return (source.equals(vertex)) ? target : source;
    }

    public Vertex getSource() {
        return source;
    }

    public Vertex getTarget() {
        return target;
    }
}

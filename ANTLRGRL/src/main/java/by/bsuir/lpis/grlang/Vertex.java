package by.bsuir.lpis.grlang;

import java.util.ArrayList;
import java.util.List;

public class Vertex {

    private String name;

    public Vertex(String name) {
        this.name = name;
    }

    public List<Vertex> getVertices() {
        List<Vertex> vertices = new ArrayList<>();
        vertices.add(this);
        return vertices;
    }

    public List<Edge> getEdges() {
        return null;
    }

    public String toString() {
        return "Vertex{" +
                "name='" + name + '\'' +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vertex vertex = (Vertex) o;

        return name != null ? name.equals(vertex.name) : vertex.name == null;
    }

    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    public String getName() {
        return name;
    }
}

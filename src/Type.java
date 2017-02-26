public enum Type {
    GRAPH("Graph"),
    VERTEX("Vertex"),
    EDGE("Edge"),
    VOID("void");

    private String type;

    Type(String type){
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }

    static Type getTypeByString(String type){
        switch (type){
            case "Vertex":
                return VERTEX;
            case "Edge":
                return EDGE;
            case "Graph":
                return GRAPH;
            default:
                return VOID;
        }
    }
}
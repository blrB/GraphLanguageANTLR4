// program Dfs_gr Wed Feb 22 13:13:20 MSK 2017
package by.bsuir.lpis.grlang;
public class Main {
static Graph dfsTree = new Graph("Dfs Tree Graph");
static Graph used = new Graph("Used vertex");
private static Graph createGraph(){
Graph gr = new Graph("test graph");
Vertex v1 = new Vertex("v1");
Vertex v2 = new Vertex("v2");
Vertex v3 = new Vertex("v3");
Vertex v4 = new Vertex("v4");
Edge e1 = new Edge(v1, v2);
Edge e2 = new Edge(v2, v3);
Edge e3 = new Edge(v3, v4);
gr.add(e1).add(e2).add(e3);
return gr;
}
private static void dfs(Graph g, Vertex v){
used.add(v);
for (Vertex to : g.getAdjacencyVertices(v)){
if (!used.contain(to)){
Edge e = new Edge(v, to);
System.out.println("Go from " + v + " to " + to);
dfsTree.add(e);
dfs(g, to);
}
}
}
public static void main(String[]args) throws Exception{
System.out.println("DFS START");
Graph gr = createGraph();
Vertex v3 = new Vertex("v3");
dfs(gr, v3);
System.out.println("DFS FINISH");
}
}

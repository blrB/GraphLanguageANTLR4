# **Graph Language** 

Graph Language with ANTLR-4.6 for laboratory work 

## Getting Started with ANTLR v4

```sh

$ cd /usr/local/lib
$ sudo curl -O http://www.antlr.org/download/antlr-4.6-complete.jar
$ export CLASSPATH=".:/usr/local/lib/antlr-4.6-complete.jar:$CLASSPATH"
$ alias antlr4='java -jar /usr/local/lib/antlr-4.6-complete.jar'
$ alias grun='java org.antlr.v4.gui.TestRig'

```

http://www.antlr.org/

## Code generation

```sh

$ cd GraphLanguageANTLR4
$ antlr4 -visitor -no-listener -lib src src/GraphExpr.g4 

```

or use [ANTLR v4 grammars plugin](https://github.com/antlr/intellij-plugin-v4) for Intellij and other Jetbrains IDEs

## Examle:

```sh

graph dfsTree = "Dfs Tree Graph"
graph used = "Used vertex"

main {
    print "DFS START"
    graph gr = createGraph()
    vertex v3 = "v3"
    dfs(gr, v3)
    print "DFS FINISH"
}

fn graph createGraph(){
    graph gr = "test graph"
    vertex v1 = "v1"
    vertex v2 = "v2"
    vertex v3 = "v3"
    vertex v4 = "v4"
    edge e1 = <v1,v2>
    edge e2 = <v2,v3>
    edge e3 = <v3,v4>
    gr <- e1, e2, e3
    return gr
}

fn dfs(graph g, vertex v){
    used <- v
    forEach(vertex to in v in g){
        if (! used <?> to){
            edge e = <v,to>
            print "Go from " + v + " to " + to
            dfsTree <- e
            dfs(g, to)
        }
    }
}

```

## Output:

```sh

DFS START
Go from Vertex{name='v3'} to Vertex{name='v2'}
Go from Vertex{name='v2'} to Vertex{name='v1'}
Go from Vertex{name='v3'} to Vertex{name='v4'}
DFS FINISH

```

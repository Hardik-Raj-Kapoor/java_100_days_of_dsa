package graphs;

class DFSrecursive{
    class DFS_graph{
        int vertices;
        int[][] adjmatrix;

        DFS_graph(int v){
            vertices = v;
            adjmatrix = new int[v][v];
        }
        
        public void add_edge(int src,int dest){
            adjmatrix[src][dest] = 1;
            adjmatrix[dest][src] = 1;            
        }
        public void dfs(int start, boolean[] visited){
            visited[start] = true;
            System.out.print(start + " ");

            for(int i = 0; i<vertices; i++) if(adjmatrix[start][i] == 1 && !visited[i]) dfs(i,visited);
        }
    }
}

public class day_82_recursive_DFS {
    public static void main(String[] args) {
        DFSrecursive dfs = new DFSrecursive();
        DFSrecursive.DFS_graph graph = dfs.new DFS_graph(6);
        graph.add_edge(0, 1);
        graph.add_edge(0, 2);
        graph.add_edge(1, 3);
        graph.add_edge(2, 4);
        graph.add_edge(3, 5);

        boolean[] visited = new boolean[6];
        System.out.println("DFS Recursive Traversal: ");
        graph.dfs(0, visited);
    }
}

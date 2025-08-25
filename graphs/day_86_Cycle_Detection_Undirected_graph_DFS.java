package graphs;
import java.util.Scanner;

class UG_Cycle_DFS{
    private int V;
    private int[][] adj;
    private boolean[] visited;

    public UG_Cycle_DFS(int V){
        this.V = V;
        adj = new int[V][V];
        visited = new boolean[V];
    }

    void add_edge(int u,int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    boolean isCycle(){
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,-1)){
                    return true;
                }
            }
        }
        return false;
    }

    boolean dfs(int node,int parent){
        visited[node] = true;
        for(int neighbor = 0;neighbor<V;neighbor++){
            if(adj[node][neighbor] == 1){
                if(!visited[neighbor]){
                    if(dfs(neighbor,node)){
                        return true;
                    }
                }
                else if(neighbor !=parent) return true;
            }
        }
        return false;
    }
}


public class day_86_Cycle_Detection_Undirected_graph_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        UG_Cycle_DFS graph = new UG_Cycle_DFS(V);

        System.out.println("Enter " + E + " edges (u v):");
        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.add_edge(u-1, v-1);
        }

        if (graph.isCycle()) System.out.println("Graph contains a cycle.");
        else System.out.println("Graph does not contain a cycle.");

        sc.close();
    }
}

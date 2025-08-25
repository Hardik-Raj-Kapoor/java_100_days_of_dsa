package graphs;
import java.util.Scanner;

class DG_Cycle_DFS{
    private int V;
    private int[][] adj;
    private boolean[] visited;
    private boolean[] recStack;

    public DG_Cycle_DFS(int V){
        this.V = V;
        adj = new int[V][V];
        visited = new boolean[V];
        recStack = new boolean[V];
    }

    public void add_edge(int u,int v){
        adj[u][v] = 1;
    }

    boolean isCycle(){
        for(int i = 0;i<V;i++){
            if(!visited[i]){
                if(dfs(i)) return true;
            }
        }
    return false;
    }
    
    boolean dfs(int node){
        visited[node] = true;
        recStack[node] = true;

        for(int neighbor = 0;neighbor<V; neighbor++){
            if(adj[node][neighbor] == 1){
                if(!visited[neighbor]){
                    if(dfs(neighbor)) return true;
                }
                else if(recStack[neighbor]) return true;
            }
        }
        recStack[node] = false; 
        return false;
    }
}

public class day_86_Cycle_Detection_Directed_graph_DFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        DG_Cycle_DFS graph = new DG_Cycle_DFS(V);

        System.out.println("Enter " + E + " directed edges (u v):");
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

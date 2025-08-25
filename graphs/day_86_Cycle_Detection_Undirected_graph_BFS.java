package graphs;
import java.util.Scanner;

class UG_BFS_Queue{
    private int[] q;
    private int front,rear,size;
    UG_BFS_Queue(int capacity){
        q = new int[capacity];
        front = 0 ;
        rear = -1;
        size = 0;
    }

    public void enqueue(int val){
        rear = (rear+1)%q.length;
        q[rear] = val;
        size++;
    }

    public int dequeue(){
        int val = q[front];
        front = (front+1)%q.length;
        size--;
        return val;
    }

    public boolean isEmpty(){
        return size == 0;
    }
}

class UG_Cycle_BFS{
    private int V;
    private int[][] adj;
    private boolean[] visited;

    public UG_Cycle_BFS(int V){
        this.V = V;
        adj = new int[V][V];
        visited = new boolean[V];
    }

    void add_edge(int u, int v){
        adj[u][v] = 1;
        adj[v][u] = 1;
    }

    boolean isCycle(){
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(i)) return true;
            }
        }
        return false;
    }

    public boolean bfs(int start){
        UG_BFS_Queue q = new UG_BFS_Queue(V*V);
        int[] parent = new int[V];
        for(int i=0;i<V;i++) parent[i] = -1;
        
         visited[start] = true;
         q.enqueue(start);

         while(!q.isEmpty()){
            int node = q.dequeue();

            for(int neighbor = 0;neighbor<V;neighbor++){
                if(adj[node][neighbor] == 1){
                    if(!visited[neighbor]){
                        visited[neighbor] = true;
                        parent[neighbor] = node;
                        q.enqueue(neighbor);
                    }
                    else if(parent[node]!= neighbor){
                        return true;
                    }
                }
            }
         }
        
        return false;
    }

}
public class day_86_Cycle_Detection_Undirected_graph_BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        UG_Cycle_BFS graph = new UG_Cycle_BFS(V);

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


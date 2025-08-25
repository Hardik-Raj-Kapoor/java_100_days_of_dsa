package graphs;
import java.util.Scanner;

class DG_Kahn_Queue{
    private int[] q;
    private int front,rear,size;

    public DG_Kahn_Queue(int capacity){
        q = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void enqueue(int val){
        rear = (rear+1) % q.length;
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

class DG_Cycle_Kahn{
    private int V;
    private int[][] adj;

    public DG_Cycle_Kahn(int V){
        this.V = V;
        adj = new int[V][V];
    }

    void add_edge(int u, int v){
        adj[u][v] = 1;
    }

    boolean isCycle(){
        int[] inDegree = new int[V];
        for(int u = 0;u<V;u++){
            for(int v= 0;v<V;v++){
                if(adj[u][v] == 1)  inDegree[v]++;
            }
        }

        DG_Kahn_Queue q = new DG_Kahn_Queue(V);
        for(int i=0;i<V;i++){
            if(inDegree[i] == 0) q.enqueue(i);
        }

        int count = 0;
        while(!q.isEmpty()){
            int node = q.dequeue();
            count++;

            for(int neighbor =0;neighbor<V;neighbor++){
                if(adj[node][neighbor] == 1){
                    inDegree[neighbor]--;
                    if(inDegree[neighbor] == 0){
                        q.enqueue(neighbor);
                    }
                } 
            }
        }
        return count !=V;
    }
}

public class day_86_Cycle_Detection_Directed_graph_Kahn_s_algorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();

        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();

        DG_Cycle_Kahn graph = new DG_Cycle_Kahn(V);

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

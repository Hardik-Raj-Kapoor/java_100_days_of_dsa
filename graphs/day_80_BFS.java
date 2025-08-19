package graphs;
class BFS_graph{
    private int vertices;
    private int[] head;
    private int[] next;
    private int[] to;
    private int edge_count;

    //for BFS
    private boolean[] visited;
    private int[] queue;
    private int front,rear;

    public BFS_graph(int v, int max_edge){
        vertices = v;
        head = new int[v];
        next = new int[max_edge];
        to = new int[max_edge];
        
        
        visited = new boolean[v];
        queue = new int[v];
        front = 0;
        rear = 0;

        for(int i=0;i<v;i++){
            head[i] = -1;
        }
    }

    public void add_edge(int u, int v){
        to[edge_count] = v;
        next[edge_count] = head[u];
        head[u] = edge_count++;
    }

    private void enqueue(int x){
        queue[rear] = x;
        rear = rear+1;
    }

    private int dequeue(){
        return queue[front++];
    }

    private boolean isEmpty(){
        return front == rear;
    }

    public void BFS(int start){
        for(int i = 0;i< vertices;i++) visited[i] = false;
        front = rear = 0;
        visited[start] = true;
        enqueue(start);
        while (!isEmpty()){
            int u = dequeue();
            System.out.print(u+" ");
            for(int i = head[u];i != -1;i = next[i]){
                int v = to[i];
                if(!visited[v]){
                    visited[v] = true;
                    enqueue(v);
                }
            }
        }
    }
}

public class day_80_BFS {
    public static void main(String[] args) {
        int v = 6;
        int E = 7;

        BFS_graph g = new BFS_graph(v, 2*E);

        g.add_edge(1, 0);
        g.add_edge(0, 1);
        g.add_edge(0, 2);
        g.add_edge(2, 0);
        g.add_edge(1, 3);
        g.add_edge(3, 1);
        g.add_edge(1, 4);
        g.add_edge(4, 1);
        g.add_edge(2, 5);
        g.add_edge(5, 2);

        System.out.println("BFS starting from vertex 0:");
        g.BFS(0);
    }
}

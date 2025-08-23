package graphs;

class con_BFS_graph{
    int vertices;
    int[][] adjmatrix;

    con_BFS_graph(int v){
        vertices = v;
        adjmatrix = new int[v][v];
    }

    void add_edge(int src, int dest){
        adjmatrix[src][dest] = 1;
        adjmatrix[dest][src] = 1;
    }

    void BFS(int start, boolean[] visited, int[] component, int[] index){
        int[] queue = new int[vertices];
        int front = 0, rear = 0;
        queue[rear++] = start;
        visited[start] = true;

        while(front < rear){
            int node = queue[front++];
            component[index[0]++] = node;

            for(int i = 0; i < vertices; i++){
                if(adjmatrix[node][i] == 1 && !visited[i]){
                    queue[rear++] = i;
                    visited[i] = true;
                }
            }
        }
    }

    void connectedComponentsBFS(){
        boolean[] visited = new boolean[vertices];

        for(int v = 0; v < vertices; v++){
            if (!visited[v]) {
                int[] component = new int[vertices];
                int[] index = {0};
                BFS(v, visited, component, index);
                System.out.print("Component: ");
                for (int i = 0; i < index[0]; i++) System.out.print(component[i] + " ");
                System.out.println();
            }
        }
    }
}

public class day_84_BFS_connected_components{
    public static void main(String[] args) {
        con_BFS_graph g = new con_BFS_graph(6);

        g.add_edge(0, 1);
        g.add_edge(0, 2);
        g.add_edge(3, 4);

        g.connectedComponentsBFS();
    }
}

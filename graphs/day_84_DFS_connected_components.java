package graphs;

class con_DFS_graph{
    int vertices;
    int[][] adjmatrix;

    con_DFS_graph(int v){
        vertices = v;
        adjmatrix = new int[v][v];
    }

    void add_edge(int src,int dest){
        adjmatrix[src][dest] = 1;
        adjmatrix[dest][src] = 1;
    }

    void DFS(int start,boolean[] visited,int[] components,int[] index){
        int[] stack = new int[vertices];
        int top = -1;
        stack[++top] = start;
        visited[start] = true;
        while (top != -1){
            int node = stack[top--];
            components[index[0]++] = node;

            for (int i = 0; i<vertices; i++){
                if(adjmatrix[node][i] == 1 && !visited[i]){
                    stack[++top] = i;
                    visited[i] = true;
                }
            }
        }
    }

    void connectedComponentsDFS(){
        boolean[] visited = new boolean[vertices];

        for(int v = 0; v < vertices; v++){
            if (!visited[v]){
                int[] component = new int[vertices];
                int[] index = {0};
                DFS(v, visited, component, index);
                System.out.print("Component: ");
                for (int i = 0; i < index[0]; i++) System.out.print(component[i] + " ");
                System.out.println();
            }
        }
    }
}

public class day_84_DFS_connected_components{
    public static void main(String[] args){
        con_DFS_graph g = new con_DFS_graph(6);
        g.add_edge(0, 1);
        g.add_edge(0, 2);
        g.add_edge(3, 4);
        g.connectedComponentsDFS();
    }
}

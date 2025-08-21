package graphs;

class DFSiterative{
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

        class stack{
            int[] stack;
            int top;
            int size;
        
            stack(int capacity){
                stack = new int[capacity];
                top = -1;
                size = capacity;
            }

            public void push(int val){
                if(top == size - 1){
                    System.out.println("Stack Overflow");
                    return;
                }
                top = top + 1;
                stack[top] = val;
            }

            public int pop(){
                if(top == -1){
                    System.out.println("Stack Underflow");
                    return -1;
                }
                return stack[top--];
            }

            boolean isEmpty(){
                return top == -1;
            }

        }
        void dfs(int start){
            boolean[] visited = new boolean[vertices];
            stack s = new stack(vertices);
            s.push(start);

            while(!s.isEmpty()){
                int node = s.pop();

                if(!visited[node]){
                    visited[node] = true;
                    System.out.println(node + " ");
                }

                for(int i = vertices - 1; i>=0;i--){
                    if (adjmatrix[node][i] == 1 && !visited[i]) {
                        s.push(i);
                    }
                }                    
            }
        }
    }
}

public class day_82_iterative_DFS {
    public static void main(String[] args) {
         DFSiterative dfsObj = new DFSiterative();
        DFSiterative.DFS_graph graph = dfsObj.new DFS_graph(6);

        // Add edges
        graph.add_edge(0, 1);
        graph.add_edge(0, 2);
        graph.add_edge(1, 3);
        graph.add_edge(2, 4);
        graph.add_edge(3, 5);

        System.out.println("Iterative DFS starting from node 0:");
        graph.dfs(0);
    }
}

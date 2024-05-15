import java.util.LinkedList;
public class BFS {

    // Farben (0: weiß, 1: grau, 2: schwarz)
    private int[] col;

    // Distanzen vom Startknoten
    private int[] dis;

    // Vorgänger im Breitensuchbaum
    private int[] pre;

    public void search(Graph graph, int s) {

        // Knoten initialisieren
        col = new int[graph.getNodeCount()];
        dis = new int[graph.getNodeCount()];
        pre = new int[graph.getNodeCount()];

        for (int v = 0; v < graph.getNodeCount(); v++) {
            col[v] = 0;                         // Weiß färben
            dis[v] = Integer.MAX_VALUE;         // Distanz unendlich
            pre[v] = -1;                        // Vorgänger -1

            // Startknoten initialisieren


        }

        col[s] = 1;
        dis[s] = 0;


        //FIFO Queue
        LinkedList<Integer> queue = new LinkedList<Integer>();

        //add start node to queue
        queue.addFirst(s);

        while(!queue.isEmpty()) {
            int u = queue.removeLast();

            // all outgoing edges (u,v)
            for(int v : graph.getList(u)) {
                if(col[v] == 0) {           // Next node still white ?
                    col[v] = 1;             // color it gray
                    dis[v] = dis[u] + 1;    // compute distance
                    pre[v] = u;             // remember predecessor
                    queue.addFirst(v);      // add Next to queue
                }
            }
            col[u] = 2;    // color it black
        }


    }

}

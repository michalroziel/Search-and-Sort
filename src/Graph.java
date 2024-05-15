import java.util.List;
public interface Graph {

/**
 * Returns the number of nodes in the graph.
 *
 * @return The total number of nodes present in the graph.
 */
public int getNodeCount();

/**
 * Returns the number of edges in the graph.
 *
 * @return The total number of edges present in the graph.
 */
public int getEdgeCount();

/**
 * Returns a list of integers related to the node 'u'.
 *
 * @param u The node for which the list is to be returned.
 * @return A list of integers related to the node 'u'.
 */
public List<Integer> getList(int u);


/**
 * Checks if an edge exists between two nodes 'u' and 'v'.
 *
 * @param u The first node of the edge.
 * @param v The second node of the edge.
 * @return True if an edge exists between 'u' and 'v', false otherwise.
 */
public boolean containsEdge(int u, int v);


/**
 * Adds an edge between two nodes 'u' and 'v'.
 *
 * @param u The first node of the edge.
 * @param v The second node of the edge.
 */
public void addEdge(int u, int v);



/**
 * Removes an edge between two nodes 'u' and 'v'.
 *
 * @param u The first node of the edge.
 * @param v The second node of the edge.
 */
public void removeEdge(int u, int v);




}

import java.util.List;

public class GraphAL implements Graph{
    @Override
    public int getNodeCount() {
        return 0;
    }

    @Override
    public int getEdgeCount() {
        return 0;
    }

    @Override
    public List<Integer> getList(int u) {
        return List.of();
    }

    @Override
    public boolean containsEdge(int u, int v) {
        return false;
    }

    @Override
    public void addEdge(int u, int v) {

    }

    @Override
    public void removeEdge(int u, int v) {

    }
}

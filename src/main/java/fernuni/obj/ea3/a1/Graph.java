package fernuni.obj.ea3.a1;

public class Graph {
	protected boolean[][] adjacencyMatrix;
	protected String[] nodes;

	protected int indexOf(String node) throws GraphException {
		for (int i = 0; i < nodes.length; i++) {
			if (node.equals(nodes[i])) {
				return i;
			}
		}
		throw new GraphException();
	}

	public Graph(int nodeNumber) {
		nodes = new String[nodeNumber];
		adjacencyMatrix = new boolean[nodeNumber][nodeNumber];
	}

	public Graph(String[] nodes) {
		this(nodes.length);
		for (int i = 0; i < nodes.length; i++) {
			this.nodes[i] = nodes[i];
		}
	}

	public String getNode(int index) throws GraphException {
		return null;
		// ...liefert den Namen des Knotens an der
		// durch den Wert des Parameters bezeichneten Position,
		// wenn diese einen Knoten bezeichnet; sonst eine GraphException.
	}

	public int getNumberOfNodes() {
		return 0;
		// ...liefert die Anzahl der Knoten zurueck.
	}

	public void setNodes(String[] nodes) {
		// ...weist den ersten k Elementen des Attributs nodes die
		// entsprechenden Werte des Parameters nodes zu. k ist dabei das
		// Minimum aus der Laenge des Attributs und des Parameters.
	}

	public boolean isAdjacent(int index1, int index2) throws GraphException {
		return false;
		// ...liefert "wahr", wenn die Knoten mit Index
		// index1 und index2 benachbart sind, sonst "falsch".
	}

	public boolean isAdjacent(String node1, String node2) throws GraphException {
		return false;
		// ...liefert "wahr", wenn die Laender mit Namen
		// node1 und node2 benachbart sind, sonst "falsch".
	}

	public void addEdge(int index1, int index2) throws GraphException {
		// ...fuegt Kante zwischen den Knoten mit
		// Index index1 und index2 ein, wenn diese
		// Indizes von Laendern sind; sonst eine GraphException.
	}

	public void addEdge(String node1, String node2) throws GraphException {
		// ...fuegt Kante zwischen den Knoten mit
		// Laendernamen node1 und node2 ein, wenn diese
		// Knoten des Graphen bezeichnen; sonst eine GraphException.
	}
}
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
        // ...liefert den Namen des Knotens an der
        // durch den Wert des Parameters bezeichneten Position,
        // wenn diese einen Knoten bezeichnet; sonst eine GraphException.
        
        //check if index to height
        if (index > (this.nodes.length-1)) {
            throw new GraphException();
        }
        
        //check if index to low
        if (index < 0) {
        	throw new GraphException();
        }

        //check if position is null or empty String
        String foundNode = this.nodes[index]; 
        if (foundNode == null) {
            throw new GraphException();
        }
        
        //check if String is empty
        if (foundNode.trim().isEmpty()) {
        	throw new GraphException();
        }
        
        //return the name
        return this.nodes[index];
        
    }

    public int getNumberOfNodes() {
        // ...liefert die Anzahl der Knoten zurueck.
        return nodes.length;
    }

    public void setNodes(String[] nodes) {
        // ...weist den ersten k Elementen des Attributs nodes die
        // entsprechenden Werte des Parameters nodes zu. k ist dabei das
        // Minimum aus der Laenge des Attributs und des Parameters.
        
        //check the minimum of both arrays
        int attributeLength = this.nodes.length;
        int parameterLength = nodes.length;
        int k = 0;
        
        //get the minimum
        if (attributeLength > parameterLength) {
        	k = parameterLength;
        } else {
        	k = attributeLength;
        }
        
        for (int i = 0; i < k; i++) {
            this.nodes[i] = nodes[i];
        }
        
    }

    public boolean isAdjacent(int index1, int index2) throws GraphException {
        // ...liefert "wahr", wenn die Knoten mit Index
        // index1 und index2 benachbart sind, sonst "falsch".
        
        try {
            return this.adjacencyMatrix[index1][index2] && this.adjacencyMatrix[index2][index1];
        } catch(ArrayIndexOutOfBoundsException e) {
            throw new GraphException();
        }
        
    }

    public boolean isAdjacent(String node1, String node2) throws GraphException {
        // ...liefert "wahr", wenn die Laender mit Namen
        // node1 und node2 benachbart sind, sonst "falsch".
        if (node1 == null || node2 == null) {
            throw new GraphException();
        }
        
        int index1 = this.indexOf(node1);
        int index2 = this.indexOf(node2);
        
        return isAdjacent(index1, index2);
    }

    public void addEdge(int index1, int index2) throws GraphException {
        // ...fuegt Kante zwischen den Knoten mit
        // Index index1 und index2 ein, wenn diese
        // Indizes von Laendern sind; sonst eine GraphException.
                
        //over the array bounds
        if (index1 >= this.nodes.length || index2 >= this.nodes.length) {
            throw new GraphException();
        }
        if (index1 < 0 || index2 < 0) {
            throw new GraphException();
        }
        
        //if indizes are no countries
        if (this.nodes[index1] == null || this.nodes[index2] == null) {
        	throw new GraphException();
        }
        
        this.adjacencyMatrix[index1][index2] = true;
        this.adjacencyMatrix[index2][index1] = true;
    }

    public void addEdge(String node1, String node2) throws GraphException {
        // ...fuegt Kante zwischen den Knoten mit
        // Laendernamen node1 und node2 ein, wenn diese
        // Knoten des Graphen bezeichnen; sonst eine GraphException.
        
        if (node1 == null || node2 == null) {
            throw new GraphException();
        }
        
        int index1 = this.indexOf(node1);
        int index2 = this.indexOf(node2);
        
        this.addEdge(index1, index2);
    }
}
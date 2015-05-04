package fernuni.obj.ea3.a1;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class GraphTest {
    
    private String[] nodes;
    
    @Before
    public void init() {      
        nodes = new String[20];
        nodes[0] = "Deutschland";
        nodes[1] = "Schweiz";
        nodes[2] = "Oesterreich";
        nodes[3] = "China";
        nodes[4] = "Japan";
        nodes[5] = "Daenemark";
    }
    
    @Test
    public void testFillGraph() throws GraphException {
        
        Graph graph = new Graph(20);        
        graph.setNodes(nodes);
        //graph.no
        
        graph.addEdge(0, 1);
        graph.addEdge("Daenemark", "Deutschland");
        
        
        assertTrue(graph.isAdjacent(0,5));
        assertTrue(graph.isAdjacent(5,0));

        assertFalse(graph.isAdjacent(1,3));
        assertFalse(graph.isAdjacent(3,1));
        
        assertTrue(graph.isAdjacent("Deutschland","Schweiz"));
        assertTrue(graph.isAdjacent("Schweiz","Deutschland"));
    }
    
    @Test(expected=GraphException.class)
    public void raiseError() throws GraphException {
        Graph graph = new Graph(20);
        graph.setNodes(nodes);
        
        graph.isAdjacent(20,21);
    }
    
    @Test(expected=GraphException.class)
    public void raiseErrorBecauseOfNotACountry() throws GraphException {
        Graph graph = new Graph(20);
        graph.setNodes(nodes);
        
        graph.isAdjacent("not a country","Schweiz");
    }
    
    @Test(expected=GraphException.class)
    public void raiseErrorbecauseOfNullValue() throws GraphException {
        Graph graph = new Graph(20);
        graph.setNodes(nodes);
        
        graph.isAdjacent("Schweiz", null);
    }
    
}


package fernuni.obj.ea2.a5;

import org.junit.Test;

import fernuni.obj.ea2.a5.BinaryNode;

public class TestTree {
    
    public static void main(String[] args) {
        BinaryNode myTree = new BinaryNode(6);
        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(10);
        myTree.inorder();
    }
    
    @Test
    public void testMyTree() {
        BinaryNode myTree = new BinaryNode(6);
        myTree.insert(5);
        myTree.insert(4);
        myTree.insert(12);
        myTree.insert(11);
        myTree.insert(10);
        myTree.inorder();
    }
}

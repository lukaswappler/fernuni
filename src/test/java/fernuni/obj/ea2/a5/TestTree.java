package fernuni.obj.ea2.a5;

import org.junit.Test;

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
    
    @Test
    public void testMyTreeChars() {
    	BinaryNodeString myTree = new BinaryNodeString("k");
    	myTree.leftSon = new BinaryNodeString("q");
    	myTree.rightSon = new BinaryNodeString("r");
        
    	myTree.leftSon.leftSon = new BinaryNodeString("g");
    	myTree.leftSon.rightSon = new BinaryNodeString("e");
    	
    	myTree.rightSon.leftSon = new BinaryNodeString("i");
    	myTree.rightSon.rightSon  = new BinaryNodeString("y");
    	
    	myTree.leftSon.rightSon.leftSon = new BinaryNodeString("b");
    	myTree.leftSon.rightSon.rightSon = new BinaryNodeString("x");
    	
    	
    	myTree.leftSon.leftSon.leftSon = new BinaryNodeString("p");
    	myTree.leftSon.leftSon.rightSon = new BinaryNodeString("l");
    	
    	myTree.rightSon.leftSon.leftSon = new BinaryNodeString("m");
    	myTree.rightSon.leftSon.rightSon = new BinaryNodeString("f");
    	
    	myTree.rightSon.rightSon.leftSon  = new BinaryNodeString("t");
    	myTree.rightSon.rightSon.rightSon  = new BinaryNodeString("u");
    	
    	myTree.leftSon.leftSon.leftSon.leftSon = new BinaryNodeString("v");
    	myTree.leftSon.leftSon.leftSon.rightSon = new BinaryNodeString("z");
    	
     
        myTree.inorder();
        
        System.out.println("");
        System.out.println("");
        
        
        myTree.preorder();
        
        System.out.println("");
        System.out.println("");

        myTree.postorder();
    }
    
    @Test
    public void testInOrderArray() {
    	
    	char[] arr = new char[30];
    	
    	arr[1] = 'k';
    	arr[2] = 'q';
    	arr[3] = 'r';
    	arr[4] = 'g';
    	arr[5] = 'e';
    	arr[6] = 'i';
    	arr[7] = 'y';
    	arr[8] = 'p';
    	arr[9] = 'l';
    	arr[10] = 'b';
    	arr[11] = 'x';
    	arr[12] = 'm';
    	arr[13] = 'f';
    	arr[14] = 't';
    	arr[15] = 'u';
    	arr[16] = 'v';
    	arr[17] = 'z';

    	
    	inorderArray(1, arr);
    }
    
    private void inorderArray(int x, char[] chars) {
        int n = 17;
    	
    	if( x > n) return;
    	inorderArray(2*x, chars);
        
        System.out.println(chars[x]);
        
        inorderArray(2*x + 1, chars); 
        return;
    }
    
    @Test
    public void testpreorderArray() {
    	
    	char[] arr = new char[30];
    	
    	arr[1] = 'k';
    	arr[2] = 'q';
    	arr[3] = 'r';
    	arr[4] = 'g';
    	arr[5] = 'e';
    	arr[6] = 'i';
    	arr[7] = 'y';
    	arr[8] = 'p';
    	arr[9] = 'l';
    	arr[10] = 'b';
    	arr[11] = 'x';
    	arr[12] = 'm';
    	arr[13] = 'f';
    	arr[14] = 't';
    	arr[15] = 'u';
    	arr[16] = 'v';
    	arr[17] = 'z';

    	
    	preorderArray(1, arr);
    }
    
    
    private void preorderArray(int x, char[] chars) {
    	int n = 17;
    	

    	if( x > n) return;

    	System.out.println(chars[x]);
    	
    	preorderArray(2*x, chars);
        
    	preorderArray(2*x + 1, chars); 
        return;
    }
    
    @Test
    public void testpostorderArray() {
    	
    	char[] arr = new char[30];
    	
    	arr[1] = 'k';
    	arr[2] = 'q';
    	arr[3] = 'r';
    	arr[4] = 'g';
    	arr[5] = 'e';
    	arr[6] = 'i';
    	arr[7] = 'y';
    	arr[8] = 'p';
    	arr[9] = 'l';
    	arr[10] = 'b';
    	arr[11] = 'x';
    	arr[12] = 'm';
    	arr[13] = 'f';
    	arr[14] = 't';
    	arr[15] = 'u';
    	arr[16] = 'v';
    	arr[17] = 'z';

    	
    	postorderArray(1, arr);
    }
    
    
    private void postorderArray(int x, char[] chars) {
    	int n = 17;
    	
    	if( x > n) return;

    	postorderArray(2*x, chars);
        
    	postorderArray(2*x + 1, chars); 
    	
    	System.out.println(chars[x]);

    	return;
    }
}

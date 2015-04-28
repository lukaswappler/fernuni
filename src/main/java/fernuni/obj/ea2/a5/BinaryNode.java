package fernuni.obj.ea2.a5;

public class BinaryNode {

    private BinaryNode leftSon, rightSon;
    private int value;

    public BinaryNode(int i) {
        leftSon = rightSon = null;
        value = i;
    }

    public boolean contains(int v) {
        
        if (v == value) {
            return true;
        }
        if (value > v) {
            if (leftSon != null) { 
                return leftSon.contains(v);
            } else {
                return false;
            }
        } else {
            if (rightSon != null) {
                return rightSon.contains(v);
            } else {
                return false;
            }
        }
    }

    public void insert(int v) { 
        //insert if not exists
        if (!contains(v)) {
            //add as left 
            if (value > v) {
                if (leftSon != null) {
                    leftSon.insert(v);
                } else {
                    leftSon = new BinaryNode(v);
                }
            } else {
                //add as right son
                if (rightSon != null) {
                    rightSon.insert(v);
                } else {
                    rightSon = new BinaryNode(v);
                }
            }
        }
    }

    public void inorder() { 
        
        if (leftSon != null) {
            leftSon.inorder();
        } 

        System.out.println(value);
        
        
        if (rightSon != null) {
            rightSon.inorder();
        }
        
        
    }

}

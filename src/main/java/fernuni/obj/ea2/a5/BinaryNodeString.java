package fernuni.obj.ea2.a5;

public class BinaryNodeString {

    public BinaryNodeString leftSon;
    public BinaryNodeString rightSon;
    private String value;

    public BinaryNodeString(String i) {
        leftSon = rightSon = null;
        value = i;
    }

//    public boolean contains(int v) {
//        
//        if (v == value) {
//            return true;
//        }
//        if (value > v) {
//            if (leftSon != null) { 
//                return leftSon.contains(v);
//            } else {
//                return false;
//            }
//        } else {
//            if (rightSon != null) {
//                return rightSon.contains(v);
//            } else {
//                return false;
//            }
//        }
//    }

//    public void insert(int v) { 
//        //insert if not exists
//        if (!contains(v)) {
//            //add as left 
//            if (value > v) {
//                if (leftSon != null) {
//                    leftSon.insert(v);
//                } else {
//                    leftSon = new BinaryNodeString(v);
//                }
//            } else {
//                //add as right son
//                if (rightSon != null) {
//                    rightSon.insert(v);
//                } else {
//                    rightSon = new BinaryNodeString(v);
//                }
//            }
//        }
//    }

    public void inorder() { 
        
        if (leftSon != null) {
            leftSon.inorder();
        } 

        System.out.println(value);
        
        
        if (rightSon != null) {
            rightSon.inorder();
        }
    }

	public void preorder() {
		System.out.println(value);

		// TODO Auto-generated method stub
		 if (leftSon != null) {
            leftSon.preorder();
        } 
        
        
        if (rightSon != null) {
            rightSon.preorder();
        }
	}

	public void postorder() {
		// TODO Auto-generated method stub
		 if (leftSon != null) {
            leftSon.postorder();
        } 

        if (rightSon != null) {
            rightSon.postorder();
        }

        System.out.println(value);
	}
}

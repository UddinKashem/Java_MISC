package algorithom.solutions;

class Tree{
	int data;
	Tree left, right;
	
	Tree(int val){
		data = val;
		left = right = null;
	}
}

public class CheckIdenticalTree {
	
	public static boolean isIdentical(Tree r1, Tree r2){
		
		if(r1 == null && r2 == null){
			return true;
		}
		
		if(r1 == null || r2 == null){
			return false;
		}
		
		return (r1.data == r2.data) && isIdentical(r1.left, r2.left)
				&& isIdentical(r1.right, r2.right);
	}

	public static void main(String[] args) {
		Tree r1 = new Tree(1);
		r1.left = new Tree(2);
		r1.right = new Tree(3);
		r1.right.right = new Tree(4);
		r1.right.right.left = new Tree(5);
		
		System.out.println(r1.right.right.left.data);

	}

}

package tree;

public class node {
	public int id;
	public node left;
	public node right;
	public int level;
	
	public node(int id){
		this.id=id;
		this.right=null;
		this.left=null;
		this.level=1;
	}

}

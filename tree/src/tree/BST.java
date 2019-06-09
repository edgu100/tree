package tree;

public class BST {
	public node root;
	
	public BST(){
		root=null;
	}
	
	public void insertID(node nd){
		node temp=root;
		if(root==null){
			root=nd;
			return;
		}
		while(true){
			if(nd.id>temp.id){
				nd.level=nd.level+1;
				if(temp.right==null){
					temp.right=nd;
					break;
				}
				temp=temp.right;
			}else{
				nd.level=nd.level+1;
				if(temp.left==null){
					temp.left=nd;
					break;
				}
				temp=temp.left;
			}
		}
		return;
	}
	
	public node searchID(int id){
		node temp= root;
		while(temp!=null){
			if(temp.id==id){
				break;
			}
			if(id>temp.id){
				temp=temp.right;
			}else{
				temp=temp.left;
			}
		}
		return (temp);
	}
	
}

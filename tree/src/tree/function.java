package tree;

import java.io.File;
import java.util.Scanner;





public class function {
	
	public node findmax(){
		node temp=null;
		if(temp==null){
			return null;
		}
		while(temp.right!=null){
			temp=temp.right;
		}
		return temp;
	}
	
	public node findmin(){
		node temp=null;
		if(temp==null){
			return null;
		}
		while(temp.left!=null){
			temp=temp.left;
		}
		return temp;
	}
	
	public void inorder(node p){
		if(p==null)return;
		inorder(p.left);
		System.out.println(p.id/* +"  " +p.level*/);
		inorder(p.right);
		return;
	}
	
	public static BST readfile(File f){
		BST tree=new BST();
		try{
			Scanner sc=new Scanner(f);
			while (sc.hasNext()){
				node temp=new node (sc.nextInt());
				tree.insertID(temp);
			}
		}
		catch(Exception e){
			System.out.println("cant find the file");
		}
		return tree;
	}
	
	public int nodenum(node n){
		int num=0;
		if(n!=null){
			num=(1+nodenum(n.left)+nodenum(n.right));
		}
		return num;
	}
	
	public int heightoftree(node n){
		if(n==null){
			return 0;
		}else{
			int Ldepth=heightoftree(n.left);
			int Rdepth=heightoftree(n.right);
			if(Ldepth>Rdepth){
				return (Ldepth+1);
			}else{
				return (Rdepth+1);
			}
		}
	}
	
	public void PrintLVL(node node){
		if(node==null){
			return;
		}
		
		SLL queue =new SLL();
		SLLnode nodeL = new SLLnode(node);
		queue.addaftertail(nodeL);
		while(queue.getnumofnodes()!=0){
			node n=queue.removehead().node;
			
			int p=n.level;	
			System.out.print(n.id+" ");
			if(n.left!=null){
				SLLnode leftnLnode=new SLLnode(n.left);
				queue.addaftertail(leftnLnode);
			}
			if(n.right!=null){
				SLLnode rightLnode=new SLLnode(n.right);
				queue.addaftertail(rightLnode);
			}
			if(queue.head!=null){
			node pr=queue.head.node;
			if(p!=pr.level){
				System.out.println();
			}
			}
			
		}
	}
	
	public int primeNumbers(node node) {
		int num = 0;
		if (node != null) {
			int num1 = primeNumbers(node.left);
			int num2 = primeNumbers(node.right);
			num = num1 + num2;
			if (isPrime(node.id)) {
				num = num + 1;
			}
		}
		return num;
	}
	
	public static boolean isPrime(int n) {
		boolean bol = true;
		if (n < 2) {
			bol = false;
		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if ((n % i) == 0) {
					bol = false;
					break;
				}
			}
		}
		return bol;
	}
	
}

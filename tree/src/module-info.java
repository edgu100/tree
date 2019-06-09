import java.io.File;

public class tree {
	public static void main(String[] args) {
		File f1= new File("C:\\Users\\edgu1\\Desktop\\111.txt");
		BST F1=function.readfile(f1);
		function a=new function();
		System.out.println("The size of F1 is: " +a.nodenum(F1.root));
		System.out.println("F1 in increasing order :");
		a.inorder(F1.root);
		System.out.println("The height of F1 is:" + a.heightoftree(F1.root));
		System.out.println("The level by level of F1 is:");
		a.PrintLVL(F1.root);
		System.out.println();
		
		
		File f2= new File("C:\\Users\\edgu1\\Desktop\\222.txt");
		BST F2=function.readfile(f2);
		System.out.println("The size of F2 is: "+a.nodenum(F2.root));
		System.out.println("F2 in increasing order :");
		a.inorder(F2.root);
		System.out.println("The height of F2 is:" + a.heightoftree(F2.root));
		System.out.println("The level by level of F2 is:");
		a.PrintLVL(F2.root);
		System.out.println();
		System.out.println("The number of prime numbers is:"+a.primeNumbers(F2.root)  );
		
		
		
		
		File f3= new File("C:\\Users\\edgu1\\Desktop\\333.txt");
		BST F3=function.readfile(f3);
		System.out.println("The size of F3 is: "+a.nodenum(F3.root));
		System.out.println("F3 in increasing order :");
		a.inorder(F3.root);
		System.out.println("The height of F3 is:" + a.heightoftree(F3.root));
		System.out.println("The level by level of F3 is:");
		a.PrintLVL(F3.root);
	}
}

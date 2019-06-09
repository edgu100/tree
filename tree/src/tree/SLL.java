package tree;

public class SLL {
	public SLLnode head;
	public SLLnode tail;
	SLL(){
		head=null;
		tail=null;
	}
	
	public SLLnode removehead(){
		SLLnode tempLnode= head;
		head=head.next;
		if(head==null){
			tail=null;
		}
		return tempLnode;
	}
	
	public void addaftertail(SLLnode n){
		if(tail==null){
			head=n;
			tail=n;
		}else{
			tail.next=n;
			tail=n;
		}
		return;
	}
	
	public int getnumofnodes(){
		SLLnode p=head;
		int num=0;
		while(p!=null){
			p=p.next;
			num++;
		}
		return num;
	}

}

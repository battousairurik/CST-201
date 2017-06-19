
public class doublyLinkedPalindrome {

	private Node start;
	private Node end;
	public int size;
	
	public doublyLinkedPalindrome(){
		start = null;
		end = null;
		size = 0;
	}
	public void insertStart (int x){
		Node temp = new Node(x, null, null);
		if (start == null){
			start = temp;
			end = start;
		}
		else {
			start.setLinkPrev(temp);
			temp.setLinkNext(start);
			start = temp;
		}
		size++;
	}
	public void addNode (int x){
		Node temp = new Node(x, null, null);
		Node temp2 = start;
		temp.setLinkPrev(temp2);
		temp.setLinkNext(null);
		end = temp;
	}
	public Boolean isPalindrome (Node test){
		Boolean value = false;
		
		
		
		return value;
	}
	
	public static void main(String[] args) {
		
		doublyLinkedPalindrome example = new doublyLinkedPalindrome();
		example.insertStart(5);
		
	}

}

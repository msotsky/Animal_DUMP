/*
 * Your name goes here. If you forget to include it here, I will deduct 1 mark.
 */
//maxNodeIter
public class CandyCrushList{

	private Node head;
	
	CandyCrushList(){
		head = null;
	}
	
	CandyCrushList(Node start){
		head = start;
	}
	
	private static class Node {
        String data;
        Node next;

        public Node(String s, Node nodeRef) {
            data = s;
            next = nodeRef;
        }
        
        private Node getNext() {
			return next;
		}
		
		private void setNext(Node nodeRef) {
			this.next = nodeRef;
		}
		
		private void setData(String dataItem) {
			this.data = dataItem;
		}
		
		private String getData() {
			return this.data;
		}
    }
    
	// convert an array to a linked list
	
    public CandyCrushList arrayToList(String[] anArray){
        if (anArray.length == 0) return null;
        Node front = new Node(anArray[0],null);
        Node back = front;
        for(int k=1; k < anArray.length; k++){
            back.setNext(new Node(anArray[k],null));
            back = back.getNext();
        }
        return new CandyCrushList(front);
    }
    
    // make a copy of a given linked list
    
    public CandyCrushList copyList(CandyCrushList aList) {
    	return new CandyCrushList(copy(aList.head));
    }
    
    private Node copy(Node nodeRef){
        if (nodeRef == null) return null;
        return new Node(nodeRef.getData(), copy(nodeRef.getNext()));
    }
    
    // duplicate each element of a given list
    
    public CandyCrushList dupListElements(CandyCrushList aList) {
    	return new CandyCrushList(dupNodes(aList.head));
    }
    
    private Node dupNodes(Node nodeRef){
        if (nodeRef == null) return null;
        nodeRef.next = new Node(nodeRef.getData(), dupNodes(nodeRef.getNext()));
        return nodeRef;
    }
    
    
    // reverse a given list
    
    public CandyCrushList reverseList(CandyCrushList aList) {
    	return new CandyCrushList(rev(aList.head));
    }
    
    private Node rev(Node nodeRef){
    	
        if (nodeRef == null || nodeRef.getNext() == null) return nodeRef;
        
        // There must be at least two nodes
        Node rest = rev(nodeRef.getNext());
        Node nextToLast = rest;
        while (nextToLast.getNext() != null){
            nextToLast = nextToLast.getNext();
        }
        nextToLast.setNext(nodeRef);
        nodeRef.setNext(null);     // must have this statement
        return rest;
    }
    
    
    
   // recursive reverse a given list
    
    public CandyCrushList reverseListTwo(CandyCrushList aList) {
    	return new CandyCrushList(rev2(aList.head));
    }
    
    private Node rev2(Node nodeRef){
        if (nodeRef == null) return null;
        Node rest = rev2(nodeRef.getNext());
        nodeRef.getNext().setNext(nodeRef);
        nodeRef.setNext(null);
        return rest;
    }

    
    // displays contents of a linked list
    
    public void displayList(CandyCrushList aList) {
    	this.displayList(aList.head);
    }
    
    private void displayList(Node nodeRef){
        while (nodeRef != null){
            System.out.print(nodeRef.getData() +" ");
            nodeRef = nodeRef.getNext();
        }
        System.out.println();
    }
    
    // a rare appearance of a testing method inside the class being tested
    
    public static void main(String[] args){
    	
    	// some Candy Crush candy types
    	
        String[] candies = {"striped", "wrapped", "fish", "bomb"};
        
        // a whole whack of tests
        
        CandyCrushList candy = new CandyCrushList();
        
        CandyCrushList front = candy.arrayToList(candies);
        System.out.print("original list: ");
        candy.displayList(front);
        
        CandyCrushList copy = candy.copyList(front);
        System.out.print("copy: ");
        candy.displayList(copy);
        
        CandyCrushList twice = candy.dupListElements(copy);
        System.out.print("duplicate elts: ");
        candy.displayList(twice);
        
        CandyCrushList rev = candy.reverseList(copy);
        System.out.print("reverse: ");
        candy.displayList(rev);
        
        rev = candy.reverseList(front);
        System.out.print("reverseTwo:");
        candy.displayList(rev);
    }
    
    private Node maxNode(Node nodeRef){
        if (nodeRef == null || nodeRef.getNext() == null)
            return nodeRef;
        //1. at least two nodes in list

        Node maxAfter = maxNode(nodeRef.getNext());
        if((maxAfter.getData()).compareTo(maxAfter.getNext().getData()) < 0)
            return maxNode(maxAfter.getNext());
        else
            return maxNode(maxAfter);
    }
}
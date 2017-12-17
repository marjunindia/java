import javax.swing.text.AbstractDocument.LeafElement;

public class SortedPair<T extends Comparable<T>> {
	 
	private T first;
	private T second;

	
	public T getFirst() {
		return first;
	}

	public T getSecond() {
		return second;
	}


	public SortedPair(T first, T second) {
		
		if(first.compareTo(second)<0){
			
			this.first = first;
			this.second = second;	
		}
		else{
			this.first = second;
			this.second = first;	
		}
		
	}
	
	

}

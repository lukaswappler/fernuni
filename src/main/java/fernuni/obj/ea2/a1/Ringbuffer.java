package fernuni.obj.ea2.a1;

public class Ringbuffer<T> {

	int maxElements;
	
	Entry<T> currentElement;
	
	public Ringbuffer(int size) {
		maxElements = size;
		
		init();
	}

	private void init() {
		Entry<T> firstElement = new Entry<T> (null, null, null);
		
		for (int i = 0; i < this.maxElements -1 ; i++) {
			if (i == 0 ) {
				
				firstElement.next = new Entry<T> (null, null, firstElement);
				currentElement = firstElement.next; 
			} else {
				currentElement.next = new Entry<T> (null, null, currentElement);
				currentElement = currentElement.next;
			}
			
			if (i + 1 == this.maxElements - 1) { 
				currentElement.next = firstElement;
			}
		}
		
		//create back references
		while (currentElement != firstElement) {
			currentElement.next.previous = currentElement;
			currentElement = currentElement.next;
		}
		
	}
	
	/**
	 * Insert a new element
	 */
	public void insert(T myValue) {
		currentElement.element = myValue;
		currentElement = currentElement.next;
	}
	
	/**
	 * Prints the current ring buffer
	 */
	public void print() {		
		Entry<T> firstElementOfCycle = currentElement;
		Entry<T> itarationElement = currentElement;
		
		itarationElement = itarationElement.previous;
		System.out.println(String.valueOf(itarationElement.element));
		
		while (firstElementOfCycle != itarationElement) {
			itarationElement = itarationElement.previous;
			System.out.println(String.valueOf(itarationElement.element));
		}
	}
	
}

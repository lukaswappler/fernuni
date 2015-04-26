package fernuni.obj.ea2.a1;

import org.junit.Test;

public class RingbufferTest {
		
	@Test
	public void testConstructor() {
		Ringbuffer<Integer> ringbuffer = new Ringbuffer<Integer>(5);
	}
	
	@Test
	public void testPrintEmptyBuffer() {
		Ringbuffer<Integer> ringbuffer = new Ringbuffer<Integer>(5);
		ringbuffer.print();
	}
	
	@Test
	public void testPrintFullBuffer() {
		Ringbuffer<Integer> ringbuffer = new Ringbuffer<Integer>(5);
		ringbuffer.insert(1);
		ringbuffer.insert(2);
		ringbuffer.insert(3);
		ringbuffer.insert(4);
		ringbuffer.insert(5);
		
		ringbuffer.print();
	}
	
	@Test
	public void testPrintFullBufferWithSomeOverflow() {
		Ringbuffer<String> ringbuffer = new Ringbuffer<String>(5);
		ringbuffer.insert("1");
		ringbuffer.insert("2");
		ringbuffer.insert("3");
		ringbuffer.insert("4");
		ringbuffer.insert("5");
		ringbuffer.insert("6");
		ringbuffer.insert("7");
		ringbuffer.insert("8");
		ringbuffer.insert("9");
		
		ringbuffer.print();
	}
}


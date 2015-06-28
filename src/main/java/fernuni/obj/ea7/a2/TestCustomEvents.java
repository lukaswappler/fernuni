package fernuni.obj.ea7.a2;

public class TestCustomEvents {
	public static void main(String[] args) {
		SourceOfMyEvents source = new SourceOfMyEvents();
		ListenerOfMyEvents listener = new ListenerOfMyEvents();
		source.addMyEventsListener(listener);
		for (int i = 0; i < 5; i++)
			source.nextState();
	}
}
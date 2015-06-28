package fernuni.obj.ea7.a2;

class ListenerOfMyEvents implements MyEventsListener {
	
	public void firstEvent(MyEventsEvent e) {
		System.out.println("firstEvent aufgetreten");
	}

	public void secondEvent(MyEventsEvent e) {
		System.out.println("secondEvent aufgetreten");
	}
}
package fernuni.obj.ea7.a2;

import java.util.EventListener;

interface MyEventsListener extends EventListener {
	public void firstEvent(MyEventsEvent e);

	public void secondEvent(MyEventsEvent e);
}
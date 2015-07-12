package fernuni.obj.ea7.a2;

import java.util.EventListener;

interface MyEventsListener extends EventListener {

	public void fireRedEvent(MyEventsEvent e);

	public void fireRedYellowEvent(MyEventsEvent e);

	public void fireGreenEvent(MyEventsEvent e);

	public void fireYellowEvent(MyEventsEvent e);
}
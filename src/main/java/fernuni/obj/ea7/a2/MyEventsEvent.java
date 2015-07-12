package fernuni.obj.ea7.a2;

import java.util.EventObject;

class MyEventsEvent extends EventObject {
	
	private static final long serialVersionUID = 5968049099588495755L;

	public MyEventsEvent(Object source) {
		super(source);
	}
}
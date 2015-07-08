package fernuni.obj.ea7.a2;

import java.util.Vector;

class SourceOfMyEvents {
	// Attribut zum Speichern registrierter MyEventsListener:
	private Vector<MyEventsListener> myEventsListeners;
	private int state = 0;

	public int nextState() {
		state = (state + 1) % 2;
		switch (state) {
		case 0:
			fireFirstEvent(new MyEventsEvent(this));
			break;
		case 1:
			fireSecondEvent(new MyEventsEvent(this));
			break;
		default: {
		}
		}
		return state;
	}

	// Methoden zum Registrieren und Loeschen von MyEventsListenern
	public synchronized void addMyEventsListener(MyEventsListener l) {
		Vector<MyEventsListener> v = myEventsListeners == null ? new Vector<MyEventsListener>(
				2) : (Vector<MyEventsListener>) myEventsListeners.clone();
		if (!v.contains(l)) {
			v.addElement(l);
			myEventsListeners = v;
		}
	}

	public synchronized void removeMyEventsListener(MyEventsListener l) {
		if (myEventsListeners != null && myEventsListeners.contains(l)) {
			Vector<MyEventsListener> v = (Vector<MyEventsListener>) myEventsListeners
					.clone();
			v.removeElement(l);
			myEventsListeners = v;
		}
	}

	// Methoden, die eines der Ereignisse firstEvent oder secondEvent
	// 'feuern', d.h. alle registrierten Listener ueber das Eintreten dieses
	// Ereignisses durch Aufruf der entsprechenden Methode des
	// MyEventsListener-Interfaces informieren.
	protected void fireFirstEvent(MyEventsEvent e) {
		if (myEventsListeners != null) {
			Vector<MyEventsListener> listeners = myEventsListeners;
			int count = listeners.size();
			for (int i = 0; i < count; i++) {
				listeners.elementAt(i).firstEvent(e);
			}
		}
	}

	protected void fireSecondEvent(MyEventsEvent e) {
		if (myEventsListeners != null) {
			Vector<MyEventsListener> listeners = myEventsListeners;
			int count = listeners.size();
			for (int i = 0; i < count; i++) {
				listeners.elementAt(i).secondEvent(e);
			}
		}
	}
}
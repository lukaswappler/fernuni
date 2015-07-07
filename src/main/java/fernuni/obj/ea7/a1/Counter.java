package fernuni.obj.ea7.a1;

class Counter {
	private int startValue;
	private int value;
	private int min = 0;
	private int max = 99;

	Counter(int start) {
		startValue = start;
		value = start;
	}

	void incr() {
		if (value < max)
			value++;
	}

	void decr() {
		if (value > min)
			value--;
	}

	void resetCounter() {
		value = startValue;
	}

	public String toString() {
		return "" + value;
	}
}
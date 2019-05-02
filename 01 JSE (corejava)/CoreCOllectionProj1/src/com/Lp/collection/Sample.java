package com.Lp.collection;

public class Sample {
	private int x = 10;
	private int y = 20;

	public Sample(int x, int y) {
		System.out.println("Sample:: 2-param Constrictor()");
		this.x = x;
		this.y = y;
	}

	@Override
	public int hashCode() {
				return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Sample) {
			Sample s = (Sample) obj;
			return (this.x == s.x) && (this.y == s.y);
		} else
			return false;
	}

	@Override
	public String toString() {
		return "Sample [x=" + x + ", y=" + y + "]";
	}

}

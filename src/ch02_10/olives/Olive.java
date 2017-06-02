package ch02_10.olives;

public class Olive implements Comparable<Olive> {

	public OliveName oliveName;
	public OliveColor color;

	public Olive() {
	}

	public Olive(OliveName oliveName, OliveColor color) {
		this.oliveName = oliveName;
		this.color = color;
	}

	@Override
	public String toString() {
		return "oliveName: " + this.oliveName.toString() +
			", color: " + this.color.toString();
	}

	@Override
	public int compareTo(Olive o) {
		return this.oliveName.compareTo(o.oliveName);
	}
}

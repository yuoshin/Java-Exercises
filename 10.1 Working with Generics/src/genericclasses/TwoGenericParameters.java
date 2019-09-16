package genericclasses;

public class TwoGenericParameters {

	public static void main(String[] args) {
		Elephant2 elephantObj = new Elephant2();
		Integer weightInPounds = 15000;
		SizeLimitedCrate<Elephant2,Integer> obj = new SizeLimitedCrate<>(elephantObj,weightInPounds);
	}
}

class SizeLimitedCrate<T, U> {	//T represents Type, U represents Unit to measure
	private T contents;
	private U sizeLimit;
	public SizeLimitedCrate(T contents, U sizeLimit) {
		this.contents = contents;
		this.sizeLimit = sizeLimit;
	}
}

class Elephant2{
	private int weight;
	public int getWeight(int weight) {
		this.weight=weight;
		return weight;
	}
}
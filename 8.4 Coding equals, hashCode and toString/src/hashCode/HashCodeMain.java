package hashCode;

public class HashCodeMain {
	private String rank;
	private String suit;

	public HashCodeMain(String r, String s) {
		if (r == null || s == null)
		throw new IllegalArgumentException();
		rank = r;
		suit = s;
		}

	public boolean equals(Object obj) {
		if (!(obj instanceof HashCodeMain))
			return false;
		HashCodeMain c = (HashCodeMain) obj;
		return rank.equals(c.rank) && suit.equals(c.suit);
	}

	public int hashCode() {
		return rank.hashCode();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

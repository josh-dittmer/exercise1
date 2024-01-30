package exercise1;

public class Voter {
	private final int voterId;
	private String name;
	private boolean hasVoted;
	
	public Voter(int voterId, String name, boolean hasVoted) {
		this.voterId = voterId;
		this.name = name;
		this.hasVoted = hasVoted;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.voterId + 
				"\nName: " + this.name + 
				"\nHas voted: " + this.hasVoted;
	}
}

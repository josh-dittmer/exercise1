package exercise1;

public class Voter extends Candidate {
	private boolean hasVoted;
	
	public Voter(int voterId, String firstName, String lastName, boolean hasVoted) {
		super(voterId, firstName, lastName);
		
		this.hasVoted = hasVoted;
	}
	
	public boolean hasVoted() {
		return this.hasVoted;
	}
}

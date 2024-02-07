package exercise1;

public class PresidentialCandidate extends Candidate {
	private String party;
	private int numVotes;
	
	public PresidentialCandidate(int id, String firstName, String lastName, String party) {
		super(id, firstName, lastName);
		
		this.party = party;
		this.numVotes = 0;
	}
	
	public String getParty() {
		return this.party;
	}
	
	public void addVote() {
		this.numVotes++;
	}
	
	public int getVotes() {
		return this.numVotes;
	}
}

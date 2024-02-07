package exercise1;

public class SenateCandidate extends Candidate {
	private String party;
	private String state;
	private int numVotes;
	
	public SenateCandidate(int id, String firstName, String lastName, String party, String state) {
		super(id, firstName, lastName);
		
		this.party = party;
		this.state = state;
		this.numVotes = 0;
	}
	
	public String getParty() {
		return this.party;
	}
	
	public String getState() {
		return this.state;
	}
	
	public void addVote() {
		this.numVotes++;
	}
	
	public int getVotes() {
		return this.numVotes;
	}
}

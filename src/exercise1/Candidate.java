package exercise1;

public class Candidate {
	private final int candidateId;
	private String name;
	private String party;
	
	public Candidate(int candidateId, String name, String party) {
		this.candidateId = candidateId;
		this.name = name;
		this.party = party;
	}
	
	@Override
	public String toString() {
		return "ID: " +  this.candidateId + 
				"\nName: " + this.name + 
				"\nParty: " + this.party;
	}
}

package exercise1;

public class Candidate {
	private final int candidateId;
	private String firstName;
	private String lastName;
	private String party;
	
	public Candidate(int candidateId, String firstName, String lastName, String party) {
		this.candidateId = candidateId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.party = party;
	}
	
	public int getId() {
		return this.candidateId;
	}
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		String name = this.firstName + " " + this.lastName;
		return name.toUpperCase();
	}
	
	public String getParty() {
		return this.party;
	}
	
	public void printInfo() {
		Utility.printCandidateInfo(this);
	}
	
	public static void main(String[] args) {
		Candidate test1 = new Candidate(1234, "Test", "Guy", "Test");
		Voter test2 = new Voter(4321, "Hello", "World", false);
		
		test1.printInfo();
		test2.printInfo();
	}
}

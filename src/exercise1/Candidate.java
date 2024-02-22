package exercise1;

public abstract class Candidate {
	private final int id;
	private String firstName;
	private String lastName;
	private int numVotes;
	
	public Candidate(int id, String firstName, String lastName) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.numVotes = 0;
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		String name = this.firstName + " " + this.lastName;
		return name.toUpperCase();
	}
	
	public void addVote() {
		this.numVotes++;
	}
	
	public int getVotes() {
		return this.numVotes;
	}
	
	public void printInfo() {
		Utility.printCandidateInfo(this);
	}
}

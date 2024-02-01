package exercise1;

public class Voter {
	private final int voterId;
	private String firstName;
	private String lastName;
	private boolean hasVoted;
	
	public Voter(int voterId, String firstName, String lastName, boolean hasVoted) {
		this.voterId = voterId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.hasVoted = hasVoted;
	}
	
	public int getId() {
		return this.voterId;
	}
	
	public void setName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getName() {
		String name = this.firstName + " " + this.lastName;
		return name.toUpperCase();
	}
	
	public boolean hasVoted() {
		return this.hasVoted;
	}
	
	public void printInfo() {
		Utility.printVoterInfo(this);
	}
}

package exercise1;

import java.util.ArrayList;

public class Election {
	private ArrayList<Voter> voters = new ArrayList<>();
	
	private boolean finished;
	
	public Election() {
		this.finished = false;
	}
	
	public void enrollVoter(Voter voter) {
		voters.add(voter);
	}
	
	public void vote(Voter voter, Candidate candidate) {
		if (!voters.contains(voter)) {
			System.out.println("Voter not enrolled!");
			return;
		}
		
		if (voter.hasVoted() || this.finished) {
			return;
		}
		
		candidate.addVote();
	}
	
	public void endElection() {
		this.finished = true;
	}
	
	public boolean isFinished() {
		return this.finished;
	}
	
	public static void main(String[] args) {
		PresidentialElection election = new PresidentialElection();
		
		PresidentialCandidate candidate1 = new PresidentialCandidate(0, "Joe", "Mama", "Pizza Party");
		PresidentialCandidate candidate2 = new PresidentialCandidate(1, "Some", "Guy", "Icecream party");
		
		Voter voter1 = new Voter(0, "Guy", "1", false);
		Voter voter2 = new Voter(1, "Guy", "2", false);
		Voter voter3 = new Voter(2, "Guy", "3", false);
		
		election.addCandidate(candidate1);
		election.addCandidate(candidate2);
		
		election.enrollVoter(voter1);
		election.enrollVoter(voter2);
		election.enrollVoter(voter3);

		election.vote(voter1, candidate1);
		election.vote(voter2, candidate1);
		election.vote(voter3, candidate2);
		
		election.endElection();
		election.displayResults();
	}
}

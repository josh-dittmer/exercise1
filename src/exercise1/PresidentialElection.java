package exercise1;

import java.util.ArrayList;

public class PresidentialElection extends Election {
	private ArrayList<PresidentialCandidate> candidates = new ArrayList<>();

	public PresidentialElection() {
		super();
	}
	
	void addCandidate(PresidentialCandidate candidate) {
		this.candidates.add(candidate);
	}
	
	public void displayResults() {
		if (!super.isFinished()) {
			System.out.println("The election is still in progress!");
			return;
		}
		
		int totalVotes = 0;
		
		System.out.println("- Presidential Election Results -");
		
		System.out.println("Candidates:");
				
		for (int i = 0; i < this.candidates.size(); i++) {
			int votes = this.candidates.get(i).getVotes();
			totalVotes += votes;
			System.out.println((i + 1) + ". " + this.candidates.get(i).getName() + " (" + this.candidates.get(i).getParty() + ") - " + votes + " votes");
		}
		
		System.out.println("TOTAL VOTES: " + totalVotes);
	}

}

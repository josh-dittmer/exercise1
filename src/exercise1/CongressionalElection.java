package exercise1;

import java.util.ArrayList;

public class CongressionalElection extends Election {
	private ArrayList<HouseCandidate> houseCandidates = new ArrayList<>();
	private ArrayList<SenateCandidate> senateCandidates = new ArrayList<>();

	public CongressionalElection() {
		super();
	}
	
	void addHouseCandidate(HouseCandidate houseCandidate) {
		this.houseCandidates.add(houseCandidate);
	}

	void addSenateCandidate(SenateCandidate senateCandidate) {
		this.senateCandidates.add(senateCandidate);
	}
	
	public void displayResults() {
		if (!super.isFinished()) {
			System.out.println("The election is still in progress!");
			return;
		}
		
		int totalVotes = 0;
		
		System.out.println("- Congressional Election Results -");
		
		System.out.println("House Candidates:");
				
		for (int i = 0; i < this.houseCandidates.size(); i++) {
			int votes = this.houseCandidates.get(i).getVotes();
			totalVotes += votes;
			System.out.println((i + 1) + ". " + this.houseCandidates.get(i).getName() + " (" + this.houseCandidates.get(i).getDistrict() + ") - " + votes + " votes");
		}
		
		System.out.println("Senate Candidates:");
		
		for (int i = 0; i < this.senateCandidates.size(); i++) {
			int votes = this.senateCandidates.get(i).getVotes();
			totalVotes += votes;
			System.out.println((i + 1) + ". " + this.senateCandidates.get(i).getName() + " (" + this.senateCandidates.get(i).getState() + ") - " + votes + " votes");
		}
		
		System.out.println("TOTAL VOTES: " + totalVotes);
	}

}

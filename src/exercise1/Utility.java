package exercise1;

public class Utility {

	static void printCandidateInfo(Candidate candidate) {
		String info = "ID: " +  candidate.getId() + 
						"\nName: " + candidate.getName() + 
						"\nParty: " + candidate.getParty();
		
		System.out.println(info);
	}
	
	static void printVoterInfo(Voter voter) {
		String info = "ID: " + voter.getId() + 
						"\nName: " + voter.getName() + 
						"\nHas voted: " + voter.hasVoted();
		
		System.out.println(info);
	}
	
}

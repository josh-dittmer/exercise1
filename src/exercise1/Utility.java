package exercise1;

public class Utility {

	static void printCandidateInfo(Candidate candidate) {
		String info = "ID: " +  candidate.getId() + 
						"\nName: " + candidate.getName();
		
		System.out.println(info);
	}
	
}

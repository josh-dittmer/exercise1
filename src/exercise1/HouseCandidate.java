package exercise1;

public class HouseCandidate extends Candidate {
	private String party;
	private String district;
	
	public HouseCandidate(int id, String firstName, String lastName, String party, String district) {
		super(id, firstName, lastName);
		
		this.party = party;
		this.district = district;
	}
	
	public String getParty() {
		return this.party;
	}
	
	public String getDistrict() {
		return this.district;
	}
}

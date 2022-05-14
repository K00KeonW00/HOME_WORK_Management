package homework1;

public class Homework_Viewer extends homwork_menu {
	public class homwork_menu {

	}
	public int SID;
	public String NAME;
	public int NOS;
	
	public void setHomework_Viewer (int SID, String NAME, int NOS) {
		this.SID = SID;
		this.NAME = NAME;
		this.NOS = NOS;
	}
	
	public int getSID() {
		return SID;
	}
	public String getNAME() {
		return NAME;
	}
	public int getNOS() {
		return NOS;
	}
	
	

}



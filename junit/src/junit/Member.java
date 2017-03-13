package junit;

public class Member {

	String[] members = new String[4];
	
	public void addMember(int i, String member){
		members[i] = member;
	}
	
	public String[] getMembers(){
		return members;
	}
}

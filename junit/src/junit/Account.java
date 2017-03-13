package junit;

public class Account {

	private int balance;
	public void setBalance(int xxx){
		if(xxx < 0){
			throw new IllegalArgumentException("•‰‚Ì’l‚ÍÝ’è‚Å‚«‚Ü‚¹‚ñ");	
		}
		this.balance = xxx;
		System.out.println("ŒûÀ‚É" + xxx + "‰~‚ðÝ’è‚µ‚Ü‚µ‚½");  
	}
}

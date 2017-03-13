package junit;

public class Account {

	private int balance;
	public void setBalance(int xxx){
		if(xxx < 0){
			throw new IllegalArgumentException("負の値は設定できません");	
		}
		this.balance = xxx;
		System.out.println("口座に" + xxx + "円を設定しました");  
	}
}

package junit;

public class Account {

	private int balance;
	public void setBalance(int xxx){
		if(xxx < 0){
			throw new IllegalArgumentException("���̒l�͐ݒ�ł��܂���");	
		}
		this.balance = xxx;
		System.out.println("������" + xxx + "�~��ݒ肵�܂���");  
	}
}

package AssignmentSession4;

public class Account {
	
	private int acctNum;
	private String acctName;
	private String acctBalance;
	
	public Account(int acctNum, String acctName, String acctBalance) {
		super();
		this.acctNum = acctNum;
		this.acctName = acctName;
		this.acctBalance = acctBalance;
	}

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public String getAcctName() {
		return acctName;
	}

	public void setAcctName(String acctName) {
		this.acctName = acctName;
	}

	public String getAcctBalance() {
		return acctBalance;
	}

	public void setAcctBalance(String acctBalance) {
		this.acctBalance = acctBalance;
	}
	

}

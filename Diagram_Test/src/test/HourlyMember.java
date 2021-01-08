package test;

public class HourlyMember extends Member{
	
	private int usingHour; 
	
	public HourlyMember(int age, int usingHour) {
		super(age);
		this.usingHour = usingHour;
	}

	@Override
	public int getPayment() {
		return usingHour*100;
	}
}

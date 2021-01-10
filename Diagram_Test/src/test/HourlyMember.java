package test;

public class HourlyMember extends Member{
	
	public HourlyMember(int age, int usingHour) {
		super(age);
		this.usingHour = usingHour;
	}

	private int usingHour;

	@Override
	public int getPayment() {
		return 100*usingHour;
	}
}

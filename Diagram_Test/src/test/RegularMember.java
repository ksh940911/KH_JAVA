package test;

public class RegularMember extends Member{

	public RegularMember(int age) {
		super(age);
	}

	@Override
	public int getPayment() {
		return 1000;
	}
}

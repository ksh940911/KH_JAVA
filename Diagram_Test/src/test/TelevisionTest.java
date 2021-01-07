package test;

public class TelevisionTest {
	public static void main(String args[]) {
		Television[] tv = new Television[3];
		tv[0] = new Television(7);
		tv[1] = new Television(9);
		tv[2] = new Television(11);
		
		for(int i=0;i<tv.length;i++) {
			System.out.print(tv[i].getChannel() + " ");
		}
	}
}
	










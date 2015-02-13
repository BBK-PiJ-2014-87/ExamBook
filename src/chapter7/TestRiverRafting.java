package chapter7;

public class TestRiverRafting {

	public static void main(String[] args) {
		RiverRafting riverRafting = new RiverRafting();
		try {
			riverRafting.crossRapid(11);
			riverRafting.rowRaft("nervous");
		}
		catch (FallInRiverException e1){
			System.out.println("Get back into the raft");
		}
		catch (DropOarException e2){
			System.out.println("Don't panic");
		}
		finally{
			System.out.println("Pay for the advanture");
		}
		System.out.println("After try-catch block!");

	}

}

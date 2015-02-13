package chapter7;

public class TestRiverRafting {

	public static void main(String[] args) {
		RiverRafting riverRafting = new RiverRafting();
		
		System.out.println("*******1 Exception********");
		try {
			riverRafting.crossRapid(11);
			riverRafting.rowRaft("happy");
			System.out.println("Enjoy River Rafting");
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
		System.out.println("After the try-catch block!");
		
		System.out.println("*******NO Exception********");
		
		try {
			riverRafting.crossRapid(7);
			riverRafting.rowRaft("happy");
			System.out.println("Enjoy River Rafting");
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
		System.out.println("After the try-catch block!");
		
System.out.println("******* 1 exceptions ********");
		
		try {
			riverRafting.crossRapid(7);
			riverRafting.rowRaft("nervous");
			System.out.println("Enjoy River Rafting");
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
		System.out.println("After the try-catch block!");

	}

}

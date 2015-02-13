package chapter7;

public class MultipleReturn {
	int getInt() {
		int returnVal = 10;
		try {
			String[] students = { "Harry", "Rob" };
			System.out.println(students[5]);
		} catch (Exception e) {
			System.out.println("About to return " + returnVal);
			return returnVal + 15;
		} finally {
			returnVal += 10;
			System.out.println("Return value now is " + returnVal);
		}
		return returnVal;
	}

	StringBuilder getStringBuilder() {
		StringBuilder strVal = new StringBuilder("10");
		try {
			String[] students2 = { "harry", "peter" };
			System.out.println(students2[5]);
		} catch (Exception e) {
			System.out.println("about to return " + strVal);
			return strVal;
		} finally {
			strVal.append("10");
			System.out.println("Return value now is: " + strVal);
		}
		return strVal;
		
	}

	public static void main(String[] args) {
		MultipleReturn var = new MultipleReturn();
		System.out.println("In main: " + var.getInt());
		
		MultipleReturn var2 = new MultipleReturn();
		System.out.println("In Main: " + var2.getStringBuilder());
	}

}

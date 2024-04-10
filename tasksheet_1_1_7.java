public class tasksheet_1_1_7 { 
    
	public static void main(String[] args) {
    	int num1 = 9;
    	int num2 = 8;
	int addResult = addNumber(num1 , num2);
	int subtractResult = subtractNumber(num1 , num2);
	int multiplyResult = multiplyNumber(num1 , num2);
	int divideResult = divideNumber(num1 , num2);
	
	System.out.println("num1 = " + num1 + "; num2 = " + num2 );
	System.out.println("Sum: " +  addResult);
	System.out.println("Difference: " +  subtractResult);
	System.out.println("Product: " +  multiplyResult);
	System.out.println("Quotient: " +  divideResult);
	}
		public static int addNumber (int num1, int num2) {
	    return num1 + num2;
	}
	public static int subtractNumber (int num1, int num2) {
	    return num1 - num2;
	}
	public static int multiplyNumber (int num1, int num2) {
	    return num1 * num2;
	}
	public static int divideNumber (int num1, int num2) {
	    return num1 / num2;
	}
}

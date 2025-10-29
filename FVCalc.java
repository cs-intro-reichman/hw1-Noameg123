// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		// this comment with your code
		int currentValue = Integer.parseInt(args[0]);  		
		Double rate = Double.parseDouble(args[1]);  
		int n = Integer.parseInt(args[2]);  		
		double pow1= Math.pow(1+rate,n);	
		double futureValue = (currentValue * (pow1)) /100;
		System.out.println("After " + n + " years, " + "$" + currentValue + " saved at " + rate + "% " + "will yield " + "$" + ((int)futureValue));

		//% java FVCalc 100 10 2
		//After 2 years, $100 saved at 10.0% will yield $121
		//% java FVCalc 25000 6 25
		//After 25 years, $25000 saved at 6.0% will yield $107296
		//System.out.println((int) x)
	}
}
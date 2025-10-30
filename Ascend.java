// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);  	
		int a = (int)(Math.random() * lim) + 1;
		int b = (int)(Math.random() * lim) + 1;
		int c = (int)(Math.random() * lim) + 1;
		int big_temp = Math.max(a, b);
		int big_num = Math.max(big_temp, c);
		int small_temp = Math.min(a, b);
		int small_num = Math.min(small_temp, c);
		int mid_num= ((a+b+c) - (small_num+big_num)); 
		System.out.println(a + " " + b + " " + c);
		System.out.println(small_num + " " + mid_num + " " + big_num);




	}

}

/*P4:-Wajp to swap two numbers
	(1) third variable
	(2) without third variable*/

class Swap{
	public static void main(String[] args){
		int a = 50;
		int b = 11;
//***************************************Using third variable**************************************************************************
		int c = a;
		 a = b;
		 b = c;	
		System.out.println("*****Using third variable*****");
		System.out.println("Swap value of a is : " + a);
		System.out.println("Swap value of b is : " +  b);
		System.out.println("*****Using third variable close*****");


//***************************************Without Using third variable******************************************************************
		
		System.out.println("*****Without Using third variable*****");
		int p = 9;
		int q = 30;
		
		p = p+q;  // 9+30=39
		q = p-q;  // 39-30=9
		p = p-q;  // 39-9=30

		System.out.println("Swap value of p is : " + p);
		System.out.println("Swap value of q is : " +  q);

	}
}
/*P3:- Wajap to take user input and print the biggest and the smallest digit in the number.*/

import java.util.Scanner;
class find_number{

	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number here :");
		int n = sc.nextInt();
		int a = n;


		int biggest_no  = 0;
		int smallest_no = 9;

		while(n>0){
			int rem= n%10;
				if(rem>biggest_no){
					biggest_no = rem;
}
				if(rem<smallest_no){
					smallest_no= rem;
}


		n = n/10;
}

			System.out.println("Smallest digit in entered number " + a+ " is: " + smallest_no );

			System.out.println("Biggest digit in entered number " + a+ " is: " + biggest_no );



}
}
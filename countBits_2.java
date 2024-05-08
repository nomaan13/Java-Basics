import java.util.Scanner;

class countBits_2{
	public static void main(String[] args){


	Scanner sc = new Scanner(System.in);
	System.out.print("Please enter a number here: ");
	int a = sc.nextInt();
	int n = a ;

	int zero_count=0;
	int one_count=0;

	while(a>0){
		int rem = a/2;
			if(rem==1){
				one_count++;
}
			else{
				zero_count++;
				}
		a = a/2;
		
}
	System.out.println("Total no of one count is : " + one_count);
	System.out.println("Total no of zero count is : " + zero_count);
}
	}
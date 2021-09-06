package assignments.day2;

public class AmstrongNumbers {
	
	public static void main(String[] args) {
		
		int num=153, sum=0, rem;
		
		System.out.print("The given 3 digit number "+num);
		int temp=num;
		
		while(num!=0) {
			
			rem=num%10;
			sum = sum + (rem*rem*rem);
			num = num/10;	
		}
		
		if(sum==temp) {
			System.out.println(" is an Amstrong Number.");
		}else {
			System.out.println(" is NOT an Amstrong Number.");
		}
		
	}

}

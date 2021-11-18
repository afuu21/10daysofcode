import java.util.Scanner;
public class freq {
	public static void main(String[] args) {
		int n,temp,d,r,count;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");	
		n = sc.nextInt();
		System.out.println("Enter the digit :");
		d = sc.nextInt();
		
		temp = n;
		while(temp!=0) {
			r = temp%10;
			if(r == d)
			count+=1;
			temp/=10;
		}
		System.out.println("Digit frequency of the given digit is " + count);
	}
}

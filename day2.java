import java.util.*;
public class day2 {
	public static void main(String[] args) {
		int arr[] = new int[10];
		int i;
		Scanner sc = new Scanner(System.in);
		for(i=0; i<10; i++) {
			arr[i] = sc.nextInt();
		}
		int count=0, temp;
		i=0;
		while(count!=arr.length()/2) {
			temp = arr[count];
			arr[count] = arr[count-i];
			arr[count-i] = temp;
			i++;
		}

		for(i=0; i<10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

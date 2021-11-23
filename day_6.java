import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String s = "";
		Scanner sc = new Scanner(System.in);
		s = sc.nextLine();
		char c;
		int count=0,sum=0;
		for(int i=0; i<s.length(); i++) {
		    c = s.charAt(i);
		    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
		    count++;
		    if(c == ' ' || i == s.length()-1) {
		    if(count%2 == 0)
		    sum+=2;
		    else
		    sum+=1;
		    count = 0;
		    }
		}
		System.out.println(sum);
	}
}

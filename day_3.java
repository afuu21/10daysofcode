public class day3 {
       public static void main(String[] args) {
              String s = "MADAM";
              int i = s.length();
              int count=0;
              while(count != i/2) {
                   if(s[count] != i/2)
                        break;
              count++;
              }
              if(count != i/2)
                 System.out.println("Not palindrome");
              else
                 System.out.println("Palindrome");
       }
}

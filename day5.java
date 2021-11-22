import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int size = 2*n-1;
         int x = 0;
         int k = n, count=0;
         for(int i=0; i<size; i++) {
           k = n;
           count = 0;
           x=i;
           for(int j=0; j<size; j++) {
              System.out.print((k-count)+ " ");
              if(j<=i && x!=0) {
                count++;x--;
              }
             
              if(j>=size-1-i) {
                count--;
              }
           }
           System.out.println();
         }
    }
}

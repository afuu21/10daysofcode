public class day4 {
    public static void main(String[] args {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int arr[] = new int[n+1];
        for(int i=0; i<n; i++)
           arr[i] = sc.nextInt();
        System.out.println("Enter the element to be searched");
        int elem = sc.nextInt();
        for(int i=0; i<n; i++)
           if(arr[i] == elem) {
              System.out.println(i);
              break;
           }
    }
}
        

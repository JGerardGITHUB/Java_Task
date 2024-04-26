import java.util.Scanner;

public class tasksheet_1_1_6 {
    int largestNumber(int a, int b, int c) {
      int largest = Math.max(a, Math.max(b, c));
      return largest;
    }   
    public static void main(String[] args) {
        tasksheet_1_1_6 s = new tasksheet_1_1_6();
        int d,e,f;
        Scanner input = new Scanner(System.in);
          System.out.println("input 1st number:");
        d = input.nextInt();
          System.out.println("input 2nd number:");
        e = input.nextInt();
          System.out.println("input 3rd number:");
        f = input.nextInt();
        
        if(d == e && e == f)
            System.out.println("all inputs are equal");
        else
            System.out.println("The Largest number is "+s.largestNumber(d, e, f));
    }
}

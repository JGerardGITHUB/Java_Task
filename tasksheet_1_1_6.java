import java.util.*;
public class tasksheet_1_1_6{
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 3 numbers");
          ArrayList<Integer> z = new ArrayList<>();
         z.add(input.nextInt());
         z.add(input.nextInt());
         z.add(input.nextInt());
         if(z.get(0)==z.get(1) && z.get(1)==z.get(2))
             System.out.println("All numbers are equal");
         else
            System.out.println("the largest number is: "+Collections.max(z));
        System.exit(0);
    }
}

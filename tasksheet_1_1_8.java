 public class tasksheet_1_1_8 {
       
      public static void main(String[] args) { 
          int[] parameters = {10, 15, 55};
   
      System.out.println("Cumulative Sums:");
        calculateCumulativeSum(parameters);
    }
      public static void calculateCumulativeSum(int... values){
          int cumulativeSum = 0;
      
          for (int value : values) {
              cumulativeSum += value; 
      System.out.println(value +" = "+ cumulativeSum);
    }
    }
    }

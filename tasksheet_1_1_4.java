public class tasksheet_1_1_4 {
    public static void main (String[]args){
        
        int score = 90;
        
        if(score >= 90  && score <= 100) 
            System.out.println("A Grade");
        else if (score >= 80 && score <= 89)
            System.out.println("B Grade");
        else if (score >= 70 && score <= 79)
            System.out.println("C Grade");
        else if (score >= 60 && score <= 69)
            System.out.println("D Grade");
        else if(score <= 59)
            System.out.println("F Grade");
    }
}

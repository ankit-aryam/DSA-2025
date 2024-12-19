import java.util.*;

public class grades {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Enter Marks: ");
        int marks = scn.nextInt();

        if(marks>90){
            System.out.println("Excellent");
        } else if(marks>80){
            System.out.println("Good");
        } else if(marks>70){
            System.out.println("Fair");
        } else if(marks>60){
            System.out.println("Meets Expectation");
        } else if(marks<60){
            System.out.println("Below Par");
        }
    }
}

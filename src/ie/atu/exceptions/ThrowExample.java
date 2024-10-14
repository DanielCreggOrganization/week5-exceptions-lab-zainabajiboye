package ie.atu.exceptions;

public class ThrowExample {
    public static void main(String[] args) {
        try{
            calculateGrade(105); //this will throw an exception
        } catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void calculateGrade(int score) {
        if (score < 0 || score > 100){
            throw new IllegalArgumentException("Grade is invalid.");
        }
        System.out.println("Grade is valid");
    }
}

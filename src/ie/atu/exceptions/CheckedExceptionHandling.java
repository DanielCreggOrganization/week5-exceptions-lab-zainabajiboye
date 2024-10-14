package ie.atu.exceptions;

import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionHandling {
    
    
    public static void main(String[] args) {
        try{
        FileReader reader = new FileReader("Zainab"); //This Line may throw IOException
        }catch (IOException e){
        System.out.println("File opened Successfully");
    }
    }
}

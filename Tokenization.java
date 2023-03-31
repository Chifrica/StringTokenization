import java.util.Scanner;
import java.util.StringTokenizer;
public class Tokenization{
    public static void main(String[] args) {
        
//         Write a JAVA program that reads a sentence (20 words with four punctuation marks). 
//           Break the sentence into individual tokens (delimiters should also be regarded as token) and PRINT the output.		
//           [NOTE: Use the Scanner class]
            
        //Declaring a Scanner
        Scanner input = new Scanner(System.in);
        //Creating a String
        System.out.println("Enter a sentece that contains at least 20 words with punctuations");
        String inputLine = input.nextLine();
        //Declaring StringTokenizer
        StringTokenizer tokenizer = new StringTokenizer(inputLine, " ,.!?\"|@#$%^&*()", true);
        //Using a while loop 
        while(tokenizer.hasMoreTokens()){
            System.out.println(tokenizer.nextToken());
        }
        
    }
}

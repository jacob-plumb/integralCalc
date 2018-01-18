import java.util.Scanner;
public class AlgorithmRunner
{
    Scanner scanner = new Scanner(System.in);
    String function;
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String function = scanner.next();
        Algorithm algorithm = new Algorithm(function);
        algorithm.printTerms();
    }
}

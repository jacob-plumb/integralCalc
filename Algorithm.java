public class Algorithm
{
    private int[][] constantExponent;
    private int A;
    private int B;
    private String[] terms;

    public Algorithm(String equation)
    {
        equation.replaceAll("\\s", "");
        String tempString = equation;
        int termCount = (equation.length() - equation.replace("+", "").length()) + (equation.length() -equation.replace("-", "").length());
        terms = new String[termCount + 1];
        for(int i = 0; i <= termCount; i++)
        {
            String symbol = posOrNeg(tempString); // ISSUE IS RIGHT HERE
            int index = tempString.indexOf(symbol);
            terms[i] = tempString.substring(0, index); //DOESNT INCLUDE SYMBOL
            System.out.println("Successful iteration " + i);
        }
    }

    public String posOrNeg(String function)
    {
        String symbol;
        int pos = function.indexOf("+");
        int neg = function.indexOf("-");
        if(pos < neg && neg >= -1)
        {
            symbol = "+";
        }
        else
        {
            symbol = "-";
        }
        return symbol;
    }

    public void printTerms()
    {
        for(int i = 0; i < terms.length; i++)
        {
            System.out.println(terms[i]);
        }
    }
}

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
        terms = new String[termCount++];
        for(int i = 0; i <= termCount; i++)
        {
            String symbol = posOrNeg(tempString);
            int index = tempString.indexOf(symbol);
            terms[i] = tempString.substring(0, index); //DOESNT INCLUDE SYMBOL
            tempString = tempString.substring(index+2);
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

/**
 * Write a description of class SumOfInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOfInput
{
    // instance variables - replace the example below with your own
    private Integer sum;

    /**
     * Constructor for objects of class SumOfInput
     */
    public SumOfInput()
    {
        // initialise instance variables
        sum = 0;
    }
    
    public Integer oneToNumber(Integer numberToSum){
        Integer sum = 0;
        for(Integer i=numberToSum;numberToSum!=0;i--){
            sum = sum +i;
            numberToSum = numberToSum - 1;
        }

        return sum;
    }

}

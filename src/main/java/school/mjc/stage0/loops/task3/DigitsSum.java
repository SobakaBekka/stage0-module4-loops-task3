package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){

       String numberAstring = t + "";
       int summa = 0;
       for(int count = 0; count < numberAstring.length() - 1; count++){
           summa += Character.getNumericValue(numberAstring.charAt(count));
       }
        System.out.println(summa);

    }
}

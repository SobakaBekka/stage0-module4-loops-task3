package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numberAsString = Math.abs(t) + "";
        int summa = 0;

        for (int count = 0; count < numberAsString.length(); count++) {
            summa += Character.getNumericValue(numberAsString.charAt(count));
        }
        System.out.println(summa);
    }
}

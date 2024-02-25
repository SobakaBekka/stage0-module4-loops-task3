package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        String numberAsString = number + ""; // Преобразование числа в строку
        int sum = 0;

        for (int i = 0; i < numberAsString.length(); i++) {
            // Получение числового значения каждого символа
            sum += Character.getNumericValue(numberAsString.charAt(i));
        }

        System.out.println(sum);
    }
}
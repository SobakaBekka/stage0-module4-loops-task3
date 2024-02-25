package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int summa = 0;
        int number = 0;
        for (int count = 0; count < lengthOfLastNumber; count++) { // Изменено условие на count < lengthOfLastNumber
            number = number * 10 + 9;
            summa += number;
        }
        System.out.println(summa);
    }
}
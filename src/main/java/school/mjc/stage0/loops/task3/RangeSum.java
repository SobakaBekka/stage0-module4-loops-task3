package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBorder, int secondBorder) {
        // Инициализируем сумму как 0
        int sum = 0;

        // Если вторая граница меньше первой, меняем их местами
        if (secondBorder < firstBorder) {
            int temp = firstBorder;
            firstBorder = secondBorder;
            secondBorder = temp;
        }

        // Вычисляем сумму чисел между двумя границами (включительно)
        for (int i = firstBorder; i <= secondBorder; i++) {
            sum += i;
        }

        // Выводим сумму
        System.out.println(sum);
    }
}
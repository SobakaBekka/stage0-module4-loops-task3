package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {

        int summa = 0;
        for (int count = firstBoarder; firstBoarder <= secondBoarder; count++) {
            summa += count;
        }
        System.out.println(summa);

    }
}
//Диапазон сумм.
//Напишите программу, которая выводит сумму между числами, заданными в качестве аргументов метода:

package school.mjc.stage0.conditions.task4;

public class TernaryGreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        int result;
        result = first > second ? first:second;
        result = second > first ? second:first;
        System.out.println(result);
    }
}

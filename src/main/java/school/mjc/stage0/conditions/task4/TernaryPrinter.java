package school.mjc.stage0.conditions.task4;

public class TernaryPrinter {
    public void printWhichIsBigger(int first, int second) {
        int result;
        result = first > second ? first:second;
        result = first < second ? second:first;
        System.out.println(result);
    }
}

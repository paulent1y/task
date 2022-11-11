package by.paulent1y;

public class Task4 {

    //пример работает только с () и []
    private static final String TASK_SEQUENCE = "[((())()(())]]";
    private static final String RIGHT_SEQUENCE = "[((()))()[(())]]"; //[((())()(())]] -> [((())*)*()*[*(())]]


    public static void main(String[] args) {
        checkSequence(TASK_SEQUENCE);
        checkSequence(RIGHT_SEQUENCE);
    }

    private static void checkSequence(String s){
        System.out.println("\nСкобочная последовательность: " + s);
        String newSequence, oldSequence=String.valueOf(s);
        do  {
            newSequence = String.valueOf(oldSequence);
            oldSequence = oldSequence.replaceFirst ("\\(\\)", "").replaceFirst("\\[]", "");
            System.out.println(newSequence + " -> " + oldSequence);
        } while (!newSequence.equals(oldSequence));
        if (newSequence.length()!=0){
            System.out.println("Последовательность неправильная. Есть непоследовательные или непарные элементы: " + newSequence);
        }
        else System.out.println("Последовательность правильная");
    }
}
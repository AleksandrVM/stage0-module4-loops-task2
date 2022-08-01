package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int i = 0;
        int limit =  multiplyByAndToInclusive == 0 ? -1 : multiplyByAndToInclusive > 0 ? multiplyByAndToInclusive : -1 * multiplyByAndToInclusive;
        while (i <= limit){
            System.out.println(i*multiplyByAndToInclusive);
            i++;
        }
    }

    public static void main(String[] arvs){
        new Multiplication().printMultiplied(-5);
    }
}

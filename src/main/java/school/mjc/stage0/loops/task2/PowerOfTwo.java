package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {

        int i = 1;
        int result = 1;
        if (power < 0)
            System.out.println("too much power");
        else
            System.out.println(result);
        while (i <= power){
            result *= 2;
            System.out.println(result);
            i++;
        }
    }
}

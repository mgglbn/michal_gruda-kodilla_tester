import java.util.Random;

public class RandomNumbers {
    Random rand;
    int sum;
    int maxValue;
    int minValue;

    public RandomNumbers() {
        this.rand = new Random();
        this.sum = 0;
        this.maxValue = 0;
        this.minValue = 30;
    }

    public void draw_start(char ch) {
        int counter = 0;
        while (sum <= 5000) {

            int number = rand.nextInt(31);
            sum += number;
            
            System.out.println("Maximal drawn value: " + get_max(number));
            System.out.println("Minimal drawn value: " + get_min(number));

            counter++;

            if (ch == 'v') {
                System.out.println("Draw: " + counter + ", Number: " + number + ", Sum: " + sum);
            }
        }
    }

    public void draw_start() {
        draw_start('a');
    }

    public int get_max(int number) {
        if (number > maxValue) {
            maxValue = number;
        }
        return maxValue;
    }

    public int get_min(int number) {
        if (number < minValue) {
            minValue = number;
        }
        return minValue;
    }


    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.draw_start('v');


    }
}
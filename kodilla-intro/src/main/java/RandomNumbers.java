import java.util.Random;
public class RandomNumbers {
    Random rand;
    int sum;
    int maxValue;
    int minValue;

    public RandomNumbers(){
        this.rand=new Random();
        this.sum=0;
        this.maxValue=0;
        this.minValue=30;
    }

    public void draw_start(char ch){
        int counter=0;
        while(sum <= 5000){

            int number=rand.nextInt(31);
            sum+=number;

            counter++;

            if (ch=='v'){
                System.out.println("Draw: "+ counter +", Number: "+ number + ", Sum: "+ sum);
            }

            if(number>maxValue){
                maxValue=number;
            }

            if(number<minValue){
                minValue=number;
            }
        }
    }

    public void draw_start(){
        draw_start('a');
    }

    public int get_max(){
        return maxValue;
    }

    public int get_min(){
        return minValue;
    }


    public static void main(String[] args) {
        RandomNumbers rn = new RandomNumbers();
        rn.draw_start('v');

        System.out.println("Maximal drawn value: "+rn.get_max());
        System.out.println("Minimal drawn value: "+rn.get_min());
    }
}

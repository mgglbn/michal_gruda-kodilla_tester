import java.util.Scanner;
public class SwitchExercise {
    public static String getColor(){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter first letter of any color:");
            char ch = scanner.next().trim().charAt(0);
            String color="";
            switch(ch){
                case 'a':
                    color="amber";
                    break;
                case 'b':
                    color="blue";
                    break;
                case 'c':
                    color="cyan";
                    break;
                case 'f':
                    color="fuchsia";
                    break;
                case 'g':
                    color="green";
                    break;
                case 'i':
                    color="indigo";
                case 'o':
                    color="orange";
                    break;
                case 'w':
                    color="white";
                    break;

                default:
                    System.out.println("Wrong input");
            }
            return color;
        }
    }

    public static void main(String[] args) {
        System.out.println(SwitchExercise.getColor());
    }

}

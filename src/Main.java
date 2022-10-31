public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        for (int a = 0; a <= 10; a++) {
            System.out.println("Iteration: " + a);
        }
        System.out.println("Task2");
        for (int a = 10; a >= 0; a--) {
            System.out.println("Iteration " + a);
        }
        System.out.println("Task3");
        for (int number = 2; number <= 17;number+=2) {
            System.out.println("Четное число:" +  number);
        }
        System.out.println("Task4");
        for (int number = 10; number >= -10; number--) {
            System.out.println("В убывающем порядке " + number);
        }
    }


}
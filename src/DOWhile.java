public class DOWhile {
    public static void main(String[] args) {
        System.out.println("Task_While_1");
        int saving = 15000;
        int sum = 0;
        int i = 0;
        while (sum <= 2459000) {
            sum = sum + saving+saving/100;
            i++;
          System.out.println("Месяц " + i + " сумма накоплений равна "+ sum);
        }
    }
}



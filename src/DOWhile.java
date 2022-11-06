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
        System.out.println("Task_While_2");
        int a = 0;
        while (a<10) {
            a++;
            System.out.print(a + " ");
        }
        System.out.println(" ");
        for (int b = 10; b>=1; b--){
            System.out.print(b + " ");
        }
        System.out.println("Task_While_3");
        int population  = 12_000_000;
        int newBorn = 17;
        int deadPeople = 8;
        int diff = newBorn-deadPeople;
        int year=0;
        while (year<=9){
            year++;
            population +=population*diff/1000;
            System.out.println("Год " + year + " чиленность населения составит " + population);
        }

    }
}



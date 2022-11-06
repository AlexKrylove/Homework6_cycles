public class DOWhile {
    public static void main(String[] args) {
                System.out.println("Task_While_3");
        int population  = 12_000_000;
        int newBorn = 17;
        int deadPeople = 8;
        int diff = newBorn-deadPeople;
        int year=0;
        while (year<=9){
            year++;
            population +=population*diff/1000;
            System.out.println("Год " + year + " численность населения составит " + population);
        }

    }
}



public class Main {
    public static void main(String[] args) {
        int contribution = 29000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + total/100;
            total = total + contribution;



            System.out.println("Месяц" + i + " , cумма накоплений равна " + total + "рублей.");
        }
    }
}

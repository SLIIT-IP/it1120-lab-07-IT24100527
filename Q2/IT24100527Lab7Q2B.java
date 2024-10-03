public class IT24100527Lab7Q2B {
    public static void main(String[] args) {

        for (int number = 1; number <= 5; number++) {

            System.out.print(number + " - ");
            
            for (int star = 1; star <= number; star++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}

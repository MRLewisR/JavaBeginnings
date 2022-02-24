public class RichOrPoor {
    public static void main(String[] args) {
        double amount = 1000;
        System.out.println("You have £" + amount);

        if (amount >= 1000000) {
            System.out.println("You're rich");
        }
        else {
            System.out.println("You're not rich");
        }
    }
}
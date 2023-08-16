public class main {
    public static void main(String[] args) {
        int initial = 200;
        int refill = 1565;
        int bonus = 0;

        if (refill > 1000) {
            bonus = refill / 100;
        }

        System.out.println(initial + refill + bonus);
        System.out.println(bonus);

    }
}

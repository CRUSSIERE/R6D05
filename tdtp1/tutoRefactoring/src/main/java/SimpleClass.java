import java.time.LocalDate;
import java.util.Locale;

public class SimpleClass {

    public SimpleClass() {
    }

    /**
     * Additionne a et b
     * @param a - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int someAdditionMethod(int a, int b) {
        return a + b ;
    }

    public static boolean isNowBetween (LocalDate startingDate, LocalDate endingDate) {
        return ( LocalDate.now().isAfter(startingDate)
                 &&
                getNow().isBefore(endingDate)
        );
    }

    private static java.lang.Object getNow() {
        return LocalDate.now();
    }

    public static void main(String[] args) {
        new SimpleClass().someAdditionMethod(1,2);

        System.out.println("Hello world");
    }
}



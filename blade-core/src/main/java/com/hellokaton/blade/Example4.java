// Example4.java
import java.util.Date;

public class Example4 {

    public void deadCodeExample() {
        int x = 10;
        if (x > 10) {
            System.out.println("This will never be printed.");  // Недостижимый код
        }
    }

    public void useDeprecatedApi() {
        Date date = new Date(2023, 10, 1);  // Устаревший конструктор, вызывает предупреждение
        System.out.println("Date: " + date);
    }

    public static void main(String[] args) {
        Example4 example = new Example4();
        example.deadCodeExample();
        example.useDeprecatedApi();
    }
}

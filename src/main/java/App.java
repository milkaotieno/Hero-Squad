//public class App {
//}
import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        get("/hello", (request, response) -> "Hello Friend! Working on IP 2");
    }
}
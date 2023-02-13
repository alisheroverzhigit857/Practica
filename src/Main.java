import task.Backend;
import task.Developer;
import task.Frontend;

public class Main {
    public static void main(String[] args) {
        Developer [] ITer = new Developer[3];
        ITer [0] = new Backend();
        ITer[1] = new Frontend();
        ITer [2] = new Developer() ;

        for (Developer a: ITer ) {
            a.coding();
        }
    }
}
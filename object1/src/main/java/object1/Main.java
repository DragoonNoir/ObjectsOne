package object1;

import java.util.logging.Logger;

public class Main {

    public static void main(String... args) {
    Person person1 = new Person("Kevis", 38, 74);
    Logger logger=Logger.getLogger(Main.class.getName());
    logger.info("This is a module-using Hello World!");    }
}

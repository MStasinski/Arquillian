package example;

import java.io.PrintStream;

/**
 * Hello world!
 */
public class App {

    public void greet(PrintStream to, String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(String name) {
        return "Hello, " + name + "!";
    }
}

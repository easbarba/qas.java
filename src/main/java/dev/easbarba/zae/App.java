package dev.easbarba.zae;

public class App {
    public static void main(String[] args) {
        var run = new Run();
        run.configuration().forEach(System.out::println);
    }

}

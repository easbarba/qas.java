package dev.easbarba.zae;

public class App {
    public static void main(String[] args) {
        var run = new Common();
        run.configuration().forEach(System.out::println);
    }

}

package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        CDBuilder cdBuilder = new CDBuilder();
        CDType type = cdBuilder.buildSonyCD("Samsung");

        type.showItems();
    }
}

package UI;

public class UI {
    private static int widthLength = 20;

    public static void printMenu() {
        System.out.println("-".repeat(widthLength));
        String[] mock = { "hi", "how", "are", "you" };

        for(int i = 0; i < mock.length; i++) {
            String word = mock[i];
            String prepad = "  (" + i + ") ";
            String remainingSpacesInLine = " ".repeat((widthLength - (word.length() + (prepad.length() + 2))));
            System.out.println("|" + prepad + word + remainingSpacesInLine + "|");
        }

        System.out.println("-".repeat(widthLength));
    }
}

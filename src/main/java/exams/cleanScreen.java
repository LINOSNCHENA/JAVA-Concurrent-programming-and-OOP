package exams;

public class cleanScreen {

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        // System.out.flush();
        // System.out.print("\u001b[2J");
        // System.out.flush();
        System.out.println();

    }

}

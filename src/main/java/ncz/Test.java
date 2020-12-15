package ncz;

public class Test {

    static int a;
    static int b;
    static int c;

    int getdata(int x, int y) {

        a = x;
        b = y;
        System.out.println("\n ================== FIRST x FUNCTION =================" + "\n");
        return a;
    }

    void add() {
        c = a + b;
        System.out.println('\n'+"Addition = " + c+'\n');
    }

}
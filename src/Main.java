public class Main {

    public static void main(String[] args) {
        Ninety_Nine_Bottles_of_Beer();
    }

    private static void Ninety_Nine_Bottles_of_Beer() {
        //Basic lines of song for conciseness in code
        String BoBs = " bottles of beer ", BoB = " bottle of beer ", OtW = "on the wall",
                ToD = "take one down, pass it around, ";

        for (int i = 99; i >= 0; i--) {
            if (i > 2) {
                System.out.println(i + BoBs + OtW + ", " + i + BoBs + "\n"
                                    + ToD + (i - 1) + BoBs + OtW + ".");
            } else if (i == 2) {
                System.out.println(i + BoBs + OtW + ", " + i + BoBs + "\n"
                        + ToD + (i - 1) + BoB + OtW + ".");
            } else if (i == 1) {
                System.out.println(i + BoB + OtW + ", " + i + BoB + "\n"
                        + ToD + "no more" + BoBs + OtW + ".");
            }
        }
    }
}


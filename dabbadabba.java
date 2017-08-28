public class dabbadabba {

    public static final int qq = 3;

        public static void dashLine() {
        for (int i = 0; i < (qq+1)*2+1; i++) {
            System.out.print("-");
        }
    }
    public static void verticalLine() {
        dashLine();
            System.out.print("| %");
              for (int i = 0; i < 4; i++) {
            System.out.print(" ");
        } System.out.print("% |" );
dashLine();
System.out.println();
    }

    public static void dashLine_bop() {
        verticalLine();
        for (int i = 0; i < qq+1; i++) 
        System.out.print(" o");
        System.out.print(" | %");
        for (int i = 0; i < 4; i++) 
        System.out.print(" ");
        System.out.print("% | ");
        for (int i = 0; i < qq+1; i++) System.out.print("o ");
        System.out.println();
        verticalLine();
    }

    public static void drawSteps() {
        for (int i = 0; i < qq; i++) {
            for (int j = 0; j < (qq+1)-i; j++) {
                System.out.print("~^"); }
            System.out.print("~/");
            for (int j = 0; j < 8+4*i; j++) { 
				System.out.print("-");
            }
            System.out.print("\\~");
            for (int j = 0; j < (qq+1)-i; j++) {
                System.out.print("^~");
                }
                System.out.println();
                for (int j = 0; j < (qq+1)-i; j++) {
                    System.out.print("^~");
                    }
                    System.out.print("/");
                        for (int j = 0; j < 10+4*i; j++) {
                    System.out.print("-"); }
                        System.out.print("\\");
                            for (int j = 0; j < (qq+1)-i; j++)
                            {
                            System.out.print("~^");
                            }
                            System.out.println();
                            for (int j = 0; j < (qq+1)*2-(2*i); j++) {
                            System.out.print(" ");
                            }
                    System.out.print("|");
                for (int j = 0; j < 10+4*i; j++) {
                            System.out.print("=");
                    }
            System.out.print("|");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
        for (int j = 0; j < (qq+1)*2+(5-i); j++) {
        System.out.print(" ");
        }
        System.out.print("/");
        for (int j = 0; j < i; j++) {
        System.out.print("/\\"); }
        System.out.println("\\");
        }
        dashLine_bop();
        drawSteps();
        System.out.print("   /");
        for (int i = 0; i < 12+4*(qq-1); i++)
        {
            System.out.print(" ");
        }
        System.out.print("\\"); System.out.println(); System.out.print("  /  ");
        for (int i = 0; i < 10+4*(qq-1); i++)
        {
            System.out.print("=");
        }
        System.out.print("  \\"); System.out.println(); System.out.print(" /  / ");
        for (int i = 0; i < 8+4*(qq-1); i++)
        { System.out.print("\""); }
        System.out.print(" \\  \\");
        System.out.println();
        System.out.print("|  | ");
        for (int i = 0; i < 10+4*(qq-1); i++) System.out.print("\"");
        System.out.print(" |  |");
        System.out.println();
        System.out.print(" \\  \\ ");
        for (int i = 0; i < 8+4*(qq-1); i++)
            System.out.print("\"");
        System.out.print(" /  /"); System.out.println();
        System.out.print("  \\  ");
        for (int i = 0; i < 10+4*(qq-1); i++) {
            System.out.print("=");
        }
        System.out.print("  /");
        System.out.println();
        System.out.print("   \\");
        for (int i = 0; i < 12+4*(qq-1); i++) { System.out.print("_"); }
        System.out.println("/");
    }
}

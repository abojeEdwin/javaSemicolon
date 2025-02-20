package sevensegment;


public class SevenSegment {


    static char displayA(int hex){
        return ((hex >> 6) & 1) == 1 ? 'A' : '#';
    }

    static char displayB(int hex){
        return ((hex >> 5) & 1) == 1 ? 'B' : '#';
    }
    static char displayC(int hex){
        return ((hex >> 4) & 1) == 1 ? 'C' : '#';
    }
    static char displayD(int hex){
        return ((hex >> 3) & 1) == 1 ? 'D' : '#';
    }
    static char displayE(int hex){
        return ((hex >> 2) & 1) == 1 ? 'E' : '#';
    }
    static char displayF(int hex){
        return ((hex >> 1) & 1) == 1 ? 'F' : '#';
    }
    static char displayG(int hex){
        return (hex & 1) == 1 ? 'G' : '#';
    }

    public static void main(String[] args){




        System.out.print("\n" +
                "          AA \n" +
                "         F  B\n" +
                "         F  B\n" +
                "          GG\n" +
                "         E  C\n" +
                "         E  C\n" +
                "          DO  \n" +
                "                "
        );

        int zero = 0x7E;
        System.out.printf(
            "\n %c%c\n",displayA(zero),displayA(zero));
                System.out.printf(
                    "%c  %c\n",displayF(zero),displayB(zero));
        System.out.printf("""
                """+
                "%c  %c\n",displayF(zero),displayB(zero));
        System.out.printf("""
                """+
                " %c%c\n",displayG(zero),displayG(zero));
        System.out.printf("""
                """+
                "%c  %c\n",displayE(zero),displayC(zero));
        System.out.printf("""
                """+
                " %c%c\n",displayD(zero),displayD(zero));
                         
                 
 } 
}
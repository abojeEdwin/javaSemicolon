package sevensegment;


public class SevenSegment {


    static char A(int hex){
        return ((hex >> 6) & 1) == 1 ? 'A' : '#';
    }

    static char B(int hex){
        return ((hex >> 5) & 1) == 1 ? 'B' : '#';
    }
    static char C(int hex){
        return ((hex >> 4) & 1) == 1 ? 'C' : '#';
    }
    static char D(int hex){
        return ((hex >> 3) & 1) == 1 ? 'D' : '#';
    }
    static char E(int hex){
        return ((hex >> 2) & 1) == 1 ? 'E' : '#';
    }
    static char display(int hex){
        return ((hex >> 1) & 1) == 1 ? '*' : '#';
    }
    static char F(int hex){
        return (hex & 1) == 1 ? '*' : '#';
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
            "\n %c%c\n",display(zero>> 6),display(zero>>6));
                System.out.printf(
                    "%c  %c\n",display(zero>>1),display(zero>>5));
        System.out.printf("""
                """+
                "%c  %c\n",display(zero>>1),display(zero>>5));
        System.out.printf("""
                """+
                " %c%c\n",display(zero),display(zero));
        System.out.printf("""
                """+
                "%c  %c\n",display(zero>>2),display(zero>>4));
        System.out.printf("""
                """+
                "%c  %c\n",display(zero>>2),display(zero>>4));
        System.out.printf("""
                """+
                " %c%c\n",display(zero>>3),display(zero>>3));
                         
                 
 } 
}
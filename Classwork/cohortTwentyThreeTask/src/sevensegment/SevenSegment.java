package sevensegment;


public class SevenSegment {


    static char A(int hex){
        return display(hex >> 6);
    }

    static char B(int hex){
        return display(hex >> 5);
    }
    static char C(int hex){
        return display(hex >> 4);
    }
    static char D(int hex){
        return display(hex >> 3);
    }
    static char E(int hex){
        return display(hex >> 2);
    }
    static char F(int hex){
        return display(hex >> 1);
    }
    static char G(int hex){
        return display(hex );
    }
    static char display(int hex){
        return (hex & 1) == 1 ? '#' : '*';
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

        int zero = 0x30;
        System.out.printf(
            "\n %c%c\n",A(zero),A(zero));
                System.out.printf(
                    "%c  %c\n",F(zero),B(zero));
        System.out.printf("""
                """+
                "%c  %c\n",F(zero),B(zero));
        System.out.printf("""
                """+
                " %c%c\n",display(zero),display(zero));
        System.out.printf("""
                """+
                "%c  %c\n",E(zero),C(zero));
        System.out.printf("""
                """+
                "%c  %c\n",E(zero),C(zero));
        System.out.printf("""
                """+
                " %c%c\n",D(zero),D(zero));
                         
                 
 } 
}
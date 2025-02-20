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
        return (hex & 1) == 1 ? '#' : ' ';
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

        int num[] = {0x7E, 0x30 ,0x6D , 0x79 , 0x33 ,
                    0x5B , 0X5F, 0x70 , 0x7F, 0x78
                    };

        int size = 10;
        for(int i=0; i< size; i++) {
            System.out.printf(
                    "\n %c%c\n", A(num[i]), A(num[i]));
            System.out.printf(
                    "%c  %c\n", F(num[i]), B(num[i]));
            System.out.printf("""
                    """ +
                    "%c  %c\n", F(num[i]), B(num[i]));
            System.out.printf("""
                    """ +
                    " %c%c\n", display(num[i]), display(num[i]));
            System.out.printf("""
                    """ +
                    "%c  %c\n", E(num[i]), C(num[i]));
            System.out.printf("""
                    """ +
                    "%c  %c\n", E(num[i]), C(num[i]));
            System.out.printf("""
                    """ +
                    " %c%c\n", D(num[i]), D(num[i]));
            System.out.println();

        }
 } 
}
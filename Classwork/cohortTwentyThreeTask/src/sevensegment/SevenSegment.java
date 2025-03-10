package sevensegment;
import java.util.Scanner;
public class SevenSegment {



    static char A(int hex){
        return display(hex >> 6);
    }
    static char B(int hex){
        return display(hex >> 5);
    }

    static char C(int hex){ return display(hex >> 4); }

    static char D(int hex){ return display(hex >> 3); }

    static char E(int hex){return display(hex >> 2);}
    static char F(int hex){return display(hex >> 1);}
    static char G(int hex){return display(hex  );}
    static char display(int hex){if((hex & 1) == 1){return '#';}else {return ' ';}}


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hex = 0x7E;

        while (true) {
            String option = """
                    Display 1 -> Press 1
                    Display 2 -> Press 2
                    Display 3 -> Press 3
                    Display 4 -> Press 4
                    Display 5 -> Press 5
                    Display 6 -> Press 6
                    Display 7 -> Press 7
                    Display 8 -> Press 8
                    Display 9 -> Press 9
                    Display 0 -> press 0
                    Display A -> press A
                    Display B -> press B
                    Display C -> press C
                    Display D -> press D
                    Display E -> press E
                    Display F -> press F
                    
                    """;
            System.out.print(option);
            String choice = input.nextLine();


            switch (choice) {
                case "1":
                    hex = 0X30;
                    break;
                case "2":
                    hex = 0x6D;
                    break;
                case "3":
                    hex = 0x79;
                    break;
                case "4":
                    hex = 0x33;
                    break;
                case "5":
                    hex = 0x5B;
                    break;
                case "6":
                    hex = 0x5F;
                    break;
                case "7":
                    hex = 0x70;
                    break;
                case "8":
                    hex = 0x7F;
                    break;
                case "9":
                    hex = 0x7B;
                    break;
                case "0":
                    hex = 0x7E;
                    break;
                case "A":
                    hex = 0x77;
                    break;
                case "B":
                    hex = 0x1f;
                    break;
                case "C":
                    hex = 0x4E;
                    break;
                case "D":
                    hex = 0x3D;
                    break;
                case "E":
                    hex = 0x4F;
                    break;
                case "F":
                    hex = 0x47;
                    break;
                default:
                    System.out.println("please use a valid input display");
                    break;
            }


            System.out.printf(
                    "\n %c%c\n", A(hex), A(hex));
            System.out.printf(
                    "%c  %c\n", F(hex), B(hex));
            System.out.printf("""
                    """ +
                    "%c  %c\n", F(hex), B(hex));
            System.out.printf("""
                    """ +
                    " %c%c\n", G(hex), G(hex));
            System.out.printf("""
                    """ +
                    "%c  %c\n", E(hex), C(hex));
            System.out.printf("""
                    """ +
                    "%c  %c\n", E(hex), C(hex));
            System.out.printf("""
                    """ +
                    " %c%c\n", D(hex), D(hex));
            System.out.println();

        }
    }

        }



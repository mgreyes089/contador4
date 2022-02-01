import java.util.Scanner;

public class InvertedNameJava {

        public static void main(String[] args) {
            String name1 = askForUserName();
            String name2 = askForUserName();
            name2 = revertName(name2);
            System.out.println("Result: " + name1 + name2);
        }

        private static String revertName(String name2) {
            String inverted = "";
            for (int i = name2.length() - 1; i >= 0; i--) {

                inverted += name2.substring(i, i + 1);
                System.out.print(inverted);

            }
            return inverted;
        }

        private static String askForUserName() {
            System.out.println("Escriba el nombre:");
            Scanner sc = new Scanner(System.in);
            return sc.nextLine();
        }


    }



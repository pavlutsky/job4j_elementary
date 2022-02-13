package lessons;

    public class Exercise {

        public static String checkNumber(int number) {
            if (number % 15 == 0)  {
                return "Hello, World!!!";
            } else if (number % 5 == 0)  {
                return "World";
            }
            if (number % 3 == 0)  {
                return "Hello";
            } else {
                return "Operation not support";
            }
        }

        public static void main(String[] args) {
           String rsl = Exercise.checkNumber(16);
           System.out.println(rsl);
        }
    }
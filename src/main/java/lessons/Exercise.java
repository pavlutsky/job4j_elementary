package lessons;

    public class Exercise {

        public static double div(double y) {
            double i = y / 6;
            int l = (int) i;
            if (l != i) {
                System.out.println(y + " не делится на 6");
            } else {
                System.out.println(y + " делится на 6");
            }
            return i;
        }

        public static void main(String[] args) {
            double rsl = Exercise.div(573723768);
            rsl = Exercise.div(573723761);
        }

    }

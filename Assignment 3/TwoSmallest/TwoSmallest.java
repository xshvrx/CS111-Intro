public class TwoSmallest {
    public static void main(String[] args) {
            double min1 = Double.parseDouble(args[0]);
            double min2 = Double.parseDouble(args[1]);
            double num;
            for (int i = 1; i < args.length; i++) {
                num = Double.parseDouble(args[i]);
                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }
            System.out.println(min1);
            System.out.println(min2);
    }
}

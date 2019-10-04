package adder1;

public class Adder1 {

   public static int addOne(int x) {
      return x + 1;
   }

   public static void main(String[] args) {
      if (args.length != 1) {
	 System.err.println("Usage: java adder1.Adder1 _number_");
	 System.exit(2);
      }

      int x = Integer.parseInt(args[0]);

      System.out.println( addOne(x) );
   }
}

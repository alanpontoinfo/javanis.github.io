 interface Aquatic {
 public default int getNumberOfGills(int input) { return 2; }
 }
 public class ClownFish implements Aquatic {
 public int getNumberOfGills() { return 4; }
 public int getNumberOfGills(int input) { return 6; }
 public static void main(String[] args) {
 System.out.println(new ClownFish().getNumberOfGills(-1));
 }
 }
package Book.Str;


public class ConvertToBinHexOct {
    public static void main(String[] args) {
        int i = 1;
        for (int j=0; j<100; j++) {
            i++;
            System.out.println("-----------------------------------------");
            System.out.println(i + " = " + Integer.toBinaryString(i));
            System.out.println(i + " = " + Integer.toHexString(i));
            System.out.println(i + " = " + Integer.toOctalString(i));
            System.out.println("-----------------------------------------");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error");
            }
        }
    }
}

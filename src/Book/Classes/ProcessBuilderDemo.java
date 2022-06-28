package Book.Classes;

public class ProcessBuilderDemo {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("Program.java", "start");
            pb.start();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}

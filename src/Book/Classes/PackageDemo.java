package Book.Classes;


public class PackageDemo {
    public static void main(String[] args) {
        Package[] pack;
        pack = Package.getPackages();
        for (Package x : pack) {
            System.out.println(x.getName());
        }


    }
}

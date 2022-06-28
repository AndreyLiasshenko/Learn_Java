package Book.Package;

public class Derived extends Protection {

    public Derived() {
        System.out.println("Constructor the subclass");
        System.out.println("protected field "+ pro);
        System.out.println("public field " + pub);
        System.out.println("default field " + def);
//      System.out.println("private field "+ pri);         Error access!
    }
}

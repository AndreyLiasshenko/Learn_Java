package Book.Package;

public class Protection {
    private int pri =1;
    protected int pro = 2;
    public int pub = 3;
    int def = 4;

    public Protection() {
        System.out.println("Constructor basic class");
        System.out.println("private field "+ pri);
        System.out.println("protected field " + pro);
        System.out.println("public field "+ pub);
        System.out.println("default field "+ def);
    }
}



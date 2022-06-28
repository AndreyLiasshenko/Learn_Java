package Book.Interface;

public interface DefaultMethod {
    public int getNumber();

    default String getString(){
        return "This default method in the interface returns a string";
    }

    static int getDefaultNumber() {
        return 0;
    }

}

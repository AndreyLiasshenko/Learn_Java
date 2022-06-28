package Book.Enums;

public enum Peoples {
    Tom("London"), Alex("Tokio"), Mark("Kyiv"), Ann("Stambul"), Alise("Odessa"), Jane("Kherson"), Emilia("London");

    private String city;
    Peoples(String city) {
        this.city = city;
    }

    String getCity() {
        return city;
    }
}

class EnumDemo {
    public static void main(String[] args) {
        Peoples pep;
        pep = Peoples.Jane;
        System.out.println("Value pep: " + pep);
        System.out.println();

        pep = Peoples.Emilia;
        if (pep == Peoples.Emilia) {
            System.out.println(true);
        }

        switch (pep) {
            case Alise:
                System.out.println("Alise is blond");
                break;
            case Emilia:
                System.out.println("Emilia is brunet");
                break;
        }

        Peoples values[] = Peoples.values();

        for (Peoples x : values) {
            System.out.println(x +": "+ x.getCity());
        }
        System.out.println("------------------------------");
        System.out.println(Peoples.valueOf("Emilia"));
        System.out.println(".ordinal() -->>   "+ Peoples.Mark.ordinal());
        System.out.println(".compareTo() -->>   "+ Peoples.Tom.compareTo(Peoples.Emilia));
    }
}

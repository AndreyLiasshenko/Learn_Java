package Book.Java_util.CollectionFramework;

import java.util.LinkedList;

class Adress {
    private String name;
    private String lastName;
    private String city;
    private String adress;
    private String speciality;
    private int age;
    private long number;

    Adress(String name, String lastName, String city, String adress, String speciality, int age, int number) {
        this.name = name;
        this.lastName = lastName;
        this.city = city;
        this.adress = adress;
        this.speciality = speciality;
        this.age = age;
        this.number = number;
    }

    public String toString(){
        return  "\n"+
                "Name:       "+ name +"\n" +
                "Lastname:   " + lastName + "\n" +
                "City:       " + city +"\n"+
                "Adress:     " + adress + "\n" +
                "Speciality: " + speciality +"\n" +
                "Age:        " + age + "\n" +
                "Number:     +" + number + "\n";
    }

}

public class CollectionWithOwnClasses {
    public static void main(String[] args) {
        LinkedList<Adress> ob = new LinkedList<>();
        ob.add(new Adress("Alex", "Marks", "London", "Hero square 19", "Doctor", 41, 1203324343));
        System.out.println(ob.toString());
    }
}
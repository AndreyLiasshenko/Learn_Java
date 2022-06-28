package Book.Exersice;
//1 Создайте класс Phone, который содержит переменные number, model и weight.
// 2 Создайте три экземпляра этого класса.
// 3 Выведите на консоль значения их переменных.
// 4 Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
//5 Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
// 6 Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
// 7 Добавить конструктор без параметров.
// 8 Вызвать из конструктора с тремя параметрами конструктор с двумя.
//9 Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
// 10 Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.


import java.util.Arrays;

public class Phone {
    private String number;
    private int model;
    private int weight;

    Phone() {
    }
    Phone(String n, int m, int w){
        number =n;
        model = m;
        weight = w;
    }

    Phone(String  n, int m) {
        number = n;
        model = m;
    }

    void receiveCall(String name) {
        System.out.println("Calling is "+name);
    }

    String getNumber() {
        return number;
    }

    void receiveCall(String name, String number) {
        System.out.println("Calling is "+ name+ ". Number is "+ number);
    }

    void sendMessage(String... n) {
        System.out.println(Arrays.toString(n));
    }
}

class TestPhone{
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.sendMessage( "09854545", "055454545", "0963343434", "050343434");
    }
}

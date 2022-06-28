package Book.Java_util.CollectionFramework;
import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name, number, state;
        FileInputStream fin = null;
        boolean changed = false;

        try {
            fin = new FileInputStream("phonebook.dat");
        } catch (FileNotFoundException e) {
            // ignore if file not found
        }

        try {
            if (fin != null) {
                prop.load(fin);
                fin.close();
            }
        } catch (IOException e) {
            System.out.println("Error reading file");
        }

        do {
            System.out.println("Write name person (leave for finish) -> ");
            name = br.readLine();
            if (name.equals("leave")) continue;
            System.out.println("Write number -> ");
            number = br.readLine();

            prop.put(name, number);

            changed = true;
        } while (!name.equals("leave"));

        if (changed) {
            FileOutputStream fout = new FileOutputStream("phonebook.dat");
            prop.store(fout, "telephone book");
            fout.close();
        }

        do {
            System.out.print("Write name person for seach (leave for finish) -> ");
            name = br.readLine();
            if (name.equals("leave")) continue;
            System.out.println();
            number = (String) prop.get(name);
            System.out.println(number);
        } while (!name.equals("leave"));

        do {
            System.out.println("Write 'print' for show all numbers, 'leave' for exit");
            state = br.readLine();
            if (state.equals("leave")) continue;
            Set<?> setNum = prop.keySet();

            ArrayList<String> arrL = new ArrayList<>(); // масив для ключей

            // передаем все ключи в масив
            for (Object x : setNum) {
                arrL.add(x.toString());
            }

            int max =0;
            // ищем длинну самого длинного ключа
            for (String x : arrL) {
                if (x.length() > max) max = x.length();
            }

            for (String x : arrL) {
                System.out.print(x);
                // разделяем ключи и значения на равное расстояние при выводе
                // в консоль
                for (int j = 0; j < (max - x.length() + 1); j++) {
                    System.out.print(" ");
                }
                number = (String) prop.get(x);
                System.out.println(number);
            }

        } while (!state.equals("leave"));
    }
}

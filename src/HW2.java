import java.util.ArrayList;
import java.util.Arrays;

public class HW2 {

    /*
Создать список (ArrayList или LinkedList) строк
Положить туда сколько угодно цветов с помощью метода add()
Вывести на экран список (через sout)
Удалить цвет "Синий"
Вывести на экран список
Удалить второй по индексу цвет с помощью метода remove()
Вывести на экран список
Добавить удаленные цвета обратно в начало списка с помощью метода add()
Вывести на экран список
*/
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("orange");
        colors.add("yellow");
        colors.add("green");
        colors.add("blue");
        colors.add("purple");

        System.out.println(colors);

        colors.remove("blue");
        System.out.println(colors);

        colors.remove(2);
        System.out.println(colors);

        colors.add(0,"yellow");
        colors.add(1,"blue");
        System.out.println(colors);


    }
}

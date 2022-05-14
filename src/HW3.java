import java.util.LinkedList;
import java.util.TreeSet;

public class HW3 {
    /*
Создать список, заполнить его элементами целых чисел
Вывести элементы списка без повторений
(Лучше всего каким-либо образом использовать множества)
[1,2,3,3,3,4,4,5] -> [1,2,3,4,5]
 */
    public static void main(String[] args) {

        LinkedList<Integer> numList = new LinkedList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        numList.add(1);
        numList.add(1);
        numList.add(2);
        numList.add(3);
        numList.add(3);
        numList.add(3);
        numList.add(4);
        numList.add(4);
        numList.add(5);
        numList.add(5);


        System.out.println(numList);
        treeSet.addAll(numList);
        System.out.println(treeSet);

//         while (!numList.isEmpty()){
//            for (int i = 0; i < (numList.size()-1); i++) {
//                if (!numList.get(i).equals(numList.get(i + 1))) {
//
//                    treeSet.add(numList.get(i));
//
//                    numList.remove(i);
//
//                    System.out.println(numList);
//                    System.out.println(treeSet);
//                    //numList.remove(i);
//                }
//
//
////            }
//
//
//        }

//        for (int i = numList.size()-1; i >0 ; i--) {
//            if (!numList.get(i).equals(numList.get(i - 1))) {
//                //numList.remove(i);
//                treeSet.add(numList.get(i));
//
//            }
//
//        }


//        for (int i = 0; i < (numList.size()-1); i++) {
//            if (!numList.get(i).equals(numList.get(i + 1))) {
//                //numList.remove(i);
//                treeSet.add(numList.get(i));
//
//            }
//
//        }


//        System.out.println(hashSet);
//        hashSet.remove("zxc");
//        System.out.println(hashSet);
//        System.out.println(hashSet.contains("asd"));
//        System.out.println(hashSet.contains("zxc"));
//        System.out.println(hashSet.size());


    }
}


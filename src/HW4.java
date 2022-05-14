import java.util.HashMap;
import java.util.LinkedList;


public class HW4 {

    /*
Создать список, заполнить его элементами целых чисел
Вывести все уникальные элементы списка и то, сколько раз они встречались в исходном списке
(Лучше всего каким-либо образом использовать словари)
[1,2,3,3,3,4,4,5] -> {1=1,2=1,3=3,4=2,5=1}
 */
    public static void main(String[] args) {

        LinkedList<Integer> numbList = new LinkedList<>();
        HashMap<Integer,Integer> hashMap = new HashMap<>();

        numbList.add(1);
        numbList.add(1);
        numbList.add(2);
        numbList.add(3);
        numbList.add(3);
        numbList.add(3);
        numbList.add(4);
        numbList.add(4);
        numbList.add(5);


        // System.out.println(numbList.indexOf(1));

//        for (Integer n : numbList){
//            System.out.println(numbList.indexOf(n));


        for (int i = 0; i < numbList.size()-1; i++){
                int k = 1;

                if (numbList.get(i).equals(numbList.get(i + 1))){
                    k++;
                    hashMap.put(numbList.get(i),k);
                    System.out.println(hashMap);
                    
                } else {
                    hashMap.put(numbList.get(i),1);
                    hashMap.put(numbList.get(i+1),1);
                    System.out.println(hashMap);

                }
            }


//        LinkedList<Integer> strs = (LinkedList<Integer>)numbList.clone();
//        System.out.println(strs);
//
//        int k = 1;
//        for (int i = 0; i < numbList.size()-1; i++){
//        while (numbList.contains(numbList.get(i))){
//
//            strs.remove(i);
//        k++;
//        }}
//        System.out.println(numbList);

        System.out.println(hashMap);
//
//        }


    }

}

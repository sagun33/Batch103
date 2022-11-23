package day30collections;

import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.Callable;

public class Serbest {
    public static void main(String[] args) {
//        LinkedList<String> names = new LinkedList<>();
//        names.add("Chris");
//        names.add("Alexandre");
//        names.add("Mark");
//        names.add("Tom");
//        names.add("Jeremy");
//        names.add("Hans");
//        System.out.println(names);// [Chris, Alexandre, Mark, Tom, Jeremy, Hans]
//
//        /*
//            Retrieves, but does not remove, first element of this list.
//            Returns: the first element of this list, or "null" if this list is empty
//         */
//        System.out.println("names.peek() = " + names.peek());
//        System.out.println("names.peekFirst() = " + names.peekFirst());
//        System.out.println("names.peekLast() = " + names.peekLast());
//        System.out.println("names.pollFirst() = " + names.pollFirst());
//      names.add("Ali");
//        System.out.println(names);
//        names.add(1,"Salih");
//        names.addAll(0, Collections.singleton("Seniha"));
//        System.out.println(names);
//        System.out.println(names);
//        System.out.println(names);
//
//
//        LinkedList<String>myList=new LinkedList<>();
//        System.out.println("myList.peek() = " + myList.peek());
//        System.out.println("myList.peekFirst() = " + myList.peekFirst());
//        System.out.println("myList.poll() = " + myList.poll());
//        System.out.println("myList.pollFirst() = " + myList.pollFirst());
//        System.out.println("myList.pollFirst() = " + myList.pollFirst());
//        System.out.println("myList.size() = " + myList.size());

        //Example 1: "A" ile baslayan tum isimleri "*****" e ceviriniz.
//        LinkedList<String> students = new LinkedList<>();
//        students.add("Chris");
//        students.add("Alexandre");
//        students.add("Mark");
//        students.add("Tom");
//        students.add("Jeremy");
//        students.add("Hans");
//        students.add("Ali");
//        students.add("Ahmet");
//
//        System.out.println(students);
////String b="";
////        for (String w:students
////             ) {
////
////           students.set(students.indexOf(w),"******");
////
////        }
////        System.out.println(b);
//
//        //Interview Sorusu:
//        //Example 2: List'deki 4 harften cok harf iceren isimleri siliniz.
//        //Eleman sayisini azaltacagimiz icin i ye ihtiyacimiz var ,o yuzden for-each loop degil for loop kullaniyoruz.
//
//        for (int i = 0; i <students.size() ; i++) {
//            if (students.get(i).length()>4){
//                students.remove(students.get(i));
//                i--;
//            }
//
//
//        }
//        System.out.println(students);
//        Long baslangis = LocalTime.now().toNanoOfDay();
//       HashSet<String>b=new HashSet<>();
//        emails.add("a@gmail.com");
//        emails.add("y@gmail.com");
//        emails.add("c@gmail.com");
//        emails.add("m@gmail.com");
//        emails.add("b@gmail.com");
//        emails.add("z@gmail.com");
//        emails.add("k@gmail.com");
//        emails.add("d@gmail.com");
//
//        System.out.println(emails);
//        Long bitis=LocalTime.now().toNanoOfDay();
//        System.out.println(bitis-baslangis);
//
//        Long ilk = LocalTime.now().toNanoOfDay();
//        HashSet<String> emails2 = new HashSet<>();
//        emails2.add("a@gmail.com");
//        emails2.add("y@gmail.com");
//        emails2.add("c@gmail.com");
//        emails2.add("m@gmail.com");
//        emails2.add("b@gmail.com");
//        emails2.add("z@gmail.com");
//        emails2.add("k@gmail.com");
//        emails2.add("d@gmail.com");
//        TreeSet<String>degisiklik=new TreeSet<>(emails2);
//        System.out.println(emails2);
//        Long son=LocalTime.now().toNanoOfDay();
//        System.out.println(son-ilk);

     HashMap<String, Integer> studentAges = new HashMap<>();
     studentAges.put("Ali", 13);
     studentAges.put("Tom", 21);
     studentAges.put("Brad", 12);
     studentAges.put("Ajda", 76);
     studentAges.put("Cuneyt", 75);
     studentAges.put("Ali", 88);//Ayni key degerini tekrar kullandiginizda hata vermez "overwrite" yapar
     studentAges.put(null, 55);
     studentAges.put(null, 66);
     studentAges.put("Ayhan Isik", null);
     studentAges.put("Sadri Alisik", null);

     Set<String>key=studentAges.keySet();
     System.out.println(key);
     Collection<Integer>a=studentAges.values();
     System.out.println(a);
     Integer c=studentAges.get("Cuneyt");
     System.out.println("c = " + c);
     System.out.println("studentAges.get(\"Tom\") = " + studentAges.get("Tom"));

     //Example 1: Tum integer yaslarin ortalamasini hesaplayan kodu yaziniz.




    }
}

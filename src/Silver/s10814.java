package Silver;

import java.util.*;

public class s10814 {
    static class Person{
        int age;
        String name;
        public Person(int age,String name){
            this.age=age;
            this.name=name;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            list.add(new Person(age,name));
        }

        list.sort(Comparator.comparingInt(p->p.age));
        for(Person p:list){
            System.out.println(p.age+" "+p.name);
        }
//        Map<Integer, String> map = new TreeMap<>();  오류 이런 해쉬맵이나 트리맵은 기존의 값이 중복이 되면 덮어 써버린다,..
//        for (int i = 0; i < n; i++) {
//            map.put(sc.nextInt(),sc.next());
//        }
//        Arrays.sort(map.keySet().toArray(new Integer[0]));
//        for (Integer key : map.keySet()) {
//            System.out.println(key + " " + map.get(key));
//        }
    }
}

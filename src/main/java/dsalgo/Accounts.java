package dsalgo;

import java.util.*;

/*
  // <John e1, e2> , <John e3,e4>, <John e4,e2>
        // John e1,e2
        //John e3,e4
        //John e1, e2, e4

        //e1,  e2
        //e3, e4

       // John e1-e2 e3-e4 e2-e4

        Map<String, List<String> > map = new HashMap<>();

        //e1, e2
        //e2, e1,e4
        //e3, e4
        //e4, e3,e2

        for(List<String> n: accountinput){
            for(String email: )
        }





public class Accounts {

    public static void main(String[] args) {
        HashMap<String,List<String>> map1 = new HashMap<>();
        Set<String> set1 = new HashSet<>();
       List<Person>  personList = new ArrayList<>();
       List<String> email1 = new ArrayList<>();
       email1.add("e1");
       email1.add("e2");
       Person p1 = new Person("John",email1);

        List<String> email2 = new ArrayList<>();
        email2.add("e3");
        email2.add("e4");
        Person p2 = new Person("John",email2);
        List<String> email3 = new ArrayList<>();
        email3.add("e4");
        email3.add("e2");
        Person p3 = new Person("John",email3);
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
       HashMap<String, Set<String>> finalMap = new HashMap(); // key - Name, value - set<emails>
        List<String> email = new ArrayList<>();
       for(Person p: personList) {
           map1.put(p.getName(),p.getEmail());
           set1.addAll(p.getEmail());

       }






    }





    }


}

class Person{

    String name;
    List<String> email;

    Person(String name, List<String> email){
        this.name = name;
        this.email.addAll(email);
    }

    List<String> getEmail(){
        return this.email;
    }

    public String getName() {
        return name;
    }


}
 */
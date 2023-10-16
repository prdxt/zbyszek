package pl.gornik;

import pl.gornik.model.Komparator;
import pl.gornik.model.osoba;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> setHash = new HashSet<>();
        Set<Integer> setLinked = new LinkedHashSet<>();
        Set<Integer> setTree = new TreeSet<>();
        List<Integer> list = new ArrayList<>();


        Random random = new Random();
        int i = 0;
        while (i < 20){
            int number = random.nextInt(100);
            setHash.add(number);
            setLinked.add(number);
            setTree.add(number);
            list.add(number);
            i++;
        }

//        System.out.println("HashSet \n" + setHash);
//        System.out.println("LinkedHashSet \n" + setLinked);
//        System.out.println("TreeSet \n" + setTree);
//        System.out.println("Lista \n" + list);
//
//        List<Integer> list1 = new LinkedList<>(setLinked);
//        System.out.println("LinkedList \n" + list1);
//        System.out.println("Element listy \n" + list1.get(3));
//        System.out.println(list1.size());
//        System.out.println(list1.contains(27));


        Komparator comp = new Komparator();

        Set<osoba> osoby = new HashSet<>();
        osoba osoba1 = new osoba("Zbyszek","Kucharski",42,"02031024110");
        osoba osoba2 = new osoba("Piotr","Łata",42,"02031020210");
        osoba osoba3 = new osoba("Agnieszka","Kasprzycka",42,"02031920210");
        osoba osoba4 = new osoba("Aneta","Łata",42,"02031020219");
        osoba osoba5 = new osoba("Waldemar","Łata",42,"02031020210");

        osoby.add(osoba1);
        osoby.add(osoba2);
        osoby.add(osoba3);
        osoby.add(osoba4);
        osoby.add(osoba5);


        //f



        Set<osoba> osobyTree = new TreeSet<>(comp);
        osobyTree.add(osoba1);
        osobyTree.add(osoba2);
        osobyTree.add(osoba3);
        osobyTree.add(osoba4);
        osobyTree.add(osoba5);
        for(osoba osoba : osobyTree) System.out.println(osoba);

    }
}
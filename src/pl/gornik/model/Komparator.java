package pl.gornik.model;

import java.util.Comparator;

public class Komparator implements Comparator<osoba> {
    @Override
    public int compare(osoba p1, osoba p2) {
        return p1.getSurname().compareTo(p2.getSurname());
    }
}

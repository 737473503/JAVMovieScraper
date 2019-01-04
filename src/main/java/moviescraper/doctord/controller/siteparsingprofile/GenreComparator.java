package moviescraper.doctord.controller.siteparsingprofile;

import moviescraper.doctord.model.dataitem.Genre;

import java.util.Comparator;

public class GenreComparator implements Comparator<Genre> {

    @Override
    public int compare(Genre o1, Genre o2) {
        return o1.getWeight() - o2.getWeight();
    }
}

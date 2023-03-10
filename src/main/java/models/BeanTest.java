package models;

import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        Album whiteAlbum = new Album();
        whiteAlbum.setId(1);
        whiteAlbum.setAlbumName("The White Album");
        whiteAlbum.setArtist("The Beatles");
        whiteAlbum.setGenre("Rock");
        whiteAlbum.setReleaseDate(1970);
        whiteAlbum.setSales(20000000.99);
        System.out.println(whiteAlbum);

        Author bob = new Author();
        bob.setId(2);
        bob.setFirstName("bob");
        bob.setLastName("smith");

        ArrayList<Quote> quotes = new ArrayList<>();
        Quote quote = new Quote();
        quote.setId(3);
        quote.setContent("I like pizza");
        quote.setAuthor(bob);
        quotes.add(quote);

        quote = new Quote();
        quote.setId(4);
        quote.setContent("Servlets meh");
        quote.setAuthor(bob);
        quotes.add(quote);

        System.out.println(quotes);

        for (Quote quote1 : quotes) {
            System.out.println(quote1);
        }
    }
}

package models;

import lombok.*;

import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Album implements Serializable {
    private int id;
    private String artist;
    private String albumName;
    private int releaseDate;
    private double sales;
    private String genre;

}

package models;

import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Quote implements Serializable {
    private int id;
    private String content;
    private Author author;
}

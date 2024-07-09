package mr.green.learning.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang.RandomStringUtils;

@Entity
@Getter
@Setter
@Table(name = "book")
@NoArgsConstructor
public class Book {


    @Id
    private Integer id;
    private String name;

    @Column(name = "author_id")
    private Integer authorId;

    private Book(String name, Integer authorId) {
        this.name = name;
        this.authorId = authorId;

    }


    public static Book withRandomName() {
        return new Book(randomName().concat(" ").concat(randomName()), 1);
    }

    private static String randomName() {
        int length = 10;
        boolean useLetters = true;
        boolean useNumbers = false;
       return RandomStringUtils.random(length, useLetters, useNumbers);
    }
}

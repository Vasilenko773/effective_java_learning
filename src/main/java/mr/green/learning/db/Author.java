package mr.green.learning.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "author")
@NoArgsConstructor
public class Author {

    @Id
    private Integer id;
    private String name;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "author_id")
    List<Book> books = new ArrayList<>();

    public void add(Book book) {
        this.books.add(book);
    }
}

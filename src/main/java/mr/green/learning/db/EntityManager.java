package mr.green.learning.db;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class EntityManager {

    private final AuthorJpaRepository authorJpaRepository;
    private final BookJpaRepository bookJpaRepository;

    public void createAndSave() {
        Author author = new Author();
        author.setId(1);
        author.setName("МАЗАФАКЕР");

        for (int i = 1; i < 1000_000; i++) {
            Book book = Book.withRandomName();
            book.setId(i);
            author.add(book);
        }
        authorJpaRepository.save(author);
    }
}

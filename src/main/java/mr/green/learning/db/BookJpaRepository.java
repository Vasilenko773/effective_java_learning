package mr.green.learning.db;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookJpaRepository extends JpaRepository<Book, Integer> {

    @Query(nativeQuery = true, value = "SELECT * FROM book WHERE book.name LIKE %:say%")
    List<Book> getAllByNameContains(String say);
}

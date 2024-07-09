package mr.green.learning.db;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookJpaRepository extends JpaRepository<Book, Integer> {

    List<Book> getAllByNameContains(String say);
}

package mr.green.learning.db;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class BookRestController {

    private final BookJpaRepository bookJpaRepository;

    @GetMapping
    public List<Book> booksWithSay(@RequestParam String say) {
        return bookJpaRepository.getAllByNameContains(say);
    }
}

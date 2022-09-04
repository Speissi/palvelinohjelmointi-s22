package palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookTest(BookRepository repository) {
		return (args) -> {
			repository.save(new Book("Pimeät kuut", "Tommi Kinnunen", 2022, "9789510480991", 28.95));
			repository.save(new Book("Suomen historian jännät naiset", "Maria Pettersson", 2022, "9789511423058", 27.95));
		};
	}
}

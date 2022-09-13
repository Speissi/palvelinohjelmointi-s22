package palvelinohjelmointi.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import palvelinohjelmointi.Bookstore.domain.Book;
import palvelinohjelmointi.Bookstore.domain.BookRepository;
import palvelinohjelmointi.Bookstore.domain.Category;
import palvelinohjelmointi.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookTest(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			var category1 = new Category("Fantasy");
			var category2 = new Category("Sci-Fi");
			var category3 = new Category("Non-Fiction");
			crepository.save(category1);
			crepository.save(category2);
			crepository.save(category3);

			repository.save(new Book("Pimeät kuut", "Tommi Kinnunen", 2022, "9789510480991", 28.95, category2));
			repository
					.save(new Book("Suomen historian jännät naiset", "Maria Pettersson", 2022, "9789511423058", 27.95,
							category3));
		};
	}
}

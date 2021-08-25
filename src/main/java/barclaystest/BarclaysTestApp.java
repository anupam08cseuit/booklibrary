package barclaystest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import barclaystest.model.Book;

@SpringBootApplication
public class BarclaysTestApp {
	public static List<Book> books = new ArrayList<>();

	public static void main(String[] args) {
		Book book = new Book();
		book.setId("1");
		book.setName("test");
		book.setAuthor("test1");
		SpringApplication.run(BarclaysTestApp.class, args);
	}
}

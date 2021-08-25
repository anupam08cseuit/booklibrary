package barclaystest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import barclaystest.model.Book;
import barclaystest.service.LibraryService;

@RestController
public class BookLibraryController {

	@Autowired
	private LibraryService libraryService;

	@GetMapping(path = "/books")
	public List<Book> getBooks() {
		List<Book> books = libraryService.getAllBooks();
		return books;
	}

	@PostMapping(path = "/books")
	public Book addBook(@RequestBody Book book) {
		Book bookRes = libraryService.addBooks(book);
		return bookRes;
	}

	@GetMapping(path = "/books/{name}")
	public List<Book> getMatchingBooks(@PathVariable String name) {
		List<Book> books = libraryService.getMatchingBooks(name);
		return books;
	}
}

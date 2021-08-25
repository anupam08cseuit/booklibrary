package barclaystest.service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import barclaystest.BarclaysTestApp;
import barclaystest.model.Book;

@Service
public class LibraryService {

	public List<Book> getAllBooks() {
		return BarclaysTestApp.books;
	}

	public Book addBooks(Book book) {
		BarclaysTestApp.books.add(book);
		return book;
	}

	public List<Book> getMatchingBooks(String name) {
		return BarclaysTestApp.books.stream().filter(books -> books.getName().toUpperCase().contains(name))
				.collect(Collectors.toList());
	}
}

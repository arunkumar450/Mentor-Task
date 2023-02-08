package com.arun.library.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.arun.library.book.model.BookModel;
import com.arun.library.book.service.BookService;

@RestController



public class BookController {
	@Autowired
	private BookService bookService;
	
	@PostMapping("/add")
	public BookModel addDetails(@RequestBody BookModel book) {
		return bookService.addBook(book);
	}
	@GetMapping("/getAllBooks")
	public List<BookModel> getAllBook() {
		return bookService.getAllBooks();
	}
	@GetMapping("/get/{id}")
	public BookModel getBook(@PathVariable String id) {
		return bookService.getBook(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable String id) {
		bookService.deleteBook(id);
	}
	@PutMapping("/update/{id}")
	public BookModel updateBook(@RequestBody BookModel book,@PathVariable String id)  {
		return bookService.updateBook(book, id);
	}
  @GetMapping("/title/{title}")
  public BookModel getBooksByTitle(@PathVariable("title") String title) {
	  return bookService.getBookByTitle(title);
  }
  
  
//  @GetMapping("/genre/{genre}")
//  public BookModel getBookByGenre(@PathVariable("genre") String genre) {
//	  return bookService.getBookByGenre(genre);
//  }
  
  @GetMapping("/getAllByAuthor/{author}")
  public List<BookModel> getAllByAuthor(@PathVariable("author") String author){
	  return bookService.getAllBooksByAuthor(author);
  }
  @GetMapping("/getAllByGenre/{genre}")
  public List<BookModel> getAllByGenre(@PathVariable("genre") String genre){
	  return bookService.getAllBooksByGenre(genre);
  }
  
  
  
  
}

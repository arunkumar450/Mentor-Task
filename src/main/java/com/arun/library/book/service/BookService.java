package com.arun.library.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arun.library.book.model.BookModel;
import com.arun.library.book.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;
	
	public BookModel addBook(BookModel book) {
		// TODO Auto-generated method stub
		return bookRepository.save(book) ;
	}

	public List<BookModel> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	public BookModel getBook(String id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	public void deleteBook(String id) {
		// TODO Auto-generated method stub
		 bookRepository.deleteById(id);
	}

	public BookModel updateBook(BookModel book, String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public BookModel getBookByTitle(String title) {
		// TODO Auto-generated method stub
		return bookRepository.findByTitle(title);
	}

//	public BookModel getBookByGenre(String genre) {
//		// TODO Auto-generated method stub
//		return bookRepository.findByGenre(genre);
//	}

	

	public List<BookModel> getAllBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return bookRepository.findAllByAuthor(author);
	}

	public List<BookModel> getAllBooksByGenre(String genre) {
		// TODO Auto-generated method stub
		return bookRepository.findAllByGenre(genre);
	}

}

package com.arun.library.book.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="books")
public class BookModel {
@Id
 private String bookId;
private String title;
private String genre;
private String author;
public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public BookModel(String bookId, String title, String genre, String author) {
	super();
	this.bookId = bookId;
	this.title = title;
	this.genre = genre;
	this.author = author;
}
public BookModel() {
	super();
	// TODO Auto-generated constructor stub
}



}

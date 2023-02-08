package com.arun.library.book.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.arun.library.book.model.BookModel;

@Repository
public interface BookRepository extends MongoRepository<BookModel,String>{

	//BookModel findByGenre(String genre);

	BookModel findByTitle(String title);

	List<BookModel> findAllByAuthor(String author);

	List<BookModel> findAllByGenre(String genre);
}

package com.jaleel.bookapplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaleel.bookapplication.model.Book;
import com.jaleel.bookapplication.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	BookRepository bookRepo;
	public void save(Book book) {
		bookRepo.save(book);
	}
	public List<Book> findAll() {
		return bookRepo.findAll();
	}

	public Book findOne(Long bookId) {
		return bookRepo.findOne(bookId);
	}

	public List<Book> findByPriceDesc() {
		return bookRepo.findByOrderByPriceDesc();
	}
	
	public List<Book> findByPriceAsc() {
		return bookRepo.findByOrderByPriceAsc();
	}

	public List<Book> findByReleasedDateDesc() {
		return bookRepo.findByOrderByReleasedDateDesc();
	}
}

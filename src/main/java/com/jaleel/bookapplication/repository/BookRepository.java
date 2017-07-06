package com.jaleel.bookapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaleel.bookapplication.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
List<Book> findByOrderByPriceDesc();
	
	List<Book> findByOrderByPriceAsc();
	List<Book> findByOrderByReleasedDateDesc();

}

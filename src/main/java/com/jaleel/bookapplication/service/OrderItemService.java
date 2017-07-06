package com.jaleel.bookapplication.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaleel.bookapplication.model.OrderItem;
import com.jaleel.bookapplication.repository.BookRepository;
import com.jaleel.bookapplication.repository.OrderItemRepository;

@Service
public class OrderItemService {

	@Autowired
	private OrderItemRepository orderItemRepository;
	
	@Autowired
	private BookRepository bookRepository;

	public void save(OrderItem orderItem) {
		orderItemRepository.save(orderItem);
	}

}

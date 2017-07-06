package com.jaleel.bookapplication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaleel.bookapplication.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {

	public List<Order> findByUserIdOrderByIdDesc(Long userId);
	public List<Order> findByOrderByIdDesc();
}

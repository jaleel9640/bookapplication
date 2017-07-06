package com.jaleel.bookapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaleel.bookapplication.model.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>  {

}

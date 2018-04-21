package com.minwoo.order.repositories;

import com.minwoo.order.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

    List<Order> findOrderByMemberId(int memberId);
}

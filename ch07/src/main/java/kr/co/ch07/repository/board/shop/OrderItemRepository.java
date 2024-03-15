package kr.co.ch07.repository.board.shop;

import kr.co.ch07.entity.shop.Customer;
import kr.co.ch07.entity.shop.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<Order, Integer> {
}

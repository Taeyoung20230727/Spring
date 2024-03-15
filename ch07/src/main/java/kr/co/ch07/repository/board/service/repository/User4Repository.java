package kr.co.ch07.repository.board.service.repository;

import kr.co.ch07.entity.User4;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User4Repository extends JpaRepository<User4, String> {
}

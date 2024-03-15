package kr.co.ch07.repository.board.service.repository;

import kr.co.ch07.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface User2Repository extends JpaRepository<User2, String> {


}

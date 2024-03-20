package kr.co.ch10.sboard.repository;

import kr.co.ch10.sboard.SboardApplication;
import kr.co.ch10.sboard.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


}

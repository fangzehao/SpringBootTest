package hello.dao;

import hello.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by IntelliJ IDEA
 * Job ID: op.101775
 * User: fangzehao
 * Date: 2018/8/20.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}

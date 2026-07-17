package nguyentrongduy.com.reponsitory;

import nguyentrongduy.com.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User_Reponsitory extends JpaRepository<User,String > {
}

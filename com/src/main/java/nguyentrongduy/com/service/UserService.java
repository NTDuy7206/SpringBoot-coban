package nguyentrongduy.com.service;
import nguyentrongduy.com.dto.UserRequest;
import nguyentrongduy.com.entity.User;
import java.util.List;

public interface UserService {
    User createUser(UserRequest request);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, UserRequest request);
    void deleteUser(Long id);
}

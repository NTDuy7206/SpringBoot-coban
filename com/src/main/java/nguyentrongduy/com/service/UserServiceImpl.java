package nguyentrongduy.com.service;

import nguyentrongduy.com.dto.UserRequest;
import nguyentrongduy.com.entity.User;
import nguyentrongduy.com.exception.ResourceNotFoundException;
import nguyentrongduy.com.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserRequest request) {
        User user = new User();
        user.setTitle(request.getTitle());
        user.setDescription(request.getDescription());
        user.setStatus(request.getStatus());
        user.setPriority(request.getPriority());
        user.setDeadline(request.getDeadline());
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Không tìm thấy người dùng "));
    }

    @Override
    public User updateUser(Long id, UserRequest request) {
        User user = getUserById(id);
        user.setTitle(request.getTitle());
        user.setDescription(request.getDescription());
        user.setStatus(request.getStatus());
        user.setPriority(request.getPriority());
        user.setDeadline(request.getDeadline());
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        User user = getUserById(id);
        userRepository.delete(user);
    }
}
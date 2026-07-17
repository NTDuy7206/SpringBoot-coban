package nguyentrongduy.com.service;

import nguyentrongduy.com.dto.User_Request;
import nguyentrongduy.com.entity.User;
import nguyentrongduy.com.reponsitory.User_Reponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class User_Service{
    @Autowired
    private User_Reponsitory userReponsitory;
    //tao cv
    public User createRequest(User_Request request){
        User user =new User();
        user.setTitle(request.getTitle());
        user.setDescription(request.getDescription());
        user.setStatus(request.getStatus());
        user.setPriority(request.getPriority());
        user.setDeadline(request.getDeadline());

        return userReponsitory.save(user);
    }
    //ds cv
    public List<User> getUsers(){
        return userReponsitory.findAll();
    }

    //xem chi tiet
    public User getUser(String id){
        return userReponsitory.findById(id).orElseThrow(()->new RuntimeException("404 not found"));
    }
    //update
    public User updateRequest(String id,User_Request request){
        User user=getUser(id);
        user.setTitle(request.getTitle());
        user.setDescription(request.getDescription());
        user.setStatus(request.getStatus());
        user.setPriority(request.getPriority());
        user.setDeadline(request.getDeadline());

        return userReponsitory.save(user);
    }
    //delete
    public void deleteUser(String Id) {
        userReponsitory.deleteById(Id);
    }

}

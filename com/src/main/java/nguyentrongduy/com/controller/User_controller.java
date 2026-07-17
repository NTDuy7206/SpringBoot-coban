package nguyentrongduy.com.controller;

import nguyentrongduy.com.dto.User_Request;
import nguyentrongduy.com.entity.User;
import nguyentrongduy.com.service.User_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class User_controller {
    @Autowired
    private User_Service userService;
    //create
    @PostMapping
    User createUser(@RequestBody User_Request userRequest){
        return userService.createRequest(userRequest);
    }

    //xem all
    @GetMapping()
    List<User> getUsers(){
        return userService.getUsers();
    }

    //xem chi tiet
    @GetMapping("{id}")
    User getUser(@PathVariable String id){
        return userService.getUser(id);
    }

    //cap nhat
    @PutMapping("{id}")
    User updateUser(@PathVariable String id,@RequestBody User_Request request){
        return userService.updateRequest(id,request);
    }

    //delete
    @DeleteMapping("/{Id}")
    String deleteUser(@PathVariable String Id) {
        userService.deleteUser(Id);
        return "DONE";
    }

}

package ie.ait.drvproject.controllers;

import ie.ait.drvproject.models.User;
import ie.ait.drvproject.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/")
@RestController
public class HomeController {
    @Autowired
    UserService userService;
    @GetMapping("sample")
    public String sample(){
        return "sample";
    }

    @GetMapping("get-all-users")
    public String getAllUsers(){
        StringBuilder stringBuilder = new StringBuilder();
        List<User> users = userService.findAllUsers();
        for(User user : users){
            stringBuilder.append("USER - "+user+"\r\n");
        }
        return stringBuilder.toString();
    }
}

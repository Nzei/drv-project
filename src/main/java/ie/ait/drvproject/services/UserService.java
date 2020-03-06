package ie.ait.drvproject.services;

import ie.ait.drvproject.models.User;
import ie.ait.drvproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}

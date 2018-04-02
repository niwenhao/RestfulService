package per.nwh.learn.springboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.nwh.learn.springboot.domain.User;

@RestController
public class FrontService {
    @RequestMapping("/{userId}")
    public User findUser(
            @PathVariable long userId
    ) {
        User user = new User();
        user.setId(userId);
        user.setName("Name_" + userId);
        user.setAddress("Address_" + userId);
        return user;
    }
}

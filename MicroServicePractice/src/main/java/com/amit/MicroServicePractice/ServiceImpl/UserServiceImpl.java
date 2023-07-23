package com.amit.MicroServicePractice.ServiceImpl;

import com.amit.MicroServicePractice.Service.UserService;
import com.amit.MicroServicePractice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class UserServiceImpl implements UserService {
    List<User>list=List.of(
            new User(1311L,"Amit Kumar","7355732125"),
            new User(1312L,"Appu Kumar","7355732178"),
            new User(1313L,"Aman Kumar","7355732189"),
            new User(1314L,"Ajay Kumar","7355732178")

    );

    @Override
    public User getUser(Long userId) {
        return list.stream().filter(user->user.getUserId().equals(userId)).findAny().orElseThrow(null);
    }
}

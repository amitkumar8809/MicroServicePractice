package com.amit.MicroServicePractice.Service;

import com.amit.MicroServicePractice.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    public User getUser(Long userId);
}

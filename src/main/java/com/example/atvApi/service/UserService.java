package com.example.atvApi.service;

import com.example.atvApi.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class UserService {

    public HashMap<Long, User> userList = new HashMap<>();

    private final AtomicLong idCounter = new AtomicLong(0);

    public User createUser(User user) {
        Long newId = idCounter.incrementAndGet();
        User userCreated = new User(newId, user.getName(), user.getAge());
        userList.put(userCreated.getId(), userCreated);

        return userCreated;
    }

    public List<User> getUsers() {
        return new ArrayList<>(userList.values());
    }

    public User attUser(Long id, User user) {
        User userToChange = userList.get(id);
        userToChange.setId(id);
        userToChange.setName(user.getName());
        userToChange.setAge(user.getAge());

        return userToChange;
    }

    public void removeUser(Long id) {
        userList.remove(id);
    }
}

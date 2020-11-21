package xyz.wiraharas.service.impl;

import xyz.wiraharas.dto.UserDto;
import xyz.wiraharas.service.UserService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDto> listAll() {
        List<UserDto> users = new ArrayList<>();
        UserDto user = new UserDto();
        user.setName("John");
        user.setLastName("Doe");
        user.setEmail("john.doe@wiraharas.xyz");
        users.add(user);
        return users;
    }

}

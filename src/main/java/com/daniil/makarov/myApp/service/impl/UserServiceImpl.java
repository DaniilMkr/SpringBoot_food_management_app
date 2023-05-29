package com.daniil.makarov.myApp.service.impl;

import com.daniil.makarov.myApp.dto.UserDto;
import com.daniil.makarov.myApp.entity.Role;
import com.daniil.makarov.myApp.entity.User;
import com.daniil.makarov.myApp.repository.RoleRepository;
import com.daniil.makarov.myApp.repository.UserRepository;
import com.daniil.makarov.myApp.service.UserService;
import com.daniil.makarov.myApp.util.TbConstants;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void saveUser(UserDto userDto) {
        Role role = roleRepository.findByName(TbConstants.Roles.USER);

        if (role == null)
            role = roleRepository.save(new Role(TbConstants.Roles.USER));

        User user = new User(userDto.getName(), userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()),
                Arrays.asList(role));
        userRepository.save(user);
    }

    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}

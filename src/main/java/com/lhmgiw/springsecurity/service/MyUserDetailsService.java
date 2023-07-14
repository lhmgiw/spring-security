package com.lhmgiw.springsecurity.service;

import com.lhmgiw.springsecurity.entities.User;
import com.lhmgiw.springsecurity.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
@Slf4j
public class MyUserDetailsService implements UserDetailsService {

    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.info("MyUserDetailsService - loadUserByUsername() called");

        User user = userRepository.findByUsername(username);

        if (user == null)
            throw new UsernameNotFoundException("User not found!");

        log.info("MyUserDetailsService - loadUserByUsername() completed");
        return new UserPrincipal(user);
    }
}

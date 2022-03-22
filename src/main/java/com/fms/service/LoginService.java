package com.fms.service;

import com.fms.models.UserAccount;
import com.fms.repositories.UserAccountRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@AllArgsConstructor
public class LoginService {

    private final UserAccountRepository userAccountRepository;

    public UserAccount saveUser(UserAccount userAccount){

        return userAccountRepository.save(userAccount);
    }
}

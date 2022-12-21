package com.hibuz.account.application;

import com.hibuz.account.dao.AuthorityRepository;
import com.hibuz.account.domain.Authority;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Service class for managing users.
 */
@AllArgsConstructor
@Service
@Transactional
public class UserService {

    private final AuthorityRepository authorityRepository;

    /**
     * Gets a list of all the authorities.
     * @return a list of all the authorities.
     */
    @Transactional(readOnly = true)
    public List<String> getAuthorities() {
        return authorityRepository.findAll().stream().map(Authority::getName).collect(Collectors.toList());
    }
}

package com.example.security_service.sec_Service;

import com.example.security_service.sec_entities.AppRole;
import com.example.security_service.sec_entities.AppUser;

import java.util.List;

public interface AccountService {

    AppUser addNewUser(AppUser appUser);
    AppRole addNewRole(AppRole appRole);
    void addRoleToUser(String username,String roleName);
    AppUser loadUserByUsername(String username);
    List<AppUser> listUsers();

}

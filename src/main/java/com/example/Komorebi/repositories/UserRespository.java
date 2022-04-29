package com.example.Komorebi.repositories;

import com.example.Komorebi.models.User;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableScan
public interface UserRespository extends CrudRepository<User, String> {
    /*
    public User findByUsername(String username){
        User u= new User();
        u.setUsername("ToteTopo");
        u.setPassword("$2a$10$31DMVm44VcUUVr9KVwn/se/YHYerRz7RiSj4RPd5Hx.IYnnLi7Dii");
        return u;
    }
     */

    User findByUsername(String username);
}
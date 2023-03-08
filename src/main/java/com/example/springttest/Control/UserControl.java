package com.example.springttest.Control;

import com.example.springttest.Entrity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserControl {
    List<UserEntity> userEntities = new ArrayList<>();

    public UserControl() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setName("sxy");
        this.userEntities.add(userEntity);

        userEntity = new UserEntity();
        userEntity.setId(2);
        userEntity.setName("zll");
        this.userEntities.add(userEntity);

        userEntity = new UserEntity();
        userEntity.setId(3);
        userEntity.setName("lgg");
        this.userEntities.add(userEntity);
    }

    @GetMapping("/")
    public List<UserEntity> query(@RequestParam(name = "name") String name) {
        List<UserEntity> userEntities = this.userEntities;
        if (name != null) {
            userEntities = userEntities.stream().filter(item -> item.getName().contains(name)).collect(Collectors.toList());
        }
        return userEntities;
    }

    @GetMapping("/all")
    public List<UserEntity> get_all() {
        return userEntities;
    }

    @GetMapping("/{id}")
    public UserEntity get_one(@PathVariable int id) {
        List<UserEntity> userEntities = this.userEntities;
        UserEntity userEntity = userEntities.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        return userEntity;
    }


    @PostMapping("/create")
    public List<UserEntity> create(@RequestBody UserEntity userEntity) {
        this.userEntities.add(userEntity);
        return this.userEntities;

    }

    @PutMapping("/update")
    public List<UserEntity> update(@RequestBody UserEntity userEntity) {
        UserEntity userEntityExist = this.userEntities.stream().filter(item -> item.getId() == userEntity.getId()).findFirst().orElse(null);
        userEntityExist.setName(userEntity.getName());
        return this.userEntities;

    }

    @DeleteMapping("/delete/{id}")
    public List<UserEntity> delete(@PathVariable("id") int id) {
        UserEntity userEntityDelete = this.userEntities.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        this.userEntities.remove(userEntityDelete);
        return this.userEntities;
    }


    @DeleteMapping("/delete")
    public List<UserEntity> delete1(@RequestParam(name = "id", required = false) int id) {
        UserEntity userEntityDelete = this.userEntities.stream().filter(item -> item.getId() == id).findFirst().orElse(null);
        this.userEntities.remove(userEntityDelete);
        return this.userEntities;
    }
}

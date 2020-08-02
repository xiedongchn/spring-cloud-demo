package com.xd.springclouddemo.controller;

import com.xd.springclouddemo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author xd
 * Created on 2020/7/24 22:04
 */
@RestController
public class UserController {

    @RequestMapping(path = "/getUser")
    public User getUser(Integer id) {
        return null;
    }
}

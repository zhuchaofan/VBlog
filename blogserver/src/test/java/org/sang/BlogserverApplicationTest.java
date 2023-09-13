package org.sang;

import org.junit.jupiter.api.Test;
import org.sang.bean.User;
import org.sang.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.ParseException;
import java.util.List;

@SpringBootTest
class BlogserverApplicationTest {

    @Autowired
    UserMapper userMapper;
    @Test
    void contextLoads() throws ParseException {
        List<User> list = userMapper.getUserByNickname("正");
        for(User user: list){
            System.out.println(user.getNickname()+"的角色个数为:"+user.getRoles().size());
        }
        System.out.println("列表大小为："+list.size());
    }
}

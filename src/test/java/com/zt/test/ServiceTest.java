package com.zt.test;

import com.zt.Application;
import com.zt.entity.IdsUser;
import com.zt.mapper.IdsUserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes=Application.class)
@RunWith(SpringRunner.class)
public class ServiceTest {

    @Autowired
    private IdsUserMapper userMapper;

    @Test
    public void fun1() {
        IdsUser idsUser = new IdsUser();
        idsUser.setId(27L);
        idsUser.setUId("87556121");
        idsUser.setName("elak");
        userMapper.insert(idsUser);
    }

}

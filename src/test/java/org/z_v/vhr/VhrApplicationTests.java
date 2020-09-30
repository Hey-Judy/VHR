package org.z_v.vhr;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.core.userdetails.UserDetails;
import org.z_v.vhr.mapper.HrMapper;
import org.z_v.vhr.model.Hr;
import org.z_v.vhr.service.HrService;

@SpringBootTest
class VhrApplicationTests {

    @Autowired
    HrService hrService;
    @Test
    void contextLoads() {
        UserDetails userDetails = hrService.loadUserByUsername("libai");
        System.out.println(userDetails);

    }

}

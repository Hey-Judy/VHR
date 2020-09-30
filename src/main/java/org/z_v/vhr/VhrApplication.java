package org.z_v.vhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* B1
2020.09.20 配置Mybaits
@MapperScan(basePackages = "org.z_v.vhr.mapper")
To pom.xml
 */
@MapperScan(basePackages = "org.z_v.vhr.mapper")
public class VhrApplication {

    public static void main(String[] args) {
        SpringApplication.run(VhrApplication.class, args);
    }

}

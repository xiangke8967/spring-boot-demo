package user.bloguser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("user.bloguser.entity")
public class BlogUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogUserApplication.class, args);
    }

}

package hello;

/**
 * Created by sr7s4c on 2017/1/12.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
@EnableConfigurationProperties({DemoProperties.class})
public class Application  extends SpringBootServletInitializer {

  @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

        return  application.sources(Application.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
package by.tut.shershnev_s.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan(basePackages = {"by.tut.shershnev_s.service", "by.tut.shershnev_s.repository"})
@PropertySource("classpath:path.properties")
public class HomeWorkAppConfig {
}

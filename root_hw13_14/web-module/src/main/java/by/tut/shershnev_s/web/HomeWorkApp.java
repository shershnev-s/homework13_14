package by.tut.shershnev_s.web;

import by.tut.shershnev_s.service.NineTaskService;
import by.tut.shershnev_s.web.config.HomeWorkAppConfig;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.lang.invoke.MethodHandles;


public class HomeWorkApp {

    private static final String FILE_NAME = "strings.txt";
    private static final Logger logger = LogManager.getLogger(MethodHandles.lookup().lookupClass());

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(HomeWorkAppConfig.class);
        ctx.refresh();
        NineTaskService nineTaskService = ctx.getBean(NineTaskService.class);
        int summ = nineTaskService.getSummFromFile(FILE_NAME);
        logger.info("Result summ of numbers = " + summ);
    }

}

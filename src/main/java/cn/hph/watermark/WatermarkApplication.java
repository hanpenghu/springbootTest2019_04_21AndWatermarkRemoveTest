package cn.hph.watermark;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@EnableScheduling
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class WatermarkApplication {

    public static void main(String[] args) {
//        SpringApplication.run(WatermarkApplication.class, args);
//        ConfigurableApplicationContext context=
//                new SpringApplicationBuilder(WatermarkApplication.class)
//                        .properties
        ////这个路径不提示代码,所以最好用默认
//                                ("spring.config.location=classpath:/cn/hph/watermark/configTxt/test01/test01.properties")
//                        .run(args);



                ConfigurableApplicationContext context=
                new SpringApplicationBuilder(WatermarkApplication.class)
                        .properties
        //这个路径不提示代码,所以最好用默认
                                ("spring.config.location=classpath:/application.yml")
                        .properties("spring.profiles.active=oracle")
                        .run(args);

        // 输出变量
        System.out.println(context.getEnvironment().getProperty("spring.datasource.name"));

    }




    @RequestMapping("/dododo")
    public void makeSpringbootNotStopWhenStart(){

    }



}

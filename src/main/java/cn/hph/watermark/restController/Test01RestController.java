package cn.hph.watermark.restController;

import cn.hph.watermark.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class Test01RestController {
    @Autowired
    private ConfigurableApplicationContext context;

    @GetMapping(value="hello")
    public String hello(){
        return "Hello World";
    }


    @RequestMapping(value="person/{personId}",method =RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findPerson(@PathVariable("personId") Integer personId){
        Person p=new Person();
        p.setId(personId);
        p.setName("Crazyit");
        p.setAge(33);
        // 输出变量 root1
        System.out.println(context.getEnvironment().getProperty("spring.datasource.name"));
        return p;
    }


}

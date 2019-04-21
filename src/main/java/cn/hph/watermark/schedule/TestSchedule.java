package cn.hph.watermark.schedule;


import org.springframework.context.annotation.Lazy;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@Lazy(false)
public class TestSchedule {


    @Scheduled(initialDelay = 5000,fixedDelay = Long.MAX_VALUE)
    public void f(){
        try {
            System.out.println("！！！！！！！！！！！！！！！！！！！！！！！");
        } catch (Exception e123) {}
    }

}

package com.shadow.patent;

import com.shadow.patent.entities.PatentEntity;
import com.shadow.patent.services.IPatentService;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import lombok.extern.slf4j.Slf4j;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class PatentServiceTest {
    @Autowired
    private IPatentService patentService;


    @Test
    public void testSave(){
        PatentEntity patentEntity = new PatentEntity();
        patentEntity.setName("test");
        try {
            if(patentService.save(patentEntity)){
                System.out.println("Success");
            }else {
                System.out.println("Failure");
            }
        } catch (Exception e) {
            log.error("testSave 异常",e);
        }
    }
}

package com.shadow.patent.services.impl;

import com.shadow.patent.entities.PatentEntity;
import com.shadow.patent.es.IPatentEs;
import com.shadow.patent.services.IPatentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatentServiceImpl implements IPatentService {
    @Autowired
    private IPatentEs patentEs;

    @Override
    public boolean save(PatentEntity patentEntity) throws Exception{
        return patentEs.save(patentEntity);
    }
}

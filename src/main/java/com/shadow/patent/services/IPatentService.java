package com.shadow.patent.services;

import com.shadow.patent.entities.PatentEntity;

public interface IPatentService {
    public boolean save(PatentEntity patentEntity) throws Exception;
}

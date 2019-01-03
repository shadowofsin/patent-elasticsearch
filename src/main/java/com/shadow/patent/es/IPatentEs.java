package com.shadow.patent.es;

import com.shadow.patent.entities.PatentEntity;

public interface IPatentEs {

    public boolean save(PatentEntity patentEntity)throws Exception;
}

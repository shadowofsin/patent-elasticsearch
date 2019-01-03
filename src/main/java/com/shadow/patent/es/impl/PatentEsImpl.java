package com.shadow.patent.es.impl;

import com.shadow.patent.Contants.EsContant;
import com.shadow.patent.entities.PatentEntity;
import com.shadow.patent.es.IPatentEs;
import io.searchbox.client.JestClient;
import io.searchbox.client.JestResult;
import io.searchbox.core.Index;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


@Repository
@Slf4j
public class PatentEsImpl implements IPatentEs {
    @Autowired
    private JestClient client;

    @Override
    public boolean save(PatentEntity patentEntity) throws Exception{
        Index index = new Index.Builder(patentEntity).index(EsContant.INDEX).type(EsContant.TYPE).build();
        JestResult jestResult = client.execute(index);
        log.info("save返回结果{}", jestResult.getJsonString());
        return jestResult.isSucceeded();
    }
}

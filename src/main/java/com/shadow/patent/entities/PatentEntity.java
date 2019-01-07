package com.shadow.patent.entities;

import io.searchbox.annotations.JestId;
import lombok.Data;

@Data
public class PatentEntity {
    @JestId
    private String id;

    private String name;
}

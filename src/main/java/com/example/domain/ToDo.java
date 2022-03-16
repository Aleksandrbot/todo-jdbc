package com.example.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class ToDo {
    @NotNull
    private String id;
    @NotNull
    @NotBlank
    private String description;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss", timezone="MST7MDT" ) //yyyy-MM-dd HH:mm:ss

    private LocalDateTime created;
    @JsonFormat(pattern="yyyy-MM-dd'T'HH:mm:ss", timezone="MST7MDT")
    private LocalDateTime modified;  //
    private boolean completed;


    public ToDo(){
        LocalDateTime date = LocalDateTime.now();
        this.id = UUID.randomUUID().toString();
        this.created = date;
        this.modified = date;


    }
    public ToDo(String description){
        this();
        this.description = description;
    }
}

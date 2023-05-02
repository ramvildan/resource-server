package com.example.resourceserver.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("records")
public class Record {

    @Id
    @Column("id")
    private Long id;

    @Column("record_name")
    private String name;

}

package com.theOne.springcloud.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@Data
@Accessors
@NoArgsConstructor
@AllArgsConstructor
public class Department implements Serializable {
    private Integer id;
    private String departmentName;
}

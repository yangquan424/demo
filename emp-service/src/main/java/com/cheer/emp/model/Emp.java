package com.cheer.emp.model;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Emp implements Serializable {
    //指定表主键
    @TableId
    private Integer empno;
    private String ename;
    private String job;
    private Integer mgr;
    private String hiredate;
    private Double sal;
    private Double com;
    private Integer deptno;
}

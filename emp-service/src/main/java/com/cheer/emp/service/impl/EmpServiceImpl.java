package com.cheer.emp.service.impl;

import com.cheer.emp.dao.EmpMapper;
import com.cheer.emp.model.Emp;
import com.cheer.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    public Emp getEmp(Integer empno) {
        return this.empMapper.selectById(empno);
    }
}

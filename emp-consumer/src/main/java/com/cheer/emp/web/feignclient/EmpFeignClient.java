package com.cheer.emp.web.feignclient;


import com.cheer.emp.model.Emp;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("emp-service")
public interface EmpFeignClient {
    @GetMapping("/emp/getEmp/{id}")
    Emp getEmp(@PathVariable(value = "id") Integer id);
}

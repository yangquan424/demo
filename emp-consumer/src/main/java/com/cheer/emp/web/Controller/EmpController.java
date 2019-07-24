package com.cheer.emp.web.Controller;

import com.cheer.emp.model.Emp;
import com.cheer.emp.web.feignclient.EmpFeignClient;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("emp")
public class EmpController {
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Autowired
//    private DiscoveryClient discoveryClient;
    @Autowired
    private EmpFeignClient empFeignClient;

    @GetMapping("getEmp/{id}")
    public Emp getEmp(@PathVariable(value = "id") Integer id) {
          log.traceEntry();
//        List<ServiceInstance> list = discoveryClient.getInstances("emp-service");
//        ServiceInstance serviceInstance = list.get(0);
//        String url =
//                "http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/emp/getEmp/"+id;
//        Emp emp = this.restTemplate.getForObject(url,Emp.class);
//        String url = "http://emp-service/emp/getEmp/"+id;

//        Emp emp = this.restTemplate.getForObject(url,Emp.class);

        return this.empFeignClient.getEmp(id);
    }
}
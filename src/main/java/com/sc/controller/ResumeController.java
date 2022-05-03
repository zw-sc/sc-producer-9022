package com.sc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sc.service.ResumeService;

@RestController
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/openstate/{id}")
    public Integer findDefaultResumeState(@PathVariable Long id) {
        Long t1 = System.currentTimeMillis();
        System.out.println();
        System.out.println(resumeService.findDefaultResumeById(id));
        System.out.println("====>>>>>>>>>>>>>>我是9022，访问到我这里了......");
        return port;
    }
}

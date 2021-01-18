package per.lzy.demo.param.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.lzy.demo.param.model.TestEntity;
import per.lzy.demo.param.service.XmlTestService;

import java.util.List;

/**
 * @author liuzhiyuan
 * @date 2021/1/15 18:15
 */
@RestController
@RequestMapping("/test/rest")
public class TestController {

    @Autowired
    private XmlTestService testService;

    @PostMapping(value = "/entity")
    public List<TestEntity> getEntity() {
        System.out.println("invoke interface entity");
        return testService.getEntity();

    }

}

package per.lzy.demo.param.service;

import org.springframework.stereotype.Service;
import per.lzy.demo.param.model.TestEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuzhiyuan
 * @date 2021/1/15 18:25
 */
@Service
public class XmlTestService {


    public List<TestEntity> getEntity() {
        List<TestEntity> list = new ArrayList<>();
        list.add(new TestEntity("liuzhiyuan", "zhiyuan", 18));
        list.add(new TestEntity("lijie", "jie", 18));
        return list;
    }
}

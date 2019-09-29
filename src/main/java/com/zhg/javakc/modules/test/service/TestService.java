package com.zhg.javakc.modules.test.service;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.service.BaseService;
import com.zhg.javakc.modules.test.dao.TestDao;
import com.zhg.javakc.modules.test.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService extends BaseService<TestDao,TestEntity> {
    @Autowired
    public TestDao testDao;

    public Page<TestEntity> queryTest(Page<TestEntity> page,TestEntity testEntity){
       testEntity.setPage(page);
       page.setList(testDao.findList(testEntity));
       return page;
    }

public void create (TestEntity testEntity){
        testDao.insert(testEntity);

}
}

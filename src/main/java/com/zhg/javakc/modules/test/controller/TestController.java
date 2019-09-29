package com.zhg.javakc.modules.test.controller;

import com.zhg.javakc.base.page.Page;
import com.zhg.javakc.base.util.CommonUtil;
import com.zhg.javakc.modules.test.entity.TestEntity;
import com.zhg.javakc.modules.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("test")
public class TestController {
@Autowired
    public TestService testService;
@RequestMapping("queryTest")
public ModelAndView queryTest(TestEntity testEntity, HttpServletResponse response, HttpServletRequest request){
    ModelAndView modelAndView=new ModelAndView("test/list");
    modelAndView.addObject("page",testService.queryTest(new Page<>(request,response),testEntity));
    return modelAndView;

}
@RequestMapping("create")
public String create (TestEntity testEntity){
testEntity.setTestId(CommonUtil.uuid());
testService.save( testEntity);
    return "redirect:queryTest.do";
}
@RequestMapping("view")
public String view(String ids, ModelMap map){
map.put("testEntity",testService.get(ids));
return  "test/update";
}
@RequestMapping("update")
    public  String update(TestEntity testEntity){
    testService.update(testEntity);
    return "redirect:queryTest.do";
}
@RequestMapping("delete")
    public String delete(String []ids){
    testService.delete(ids);
    return "redirect:queryTest.do";
}

}


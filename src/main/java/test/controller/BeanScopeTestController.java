package test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import test.scopeTest.PrototypeBean;
import test.scopeTest.RequestBean;
import test.scopeTest.SessionBean;
import test.scopeTest.SingleBean;

/**
 * @Package: test.controller
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/15 14:44
 * @Description:
 **/
@Controller
public class BeanScopeTestController {

    @Autowired
    private SingleBean singleBean;

    @Autowired
    private PrototypeBean prototypeBean;

    @Autowired
    private RequestBean requestBean;

    @Autowired
    private SessionBean sessionBean;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public void test(){
        print();
    }

    public void print(){
        System.out.println("singleBean:"+singleBean);
        System.out.println("singleBean:"+singleBean);
        System.out.println("prototypeBean:"+prototypeBean);
        System.out.println("prototypeBean:"+prototypeBean);
        System.out.println("requestBean:"+requestBean);
        System.out.println("requestBean:"+requestBean);
        System.out.println("sessionBean:"+sessionBean);
        System.out.println("sessionBean:"+sessionBean);
        System.out.println("***********************************");
    }

}

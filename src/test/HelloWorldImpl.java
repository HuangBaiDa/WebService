package test;

import javax.jws.WebService;

/**
 * @author 力拔山兮气盖世
 * @version jiahe house 1.0.0
 * @description
 * @date 2019-2-13
 */
@WebService
public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello(String name) {
        System.out.println("sayHello方法被调用");
        return ("Hello" + name);
    }
}

package test.scopeTest;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

/**
 * @Package: test.scopeTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/15 14:42
 * @Description:
 **/
@Component
@Scope(value = "request",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestBean {
}

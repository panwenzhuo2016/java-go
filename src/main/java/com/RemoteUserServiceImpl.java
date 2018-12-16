package com;

import com.alibaba.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * dubbo 服务service
 *
 * @author DUCHONG
 * @since 2018-07-03 18:29
 **/
@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = RemoteUserService.class)
public class RemoteUserServiceImpl implements RemoteUserService {

    private static final Logger logger = LoggerFactory.getLogger(RemoteUserServiceImpl.class);


    @Override
    public String sayHello(String name) {

        return "Hell1111111o "+name;
    }
}

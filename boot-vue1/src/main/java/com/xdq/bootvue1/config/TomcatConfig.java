package com.xdq.bootvue1.config;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 这里首先配置 TomcatServletWebServerFactory ，然后添加一个 Tomcat 中的 Connector （监听
 * 8080端口）,并将请求转发到 8081 上去。
 * 配置完成后，在浏览器中输入http://localhost:8080/hello ”，就会自动重定向到
 * https://localhost:8888/hello 上。
 */
@Configuration
public class TomcatConfig {

    @Bean
    TomcatServletWebServerFactory tomcatServletWebServerFactory() {
        TomcatServletWebServerFactory factory= new TomcatServletWebServerFactory (){
            @Override
            protected void postProcessContext (Context context) {
                SecurityConstraint constraint = new SecurityConstraint();
                constraint.setUserConstraint("CONFIDENTIAL");
                SecurityCollection collection = new SecurityCollection();
                collection.addPattern("/*");
                constraint.addCollection(collection);
                context.addConstraint(constraint);
            }
        };
        factory.addAdditionalTomcatConnectors(createTomcatConnector());
        return factory;
    }

    private Connector createTomcatConnector () {
        Connector connector = new Connector ("org.apache.coyote.http11.Http11NioProtocol");
        connector.setScheme ("http");
        connector.setPort (8080) ;
        connector.setSecure (false);
        connector.setRedirectPort(8888);
        return connector;
    }
}


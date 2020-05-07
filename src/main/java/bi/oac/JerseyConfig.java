package bi.oac;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import javax.ws.rs.ApplicationPath;

@Configuration
@ApplicationPath("/")
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(HelloService.class);
        register(ReverseService.class);
//        property(ServletProperties.FILTER_FORWARD_ON_404, true);
//        property(ServletProperties.FILTER_STATIC_CONTENT_REGEX, "/");
//        Map<String, Object> m =   getProperties();
//        for (Map.Entry<String, Object> entry : m.entrySet()){
//            System.out.printf("%s -> %s" , entry.getKey(), entry.getValue());
//        }
    }
}
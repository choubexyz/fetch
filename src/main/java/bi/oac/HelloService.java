package bi.oac;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@Service
@Path("/")
public class HelloService {
    @GET
    @Produces("text/html")
    public String hello() throws IOException {
        String data = "";
        ClassPathResource cpr = new ClassPathResource("static/index.html");
        try {
            byte[] bdata = FileCopyUtils.copyToByteArray(cpr.getInputStream());
            data = new String(bdata, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("not found.....");
        }
        return data.toString();
    }
}
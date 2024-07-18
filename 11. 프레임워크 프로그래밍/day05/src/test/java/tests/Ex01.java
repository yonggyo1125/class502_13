package tests;

import org.choongang.config.MvcConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@SpringJUnitWebConfig
@ContextConfiguration(classes= MvcConfig.class)
public class Ex01 {
    @Test
    void test1() {
        URI url = UriComponentsBuilder.fromUriString("https://www.naver.com")
                .path("/news/{0}")
                .queryParam("t1", "v1")
                .queryParam("t2", "v2")
                .queryParam("t3", "한글")
                .queryParam("t4", "aa{1}")
                .fragment("hash")
                .encode()
                .build("AAAA", "BBBB");

        System.out.println(url);

    }

    @Test
    void test2() {
        RestTemplate restTemplate = new RestTemplate();
        String data = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts", String.class);
        System.out.println(data);
    }
}

package tests;

import org.choongang.config.MvcConfig;
import org.choongang.exam.PostData;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringJUnitWebConfig
@ContextConfiguration(classes= MvcConfig.class)
public class Ex01 {
    @Test
    void test1() {
        UriComponents url = UriComponentsBuilder.fromUriString("https://www.naver.com")
                //.path("/news/{0}")
                .queryParam("t1", "v1")
                .queryParam("t2", "v2")
                //.queryParam("t3", "%ED%95%9C%EA%B8%80")
                .queryParam("t3", "한글")
                //.queryParam("t4", "aa{1}")
                .fragment("hash")
                //.encode()
                        .build(false);
                //.encode()
                //.build("AAAA", "BBBB");
        System.out.println(url.getQuery());
        System.out.println(url);




    }

    @Test
    void test2() {
        RestTemplate restTemplate = new RestTemplate();
        PostData data = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", PostData.class);
        System.out.println(data);
    }

    @Test
    void test3() {
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject("https://jsonplaceholder.typicode.com/posts/1", String.class);


    }
}

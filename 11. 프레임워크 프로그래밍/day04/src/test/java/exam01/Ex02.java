package exam01;

import config.AppCtx;
import member.entities.Member;
import member.repositories.MemberRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jdbc.repository.config.EnableJdbcRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

//@ExtendWith(SpringExtension.class)
//@ContextConfiguration(classes = AppCtx.class)
public class Ex02 {

    //@Autowired
    //private MemberRepository repository;

    @Test
    void test1() {
        //List<Member> members = (List<Member>)repository.findAll();
        //members.forEach(System.out::println);
    }

    @Test
    void test2() {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
        MemberRepository repository = ctx.getBean(MemberRepository.class);
        System.out.println(repository);

        ctx.close();
    }
}

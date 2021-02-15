package com.example.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@RunWith(SpringRunner.class) //테스트를 진행할 때 JUnit에 내장된 실행자 외에 다른 실행자를 실행시킨다. SpringRunner라는 스프링 실행자를 사용하여 테스트와 JUnit사이에 연결자 역할을 한다.
@WebMvcTest(controllers = HelloController.class) //여러 스프링 테스트 어노테이션 중, Web (Spring MVC)에 집중할 수 있는 어노테이션이다.
public class HelloControllerTest {

    @Autowired //스프링을 관리하는 빈(Bean)을 주입 받는다.
    private MockMvc mvc; //웹 API 테스트할 때 사용, 스프링 MVC 테스트의 시작점, 이 클래스를 통해 HTTP GET, POST등에 대한 API테스트를 할 수 있다.

    @Test
    public void hello가_리턴된다() throws Exception{
        String hello="hello";

        mvc.perform(MockMvcRequestBuilders.get("/hello")) //그냥 get을 하면 오류가 생긴다. 앞에 MockMvcRequestBuilders를 붙여서 해결한다. HTTP GET
                .andExpect(MockMvcResultMatchers.status().isOk()) //그냥 status를 하면 오류가 생긴다. 앞에 MockMvcResultMatchers를 붙여서 해결한다. 상태 검증
                .andExpect(MockMvcResultMatchers.content().string(hello)); //그냥 content를 하면 오류가 생긴다. 앞에 MockMvcResultMatchers를 붙여서 해결한다. 내용 검증
    }
}

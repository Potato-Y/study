package com.example.springboot.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

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
    //위 문제는 static으로 선언해주면 해결됨
    }

    @Test
    public void helloDto가_리턴된다() throws Exception{
        String name="hello";
        int amount=1000;

        mvc.perform(MockMvcRequestBuilders.get("/hello/dto")
                .param("name",name)
                .param("amount",String.valueOf(amount)))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(jsonPath("$.name",is(name)))
                .andExpect(jsonPath("$.amount",is(amount)));

        /*
        param
        API 테스트할 때 사용될 요청 파라미터를 설정한다.
        단, 값은 String만 된다.
        숫자/날짜 등의 데이터도 등록할 때는 문자열로 변경해야 가능한다.

        jsonPath
        JSON 응답값을 필드별로 검증할 수 있는 메소드다.
        $를 기준으로 필드명을 명시한다.
        여기서는 name과 amount를 검증하니 $.name, $amount로 검증한다.
         */
    }
}

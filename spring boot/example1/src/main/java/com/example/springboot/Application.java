package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing //JPA Auditing 어노테이션들이 모두 활성화할 수 있도록 Application 클래스에 활성화 어노테이션을 추가
@SpringBootApplication
/*
스프링부트의 자동 설정, 스프링 Bean읽기와 생성을 모두 자동으로 설정. 여기서부터 설정을 읽어나감
항상 프로젝트 최상단에 위치
*/
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args); //이를 통해 내장 WAS를 실행 (Web Application Server)
        /*별도로 외부에 WAS를 두지 않고 애플리케이션을 실행할 때 WAS를 실행하는 것을 말한다.
        항상 서버에 톰캣을 설치할 필요가 없으며, 스프링 부트로 만들어진 Jar 파일로 실행하면 된다.
         */
    }
}

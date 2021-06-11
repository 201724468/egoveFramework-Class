package com.steve.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.steve.spring.domain.Journal;
import com.steve.spring.repository.JournalRepository;

@SpringBootApplication
public class SpringBootJournal1Application {
	@Bean
    InitializingBean saveData(JournalRepository repo) {
        return () ->{
            repo.save(new Journal("스프링 부트 입문","스프링 공부 시작","06/11/2021"));
            repo.save(new Journal("스프링 프로젝트 샘플","스프링 샘플!","06/11/2021"));
            repo.save(new Journal("스프링 부트 구조","스프링 구조를 알아보자","06/11/2021"));
            repo.save(new Journal("스프링 부트 클라우드","클라우드요","06/11/2021"));
        };
        //InitializingBean은 스프링 엔진이 인스턴스 생성 후 초기화 할 때 항상 호출하는 특수 클래스
        //saveData는 스프링 시동 준비전에 실행
    }
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournal1Application.class, args);
	}

}

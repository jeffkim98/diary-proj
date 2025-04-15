package com.legacydiary.controller;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j2;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/**/root-context.xml" })
@Log4j2
public class SessionFactoryTest {


	@Inject
	private SqlSessionFactory ssf;

	@Test
	public void sqlSessionFactoryTest() {

		SqlSession session = ssf.openSession();
		
		System.out.println("session : " + session.toString());
		System.out.println("ssf : " + ssf.toString());
		
		log.info("session : {} " , session.toString());
		log.info("ssf : {} " , ssf.toString());
	}
}

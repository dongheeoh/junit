package com.douzone.springcontainer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.douzone.springcontainer.soundsystem.CDPlayer;
import com.douzone.springcontainer.soundsystem.CompactDisc;
import com.douzone.springcontainer.user.User;
import com.douzone.springcontainer.videosystem.DVDPlayer;
import com.douzone.springcontainer.videosystem.DigitalVideoDisc;

import config.user.AppConfig01;

public class JavaConfigTest {

	public static void main(String[] args) {
		//testJavaConfig01();
		//testJavaConfig02();
		//testJavaConfig03();
		testJavaConfig04();
	}
	//Java Config 01 
		//직접 설정 자바 클래스를 전달하는 경우
		//설정 자바 클래스에 @Configuration 필요없음
	public static void testJavaConfig01() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig01.class);
		User user=appCtx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	//Java Config 01 
	//직접 설정 자바 클래스를 전달하는 경우
	//설정 자바 클래스에 @Configuration 필요없음
	public static void testJavaConfig02() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.user");
		User user=appCtx.getBean(User.class);
		System.out.println(user);
		
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	//Java Config 03 
	//component Scanning( @Component,@Autowired)
	public static void testJavaConfig03() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.soundsystem");
		
		CompactDisc cd =appCtx.getBean(CompactDisc.class);
		System.out.println(cd);
		
		cd=(CompactDisc)appCtx.getBean("blueblood");
		
		CDPlayer cdPlayer=appCtx.getBean(CDPlayer.class);
		cdPlayer.play();
		((ConfigurableApplicationContext)appCtx).close();
	}
	
	//Java Config 04 
	//component Scan을 사용하지 않음
	//Java Config Class의 메소드와 @Bean를 사용
	public static void testJavaConfig04() {
		ApplicationContext appCtx = new AnnotationConfigApplicationContext("config.videosystem");
		
		DigitalVideoDisc dvd=appCtx.getBean(DigitalVideoDisc.class);
		System.out.println(dvd);
		
		DVDPlayer dvdPlayer = appCtx.getBean(DVDPlayer.class);
		dvdPlayer.play();
		
		//DVDPlayer dvdPlayer = (DVDPlayer)appCtx.getBean("dvdplayer2");
		//dvdPlayer.play();
		
		((ConfigurableApplicationContext)appCtx).close();
		
	}
}

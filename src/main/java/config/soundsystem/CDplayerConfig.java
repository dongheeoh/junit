package config.soundsystem;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages= "com.douzone.springcontainer.soundsystem")
//@ComponentScan(basePackages= {"com.douzone.springcontainer.soundsystem","com.douzone.springcontainer.videosystem"}) //component달린애들을 생성하라
//Error!!
//basePackageClasses에 지정한 클래스가 속한 패키지를 Base Package를 사용한다
//@ComponentScan(basePackageClasses=Index.class)
public class CDplayerConfig {

}

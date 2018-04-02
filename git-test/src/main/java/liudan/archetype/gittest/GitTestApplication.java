package liudan.archetype.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitTestApplication {

	public static void main(String[] args) {
		System.out.println("小张同学增加了一行代码，用于测试git提交测试。");
		System.out.println("我是分支提交的代码");
		SpringApplication.run(GitTestApplication.class, args);
	}
}

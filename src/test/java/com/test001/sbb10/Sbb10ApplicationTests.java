package com.test001.sbb10;

import com.test001.sbb10.article.Article;
import com.test001.sbb10.article.ArticleRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class Sbb10ApplicationTests {
	@Autowired
	private ArticleRepository articleRepository;
	@Test
	@DisplayName("게시글 생성")
	void test01() {
		Article a = new Article();
		a.setSubject("1번 게시글");
		a.setContent("1번 게시글 내용...................");
		a.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a);

		Article a1 = new Article();
		a1.setSubject("2번 게시글");
		a1.setContent("2번 게시글 내용...................");
		a1.setCreateDate(LocalDateTime.now());
		this.articleRepository.save(a1);
	}



}

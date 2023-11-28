package com.test001.sbb10.article;

import com.test001.sbb10.article.Article;
import com.test001.sbb10.article.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    public List<Article> getList() {
        return this.articleRepository.findAll();
    }

    public void create(String subject, String content) {
        Article a = new Article();
        a.setSubject(subject);
        a.setContent(content);
        a.setCreateDate(LocalDateTime.now());
        this.articleRepository.save(a);
    }

    public Article getArticle(Integer id) {
        Optional<Article> oa = this.articleRepository.findById(id);
        if (oa.isPresent()) {
            return oa.get();
        } else {
            throw new RuntimeException("not found");
        }
    }
}

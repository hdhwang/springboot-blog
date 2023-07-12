package me.hdhwang.springbootdeveloper.dto;

import lombok.Getter;
import me.hdhwang.springbootdeveloper.domain.Article;

@Getter
public class ArticleResponse {
    private final String title;
    private final String context;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.context = article.getContent();
    }
}

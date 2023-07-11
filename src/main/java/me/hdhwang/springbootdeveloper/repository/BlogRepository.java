package me.hdhwang.springbootdeveloper.repository;

import me.hdhwang.springbootdeveloper.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlogRepository extends JpaRepository<Article, Long> {
}

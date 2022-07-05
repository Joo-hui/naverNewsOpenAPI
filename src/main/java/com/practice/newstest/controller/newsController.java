package com.practice.newstest.controller;

import com.practice.newstest.models.News;
import com.practice.newstest.models.NewsRepository;
import com.practice.newstest.models.NewsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor // final로 선언된 멤버 변수를 자동으로 생성
@RestController // JSON으로 데이터 주고 받을거다
public class newsController {

    private final NewsRepository newsRepository;

    // news 전체 목록 조회
    @GetMapping("/news")
    public List<News> getNews() {
        return newsRepository.findAll();
    }

    // 신규 news 등록
    @PostMapping("/news")
    public News addNews(@RequestBody NewsRequestDto newsRequestDto) {
        News news = new News(newsRequestDto);
        newsRepository.save(news);
        return news;
    }
}

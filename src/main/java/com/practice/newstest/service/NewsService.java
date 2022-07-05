package com.practice.newstest.service;

import com.practice.newstest.models.News;
import com.practice.newstest.models.NewsRepository;
import com.practice.newstest.models.NewsRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service    // 나 서비스다
public class NewsService {

    private final NewsRepository newsRepository;

    @Transactional  //업데이트가 DB관련 작업이다
    public Long update(Long id, NewsRequestDto newsRequestDto) {
       News news = newsRepository.findById(id).orElseThrow(
                ()-> new IllegalArgumentException("아이디가 존재하지 않습니다."));
        news.update(newsRequestDto);
        return id;
    }

}

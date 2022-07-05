package com.practice.newstest.controller;

import com.practice.newstest.models.NewsDto;
import com.practice.newstest.utils.NewsSearch;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor // final 로 선언된 클래스를 자동으로 생성합니다.
@RestController // JSON으로 응답함을 선언합니다.
public class NewsRequestController {

    private final NewsSearch newsSearch;

    @GetMapping("/search")
    public List<NewsDto> getNews(@RequestParam String query) {  //요청할때 query라는 파라미터가 있으면 넣어줘라
        String resultString = newsSearch.search(query);
        return newsSearch.fromJSONtoItems(resultString);
    }
}

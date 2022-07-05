package com.practice.newstest.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter //get 함수 일괄적으로 만들어줌
@Entity // DB 테이블 역할
@NoArgsConstructor  // 기본 생성자 만들어줌
public class News extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long newsId;    // news id

    @Column(nullable = false)
    private String title;   // 제목

    @Column(nullable = false)
    private String link;    // 기사 링크

    @Column(nullable = false)
    private String description; //내용

    @Column(nullable = false)
    private String pubDate; // 기사 발행 날짜

    public News(NewsRequestDto newsRequestDto) {
        this.title = newsRequestDto.getTitle();
        this.link = newsRequestDto.getLink();
        this.description = newsRequestDto.getDescription();
        this.pubDate = newsRequestDto.getPubDate();
    }
    public void update(NewsRequestDto newsRequestDto) {
        this.title = newsRequestDto.getTitle();
        this.link = newsRequestDto.getLink();
        this.description = newsRequestDto.getDescription();
        this.pubDate = newsRequestDto.getPubDate();
    }

}

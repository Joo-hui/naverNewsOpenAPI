package com.practice.newstest.models;

import lombok.Getter;
import org.json.JSONObject;

@Getter
public class NewsDto {

    private String title;

    private String link;

    private String description;

    private String pubDate;


    public NewsDto(JSONObject newsJson) {
        this.title = newsJson.getString("title");
        this.link = newsJson.getString("link");
        this.description = newsJson.getString("description");
        this.pubDate = newsJson.getString("pubDate");
}
}

package com.searchapi.example2.web;

import java.util.ArrayList;
import java.util.List;

public class NewsService {

    private final NewsRepository newsRepository;

    public NewsService(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    public List<BlogDto> findByQuery(String query) {

        List<BlogDto> list = new ArrayList<>();
        newsRepository.findByQuery(query).getItems().forEach(
                b -> list.add(BlogDto.builder()
                        .title(b.title)
                        .link(b.link)
                        .description(b.description)
                        .build())
        );
        return list;
    }
}

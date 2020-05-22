package com.searchapi.example2.web;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService {

    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public List<BlogDto> findByQuery(String query) {

        List<BlogDto> list = new ArrayList<>();
        blogRepository.findByQuery(query).getItems().forEach(
                b -> list.add(BlogDto.builder()
                        .title(b.title)
                        .link(b.link)
                        .description(b.description)
                        .postdate(b.postdate)
                        .blogger(b.bloggername)
                        .build())
        );
        return list;
    }
}

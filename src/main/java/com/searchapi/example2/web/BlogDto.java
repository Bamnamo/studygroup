package com.searchapi.example2.web;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class BlogDto {

    private String title;
    private String link;
    private String blogger;
    private String description;
    private String postdate;
}

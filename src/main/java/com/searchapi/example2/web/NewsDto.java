package com.searchapi.example2.web;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder

public class NewsDto {
    private String title;
    private String originalink;
    private String link;
    private String description;
}

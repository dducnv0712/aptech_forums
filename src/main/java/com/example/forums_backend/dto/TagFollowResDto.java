package com.example.forums_backend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TagFollowResDto {
    private Long id;
    private String name;
    private int tag_follow_count;
    private boolean isFollow;
    private int posts_use;
}

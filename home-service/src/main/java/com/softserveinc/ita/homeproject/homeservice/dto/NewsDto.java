package com.softserveinc.ita.homeproject.homeservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NewsDto extends BaseDto {

    private String title;

    private String photoUrl;

    private String description;

    private String source;

    private String text;
}

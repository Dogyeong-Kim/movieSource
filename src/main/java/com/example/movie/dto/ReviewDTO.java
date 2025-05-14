package com.example.movie.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ReviewDTO {

    private Long rno;

    private int grade;

    private String text;

    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    // member
    private Long mid;
    private String email;
    private String nickname;
}

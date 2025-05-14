package com.example.movie.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.example.movie.entity.MovieImage;

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
public class MovieDTO {
    private Long mno;
    private String title;
    @Builder.Default
    private List<MovieImageDTO> movieImages = new ArrayList<>();
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

    // 평점
    private double avg;

    // 리뷰수
    private Long reviewCnt;
}

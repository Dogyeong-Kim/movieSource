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
public class MovieImageDTO {

    private Long inum;
    private String uuid;
    private String imgName;
    private String path;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;

}

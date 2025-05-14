package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.entity.MovieImage;
import com.example.movie.repository.total.MovieImageReviewRepository;

public interface MovieImageRepository extends JpaRepository<MovieImage, Long>, MovieImageReviewRepository {

}

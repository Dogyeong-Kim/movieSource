package com.example.movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.movie.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

}

package com.neoga.boltauction.memberstore.review.domain;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ReviewDto {

    private Long id;
    private String content;
    private RegisterDto register;
    private LocalDateTime createDt;
}
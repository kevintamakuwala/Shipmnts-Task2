package com.shipmnts.backend.responses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewRes {

    private Long id;
    private String bookId;
    private String comment;
    private int rating;
}

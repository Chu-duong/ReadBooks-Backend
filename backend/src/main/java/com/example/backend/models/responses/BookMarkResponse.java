package com.example.backend.models.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookMarkResponse {
    private Long id;
    private String name;
    private int pageNumber;
}

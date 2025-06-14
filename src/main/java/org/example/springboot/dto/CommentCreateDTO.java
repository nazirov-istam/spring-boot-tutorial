package org.example.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class CommentCreateDTO {
    private String message;
    private Integer postId;
}

// Endigi navbatda, Post Service orqali COmmentlarni boshqarib kuramiz.

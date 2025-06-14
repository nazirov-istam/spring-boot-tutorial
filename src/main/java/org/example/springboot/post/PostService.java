package org.example.springboot.post;

import jakarta.annotation.Nonnull;
import org.example.springboot.dto.CommentCreateDTO;
import org.example.springboot.dto.PostCreateDTO;
import org.example.springboot.dto.PostDTO;

import java.util.List;

public interface PostService {
    PostDTO getPost(@Nonnull Integer id);

    PostDTO createPost(@Nonnull PostCreateDTO dto);

    void createComment(@Nonnull List<CommentCreateDTO> dtos);
}

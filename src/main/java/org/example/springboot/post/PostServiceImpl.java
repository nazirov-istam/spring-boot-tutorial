package org.example.springboot.post;

import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.example.springboot.dto.CommentCreateDTO;
import org.example.springboot.dto.PostCreateDTO;
import org.example.springboot.dto.PostDTO;
import org.example.springboot.resource.CommentResource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final CommentResource commentResource;
    private final PostRepository postRepository;

    @Override
    public PostDTO getPost(@Nonnull Integer id) {
        Post post = postRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Post not found"));

        return PostDTO.builder()
                .id(post.getId())
                .title(post.getTitle())
                .body(post.getBody())
                .comments(commentResource.getAllComments(post.getId()))
                .build();
    }

    @Override
    public PostDTO createPost(@Nonnull PostCreateDTO dto) {
        Post post = Post.builder()
                .title(dto.getTitle())
                .body(dto.getBody())
                .build();
        postRepository.save(post);
        return PostDTO.builder()
                .id(post.getId())
                .title(post.getTitle())
                .body(post.getBody())
                .build();
    }


    // Bu Api dan maqsad: Post Service orqali Comment Service dan foydalanish
    @Override
    public void createComment(@Nonnull List<CommentCreateDTO> dtos) {
        commentResource.saveAll(dtos);
    }
}
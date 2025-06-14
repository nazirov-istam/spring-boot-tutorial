package org.example.springboot.post;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.springboot.dto.CommentCreateDTO;
import org.example.springboot.dto.PostCreateDTO;
import org.example.springboot.dto.PostDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {
    private final PostService postService;

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> getPost(@PathVariable Integer id) {
        return ResponseEntity.ok(postService.getPost(id));
    }

    @PostMapping
    public ResponseEntity<PostDTO> createPost(@RequestBody PostCreateDTO dto) {
        return ResponseEntity.ok(postService.createPost(dto));
    }

    @PostMapping("/comment")
    public ResponseEntity<Void> createComment(@RequestBody List<CommentCreateDTO> dtos) {
        postService.createComment(dtos);
        return ResponseEntity.noContent().build();
    }
}

package org.example.springboot.resource;

import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import org.example.springboot.dto.CommentCreateDTO;
import org.example.springboot.dto.CommentDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentResource {
    //    private final RestTemplate restTemplate;
//    private final WebClient webClient;
    @Value("${comments.url.postComments}")
    private String postComments;
    @Value("${comments.url.saveComments}")
    private String saveComments;

    public void saveAll(List<CommentCreateDTO> commentCreateDTOS) {
//        WebClient webClient = WebClient.create(); Bean qilib Main Methodga yozib quyamiz
        /*webClient
                .post()
                .uri(saveComments)
                .body(BodyInserters.fromValue(commentCreateDTOS))
                .retrieve()
                .bodyToMono(Void.class)
                .block();*/
    }

    public List<CommentDTO> getAllComments(@Nonnull Integer postID) {
//        WebClient webClient = WebClient.create();
        /*return webClient
                .get()
                .uri(postComments, postID)
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<CommentDTO>>() {
                })
                .block();*/

        // Block bulmasa Async junatadi, Block bulsa Sync junatadi.
        //.bodyMono(); --> Single Object
        //.bodyFlux(); --> Unlimited Object
        return null;
    }
}
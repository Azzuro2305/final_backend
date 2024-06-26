package org.project.final_backend.service;

import org.project.final_backend.domain.request.post.NewPostRequest;
import org.project.final_backend.domain.request.post.UpdatePostRequest;
import org.project.final_backend.domain.response.post.NewPostResponse;
import org.project.final_backend.domain.response.post.UpdatePostResponse;
import org.project.final_backend.dto.model.PostDto;
import org.project.final_backend.dto.model.PostInfo;
import org.project.final_backend.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface PostService {
    Post findPostById(UUID id);
    List<Post> findPostsByUsersId(UUID userId);
    PostInfo retrievePostInfo(UUID id);
    NewPostResponse createPost(NewPostRequest request);
    UpdatePostResponse updatePost(UpdatePostRequest request);
    Map<String, Object> searchPostsAndUsers(int pageNumber, String searchKey);
    void deletePost(UUID userId, UUID id);
    Page<PostDto> getAllPosts(Pageable pageable, String[] sort);
}

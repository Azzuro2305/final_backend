package org.project.final_backend.domain.request.post;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;


@Getter
@Setter
public class NewPostRequest {
    private UUID userId;
    private String caption;
    private String uploadPhoto;
}

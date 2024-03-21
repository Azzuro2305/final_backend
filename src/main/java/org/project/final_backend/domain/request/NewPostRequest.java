package org.project.final_backend.domain.request;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
public class NewPostRequest {

    private String caption;
    private String uploadPhoto;

}
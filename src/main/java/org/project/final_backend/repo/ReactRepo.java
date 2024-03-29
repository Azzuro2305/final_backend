package org.project.final_backend.repo;

import org.project.final_backend.entity.Post;
import org.project.final_backend.entity.React;
import org.project.final_backend.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface ReactRepo extends JpaRepository<React, UUID> {
    Optional<React> findReactById(UUID uuid);
    @Query("SELECT r FROM React r WHERE r.postId.id = :postId AND r.userId.id = :userId")
    Optional<React> findReactByPostAndUser(@Param("postId") UUID postId, @Param("userId") UUID userId);
}

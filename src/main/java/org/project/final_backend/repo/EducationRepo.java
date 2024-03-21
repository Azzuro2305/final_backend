package org.project.final_backend.repo;

import org.project.final_backend.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface EducationRepo extends JpaRepository<Education, UUID> {
    Optional<Education> findEducationById(UUID id);
}

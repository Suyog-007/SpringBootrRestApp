package org.Shah.Spring.RestApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.Shah.Spring.RestApp.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitleContaining(String title);
}
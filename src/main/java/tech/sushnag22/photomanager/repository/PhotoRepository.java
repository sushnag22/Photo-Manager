package tech.sushnag22.photomanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.sushnag22.photomanager.model.Photo;

public interface PhotoRepository extends JpaRepository<Photo, Integer> {
}

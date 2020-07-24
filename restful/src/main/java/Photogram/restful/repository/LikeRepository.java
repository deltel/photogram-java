package Photogram.restful.repository;

import Photogram.restful.dto.Like;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface LikeRepository extends CrudRepository<Like, Integer> {
    List<Like> findByPostId(Integer postId);
}
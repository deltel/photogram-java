package Photogram.restful.repository;

import Photogram.restful.dto.Post;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PostRepository extends CrudRepository<Post, Integer> {
    List<Post> findByUserId(Integer userId);
}
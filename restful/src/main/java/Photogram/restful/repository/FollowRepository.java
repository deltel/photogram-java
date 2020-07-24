package Photogram.restful.repository;

import Photogram.restful.dto.Follow;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface FollowRepository extends CrudRepository<Follow, Integer> {
    List<Follow> findByUserId(Integer userId);
}
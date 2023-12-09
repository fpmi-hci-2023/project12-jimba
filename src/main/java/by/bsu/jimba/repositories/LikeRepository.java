package by.bsu.jimba.repositories;

import by.bsu.jimba.domain.entities.Like;
import by.bsu.jimba.domain.entities.Post;
import by.bsu.jimba.domain.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends JpaRepository<Like, String> {
    Like findByUserAndPost(User user, Post post);

    List<Like> findAllByPost(Post post);
}

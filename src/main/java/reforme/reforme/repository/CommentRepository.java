package reforme.reforme.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import reforme.reforme.entity.Comment;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}

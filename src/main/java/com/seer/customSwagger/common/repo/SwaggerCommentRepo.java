package com.seer.customSwagger.common.repo;


import com.seer.customSwagger.common.entity.SwaggerComment;
import com.seer.customSwagger.common.enums.IsYn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SwaggerCommentRepo extends JpaRepository<SwaggerComment, Long> {
    List<SwaggerComment> findByMethodAndPathAndIsDelete(String method, String path, IsYn isYn);
}

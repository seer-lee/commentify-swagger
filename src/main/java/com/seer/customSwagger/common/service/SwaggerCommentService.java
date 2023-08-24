package com.seer.customSwagger.common.service;


import com.seer.customSwagger.common.dto.SwaggerCommentReq;
import com.seer.customSwagger.common.entity.SwaggerComment;
import com.seer.customSwagger.common.enums.IsYn;
import com.seer.customSwagger.common.mapper.SwaggerCommentMapper;
import com.seer.customSwagger.common.repo.SwaggerCommentRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SwaggerCommentService {
    private final SwaggerCommentRepo swaggerCommentRepo;
    @Transactional
    public void setIsDelete(Long id) {
        SwaggerComment swaggerComment = swaggerCommentRepo.findById(id).get();
        swaggerComment.setIsDelete(IsYn.y);
    }

    public void save(SwaggerCommentReq.AddCommentReq req) {
        SwaggerComment swaggerComment = SwaggerCommentMapper.MAPPER.toPostEntity(req);
        swaggerCommentRepo.save(swaggerComment);
    }
}

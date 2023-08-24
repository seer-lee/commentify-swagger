package com.seer.customSwagger.common.mapper;

import com.seer.customSwagger.common.GenericMapper;
import com.seer.customSwagger.common.dto.SwaggerCommentReq;
import com.seer.customSwagger.common.dto.SwaggerCommentRes;
import com.seer.customSwagger.common.entity.SwaggerComment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 *     ApiCommentRes apiCommentRes = ApiCommentMapper.MAPPER.toDto(apiComment);
 *     List<ApiCommentRes> apiCommentResList = ApiCommentMapper.MAPPER.toDto(apiCommentList);
 *     ApiComment apiComment = ApiCommentMapper.Mapper.toEntity(apiCommentReq);
 */
@Mapper
public interface SwaggerCommentMapper extends GenericMapper<SwaggerCommentReq, SwaggerCommentRes, SwaggerComment> {
    SwaggerCommentMapper MAPPER = Mappers.getMapper(SwaggerCommentMapper.class);
    SwaggerComment toPostEntity(SwaggerCommentReq.AddCommentReq req);
}
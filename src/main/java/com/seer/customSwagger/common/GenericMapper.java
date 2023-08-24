package com.seer.customSwagger.common;

import java.util.List;

public interface GenericMapper <RequestDto, ResultDto, Entity> {
    Entity toEntity(final RequestDto requestDto); // Dto -> Entity
    ResultDto toDto(final Entity entity); // Entity -> Dto
    List<ResultDto> toDto(final List<Entity> entity); // List<Entity> -> List<Dto>
}

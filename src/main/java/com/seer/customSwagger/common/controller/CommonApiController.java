package com.seer.customSwagger.common.controller;


import com.seer.customSwagger.common.dto.SwaggerCommentReq;
import com.seer.customSwagger.common.service.SwaggerCommentService;
import io.swagger.v3.oas.annotations.Hidden;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicReference;

@Tag(name = "000. common")
@RestController
@RequiredArgsConstructor
public class CommonApiController implements HealthIndicator {
    private final AtomicReference<Health> healthAtomicReference = new AtomicReference<>(Health.up().build());
    private final SwaggerCommentService swaggerCommentService;


    @Override
    public Health health() {
        return healthAtomicReference.get();
    }

    @Schema(name = "common")
    @GetMapping("/api/health-check")
    public Health getHealth() {
        return health();
    }


    @Hidden
    @PostMapping("/comment")
    public void saveComment(@RequestBody SwaggerCommentReq.AddCommentReq req) {
        swaggerCommentService.save(req);
    }


    @Hidden
    @DeleteMapping("/comment")
    public void deleteComment(@RequestBody SwaggerCommentReq.DeleteCommentReq req) {
        swaggerCommentService.setIsDelete(req.getId());
    }
}

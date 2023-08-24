package com.seer.customSwagger.common.controller;



import com.seer.customSwagger.common.entity.SwaggerComment;
import com.seer.customSwagger.common.enums.IsYn;
import com.seer.customSwagger.common.repo.SwaggerCommentRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CommonController {
    private final SwaggerCommentRepo swaggerCommentRepo;


    // swagger-ui 연결
    @GetMapping("/swagger")
    public String getSwagger() {
        return "swagger";
    }

    // 댓글 가져오기
    @GetMapping("/comment")
    public String getComment(Model model, @RequestParam String method, @RequestParam String path) {
        List<SwaggerComment> commentList = swaggerCommentRepo.findByMethodAndPathAndIsDelete(method, path, IsYn.n);
        model.addAttribute("list", commentList)
                .addAttribute("path", path)
                .addAttribute("method", method);
        return "comment";
    }
}

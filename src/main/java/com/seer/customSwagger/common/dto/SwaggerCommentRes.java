package com.seer.customSwagger.common.dto;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

public class SwaggerCommentRes {
    @Getter
    @Builder
    public static class GetCommentListRes {
        private Long id;
        private String userName;
        private String method;
        private String path;
        private String content;
        private LocalDateTime createDt;
        private LocalDateTime updateDt;

        public void setId(Long id) {
            this.id = id;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public void setMethod(String method) {
            this.method = method;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void setCreateDt(LocalDateTime createDt) {
            this.createDt = createDt;
        }

        public void setUpdateDt(LocalDateTime updateDt) {
            this.updateDt = updateDt;
        }
    }
}

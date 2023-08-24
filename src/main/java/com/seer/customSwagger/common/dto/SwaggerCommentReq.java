package com.seer.customSwagger.common.dto;

import com.seer.customSwagger.common.enums.IsYn;
import lombok.Getter;

public class SwaggerCommentReq {
    @Getter
    public static class AddCommentReq {
        private String userName;
        private String method;
        private String path;
        private String content;
        private IsYn isDelete;

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

        public void setIsDelete(IsYn isDelete) {
            this.isDelete = isDelete;
        }
    }

    @Getter
    public static class ModifyCommentReq {
        private Long id;
        private String userName;
        private String method;
        private String path;
        private String content;

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
    }

    @Getter
    public static class DeleteCommentReq {
        private Long id;

        public void setId(Long id) {
            this.id = id;
        }

    }
}

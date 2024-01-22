package com.cos.blog.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown=true)
public class KakaoProfile {

    public Long id;
    public String connected_at;
    public KakaoAccount kakao_account;

    @Data
    @JsonIgnoreProperties(ignoreUnknown=true)
    public class KakaoAccount {

        /*public Boolean profile_image_needs_agreement;
        public Boolean has_email;
        public Boolean email_needs_agreement;
        public Boolean is_email_valid;
        public Boolean is_email_verified;;*/
    	
        public String email;

    }

}
 
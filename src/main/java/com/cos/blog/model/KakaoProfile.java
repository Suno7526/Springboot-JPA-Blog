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
	public class KakaoAccount{
		public String email;
	}
}

package com.cos.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
/* @DynamicInsert */ //insert 시 null값 제외하고 insert
public class User {

	@Id // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; // 시퀀스, auto_icrement

	@Column(nullable = false, length = 30)
	private String username; // 아이디

	@Column(nullable = false, length = 100)
	private String password;

	@Column(nullable = false, length = 50)
	private String email;

	//@ColumnDefault("user")
	@Enumerated(EnumType.STRING)
	private RoleType role;

	@CreationTimestamp
	private Timestamp createDate;

}

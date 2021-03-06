package com.sbs.exam.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Article extends Object {
	private int id;
	private int boardId;
	private String regDate;
	private String updateDate;
	private String title;
	private String body;
}

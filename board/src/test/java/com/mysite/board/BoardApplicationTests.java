package com.mysite.board;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;
import java.time.LocalDateTime;

import com.mysite.board.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.mysite.board.answer.Answer;
import com.mysite.board.question.Question;
import com.mysite.board.question.QuestionRepository;

@SpringBootTest
class BoardApplicationTests {
	
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for(int i=1; i<=300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content="내용 없음 ";
			this.questionService.create(subject, content);
		}
		
		
		
	}

}

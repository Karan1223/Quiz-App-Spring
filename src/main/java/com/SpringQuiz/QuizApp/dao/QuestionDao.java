package com.SpringQuiz.QuizApp.dao;

import com.SpringQuiz.QuizApp.Question;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer>
{

	List<Question> findByCategory(String category);
	 List<Question> findByDifficultyLevel(String difficultyLevel);
	 List<Question> findByCategoryAndDifficultyLevel(String category, String difficultyLevel);

}

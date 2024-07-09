package com.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderColumn;
import jakarta.persistence.Table;

@Entity
@Table(name="question123")
public class Question {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String question;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name="gid")
@OrderColumn(name="Type")
private List<Answer>answer;
public Question() {
	// TODO Auto-generated constructor stub
}
public Question(int id, String question) {
	super();
	this.id = id;
	this.question = question;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuestion() {
	return question;
}
public void setQuestion(String question) {
	this.question = question;
}
public List<Answer> getAnswer() {
	return answer;
}
public void setAnswer(List<Answer> answer) {
	this.answer = answer;
}



}
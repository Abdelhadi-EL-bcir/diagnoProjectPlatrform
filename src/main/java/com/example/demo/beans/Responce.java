package com.example.demo.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class Responce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int note;
    private String text;

    @OneToOne
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private Question question;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }


}


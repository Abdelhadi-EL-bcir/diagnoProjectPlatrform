package com.example.demo.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
public class Responce {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    public int tmp;
    private int note;
    private String text;

    @OneToOne
    @JoinColumn(name = "question_id")
    @JsonIgnore
    private Question question;

    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Responce responce;

    public Responce getResponce() {
        return responce;
    }

    public void setResponce(Responce responce) {
        this.responce = responce;
    }

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
        switch (text) {
            case "Tout_A_Fait_D'accord": {
                this.text = text;
                this.note = 5;
                break;
            }
            case "D'accord": {
                this.text = text;
                this.note = 4;
                break;
            }
            case "Neutre": {
                this.text = text;
                this.note = 3;
                break;
            }
            case "Pas_D'accord": {
                this.text = text;
                this.note = 2;
                break;
            }
            case "Desaccord_Total": {
                this.text = text;
                this.note = 1;
                break;
            }
            default: {
                this.text = text;
                this.note = 0;
            }
        };
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }


}


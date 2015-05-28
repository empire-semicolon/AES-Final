package com.aes.model;
// Generated May 22, 2015 8:39:55 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Exam generated by hbm2java
 */
@Entity
@Table(name="exam"
    ,catalog="aes"
)
public class Exam  implements java.io.Serializable {


     private int examId;
     private Course course;
     private String examTitle;
     private Date dateCreated;
     private Date dateEdited;
     private String questionDetails;
     private int numQuestions;
     private Date examStart;
     private Date examDue;
     private float timeLimit;
     private Set<ExamScores> examScoreses = new HashSet<ExamScores>(0);

    public Exam() {
    }

	
    public Exam(int examId, Course course, String examTitle, Date dateCreated, Date dateEdited, String questionDetails, int numQuestions, Date examStart, Date examDue, float timeLimit) {
        this.examId = examId;
        this.course = course;
        this.examTitle = examTitle;
        this.dateCreated = dateCreated;
        this.dateEdited = dateEdited;
        this.questionDetails = questionDetails;
        this.numQuestions = numQuestions;
        this.examStart = examStart;
        this.examDue = examDue;
        this.timeLimit = timeLimit;
    }
    public Exam(int examId, Course course, String examTitle, Date dateCreated, Date dateEdited, String questionDetails, int numQuestions, Date examStart, Date examDue, float timeLimit, Set<ExamScores> examScoreses) {
       this.examId = examId;
       this.course = course;
       this.examTitle = examTitle;
       this.dateCreated = dateCreated;
       this.dateEdited = dateEdited;
       this.questionDetails = questionDetails;
       this.numQuestions = numQuestions;
       this.examStart = examStart;
       this.examDue = examDue;
       this.timeLimit = timeLimit;
       this.examScoreses = examScoreses;
    }
   
     @Id 

    
    @Column(name="examId", unique=true, nullable=false)
    public int getExamId() {
        return this.examId;
    }
    
    public void setExamId(int examId) {
        this.examId = examId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="course_courseId", nullable=false)
    public Course getCourse() {
        return this.course;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }

    
    @Column(name="examTitle", nullable=false, length=50)
    public String getExamTitle() {
        return this.examTitle;
    }
    
    public void setExamTitle(String examTitle) {
        this.examTitle = examTitle;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dateCreated", nullable=false, length=19)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dateEdited", nullable=false, length=19)
    public Date getDateEdited() {
        return this.dateEdited;
    }
    
    public void setDateEdited(Date dateEdited) {
        this.dateEdited = dateEdited;
    }

    
    @Column(name="questionDetails", nullable=false)
    public String getQuestionDetails() {
        return this.questionDetails;
    }
    
    public void setQuestionDetails(String questionDetails) {
        this.questionDetails = questionDetails;
    }

    
    @Column(name="numQuestions", nullable=false)
    public int getNumQuestions() {
        return this.numQuestions;
    }
    
    public void setNumQuestions(int numQuestions) {
        this.numQuestions = numQuestions;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="examStart", nullable=false, length=19)
    public Date getExamStart() {
        return this.examStart;
    }
    
    public void setExamStart(Date examStart) {
        this.examStart = examStart;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="examDue", nullable=false, length=19)
    public Date getExamDue() {
        return this.examDue;
    }
    
    public void setExamDue(Date examDue) {
        this.examDue = examDue;
    }

    
    @Column(name="timeLimit", nullable=false, precision=12, scale=0)
    public float getTimeLimit() {
        return this.timeLimit;
    }
    
    public void setTimeLimit(float timeLimit) {
        this.timeLimit = timeLimit;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="exam")
    public Set<ExamScores> getExamScoreses() {
        return this.examScoreses;
    }
    
    public void setExamScoreses(Set<ExamScores> examScoreses) {
        this.examScoreses = examScoreses;
    }




}



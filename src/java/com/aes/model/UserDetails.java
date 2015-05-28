package com.aes.model;
// Generated May 22, 2015 8:39:55 PM by Hibernate Tools 4.3.1


import java.text.SimpleDateFormat;
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
import javax.persistence.UniqueConstraint;

/**
 * UserDetails generated by hbm2java
 */
@Entity
@Table(name="user_details"
    ,catalog="aes"
    , uniqueConstraints = @UniqueConstraint(columnNames="userName") 
)
public class UserDetails  implements java.io.Serializable {


     private int userId;
     private BusinessUnit businessUnit;
     private UserType userType;
     private String userName;
     private String password;
     private String firstName;
     private String middleName;
     private String lastName;
     private Date birthday;
     private String position;
     private String email;
     private Date dateCreated;
     private boolean recordStatus;
     private int companyId;
     private Set<CoursesAssigned> coursesAssigneds = new HashSet<CoursesAssigned>(0);
     private Set<ExamScores> examScoreses = new HashSet<ExamScores>(0);
     private Set<Course> courses = new HashSet<Course>(0);

    public UserDetails() {
    }

	
    public UserDetails(int userId, BusinessUnit businessUnit, UserType userType, String userName, String password, String firstName, String middleName, String lastName, Date birthday, String position, String email, Date dateCreated, boolean recordStatus, int companyId) {
        this.userId = userId;
        this.businessUnit = businessUnit;
        this.userType = userType;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.position = position;
        this.email = email;
        this.dateCreated = dateCreated;
        this.recordStatus = recordStatus;
        this.companyId = companyId;
    }
    public UserDetails(int userId, BusinessUnit businessUnit, UserType userType, String userName, String password, String firstName, String middleName, String lastName, Date birthday, String position, String email, Date dateCreated, boolean recordStatus, int companyId, Set<CoursesAssigned> coursesAssigneds, Set<ExamScores> examScoreses, Set<Course> courses) {
       this.userId = userId;
       this.businessUnit = businessUnit;
       this.userType = userType;
       this.userName = userName;
       this.password = password;
       this.firstName = firstName;
       this.middleName = middleName;
       this.lastName = lastName;
       this.birthday = birthday;
       this.position = position;
       this.email = email;
       this.dateCreated = dateCreated;
       this.recordStatus = recordStatus;
       this.companyId = companyId;
       this.coursesAssigneds = coursesAssigneds;
       this.examScoreses = examScoreses;
       this.courses = courses;
    }
   
     @Id 

    
    @Column(name="userId", unique=true, nullable=false)
    public int getUserId() {
        return this.userId;
    }
    
    public void setUserId(int userId) {
        this.userId = userId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="business_unit_businessUnitId", nullable=false)
    public BusinessUnit getBusinessUnit() {
        return this.businessUnit;
    }
    
    public void setBusinessUnit(BusinessUnit businessUnit) {
        this.businessUnit = businessUnit;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="user_type_userTypeId", nullable=false)
    public UserType getUserType() {
        return this.userType;
    }
    
    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    
    @Column(name="userName", unique=true, nullable=false, length=45)
    public String getUserName() {
        return this.userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    
    @Column(name="password", nullable=false, length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="firstName", nullable=false, length=45)
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    @Column(name="middleName", nullable=false, length=45)
    public String getMiddleName() {
        return this.middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    
    @Column(name="lastName", nullable=false, length=45)
    public String getLastName() {
        return this.lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="birthday", nullable=false, length=10)
    public Date getBirthday() {
        return this.birthday;
    }
    
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    
    @Column(name="position", nullable=false, length=45)
    public String getPosition() {
        return this.position;
    }
    
    public void setPosition(String position) {
        this.position = position;
    }

    
    @Column(name="email", nullable=false, length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="dateCreated", nullable=false, length=19)
    public Date getDateCreated() {
        return this.dateCreated;
    }
    
    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    
    @Column(name="recordStatus", nullable=false)
    public boolean isRecordStatus() {
        return this.recordStatus;
    }
    
    public void setRecordStatus(boolean recordStatus) {
        this.recordStatus = recordStatus;
    }

    
    @Column(name="companyId", nullable=false)
    public int getCompanyId() {
        return this.companyId;
    }
    
    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userDetails")
    public Set<CoursesAssigned> getCoursesAssigneds() {
        return this.coursesAssigneds;
    }
    
    public void setCoursesAssigneds(Set<CoursesAssigned> coursesAssigneds) {
        this.coursesAssigneds = coursesAssigneds;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userDetails")
    public Set<ExamScores> getExamScoreses() {
        return this.examScoreses;
    }
    
    public void setExamScoreses(Set<ExamScores> examScoreses) {
        this.examScoreses = examScoreses;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="userDetails")
    public Set<Course> getCourses() {
        return this.courses;
    }
    
    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }        

}



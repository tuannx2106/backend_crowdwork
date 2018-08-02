package app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users_freelancer")
public class UsersFreelancer implements Serializable {

    @Id
//    @OneToOne
    @JoinColumn(name = "user_id")
    private Users userId;

    @Column(name = "status_id")
    private String statusId;

    @Column(name = "working_time")
    private String workingTime;

    @Column(name = "salary_per_hour")
    private Long salaryPerHour;

    @Column(name = "about")
    private String about;

    @Column(name = "username_github")
    private String usernameGithub;

    @Column(name = "degree")
    private String degree;

    @Column(name = "del_flag")
    private Boolean delFlag;

    @Column(name = "create_user")
    private Integer createUser;

    @Column(name = "update_user")
    private Integer updateUser;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "userFreelancerUser")
    private List<UserFreelancerHasSkill> userFreelancerHasSkills;

    @OneToMany(mappedBy = "userFreelancerUser")
    private List<UserFreelancerHasJob> userFreelancerHasJobs;

    @OneToMany(mappedBy = "userFreelancerUse")
    private List<Contracts> contracts;

    public UsersFreelancer() {
    }

    public UsersFreelancer(String statusId, String workingTime, Long salaryPerHour, String about, String usernameGithub, String degree, Boolean delFlag) {
        this.statusId = statusId;
        this.workingTime = workingTime;
        this.salaryPerHour = salaryPerHour;
        this.about = about;
        this.usernameGithub = usernameGithub;
        this.degree = degree;
        this.delFlag = delFlag;
    }

    public UsersFreelancer(String statusId, String workingTime, Long salaryPerHour, String about, String usernameGithub, String degree, Boolean delFlag, Integer createUser, Integer updateUser, Date createTime, Date updateTime) {
        this.statusId = statusId;
        this.workingTime = workingTime;
        this.salaryPerHour = salaryPerHour;
        this.about = about;
        this.usernameGithub = usernameGithub;
        this.degree = degree;
        this.delFlag = delFlag;
        this.createUser = createUser;
        this.updateUser = updateUser;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }

    public String getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(String workingTime) {
        this.workingTime = workingTime;
    }

    public Long getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(Long salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getUsernameGithub() {
        return usernameGithub;
    }

    public void setUsernameGithub(String usernameGithub) {
        this.usernameGithub = usernameGithub;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public Boolean getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(Boolean delFlag) {
        this.delFlag = delFlag;
    }

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

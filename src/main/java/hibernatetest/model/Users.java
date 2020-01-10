package hibernatetest.model;

import javax.persistence.*;

@Entity
@Table(name = "users")
//@NamedQuery(name = "hibernatetest.findUsersById", query = "select h from Users h where h.id=?1")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "location")
    private String location;
    @Column(name = "gender")
    private String gender;
    @Column(name = "comment")
    private String comment;

    public Users() {
    }

    public Users(String email, String password, String location, String gender, String comment) {
        this.email = email;
        this.password = password;
        this.location = location;
        this.gender = gender;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Users{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", location='" + location + '\'' +
                ", gender='" + gender + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}

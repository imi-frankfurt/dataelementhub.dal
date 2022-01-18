/*
 * This file is generated by jOOQ.
 */
package de.dataelementhub.dal.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DehubUser implements Serializable {

    private static final long serialVersionUID = 296023808;

    private Integer id;
    private String  authId;
    private String  firstName;
    private String  lastName;
    private String  userName;
    private String  email;

    public DehubUser() {}

    public DehubUser(DehubUser value) {
        this.id = value.id;
        this.authId = value.authId;
        this.firstName = value.firstName;
        this.lastName = value.lastName;
        this.userName = value.userName;
        this.email = value.email;
    }

    public DehubUser(
        Integer id,
        String  authId,
        String  firstName,
        String  lastName,
        String  userName,
        String  email
    ) {
        this.id = id;
        this.authId = authId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.email = email;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthId() {
        return this.authId;
    }

    public void setAuthId(String authId) {
        this.authId = authId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DehubUser (");

        sb.append(id);
        sb.append(", ").append(authId);
        sb.append(", ").append(firstName);
        sb.append(", ").append(lastName);
        sb.append(", ").append(userName);
        sb.append(", ").append(email);

        sb.append(")");
        return sb.toString();
    }
}

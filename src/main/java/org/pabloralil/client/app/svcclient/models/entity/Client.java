package org.pabloralil.client.app.svcclient.models.entity;

import java.io.Serializable;
// import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// import jakarta.persistence.Temporal;
// import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name="clients")
public class Client implements Serializable{

    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String name;
    
    @NotBlank
    @Column(name="last_name")
    private String lastName;

    @NotEmpty
    @Email
    private String email;

    // @Column(name="create_at")
    // @Temporal(TemporalType.DATE)
    // private Date createAt;
    
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    // public Date getCreateAt() {
    //     return createAt;
    // }
    
    // public void setCreateAt(Date createAt) {
    //     this.createAt = createAt;
    // }
    
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    
    
    private static final long serialVersionUID = 1L;
    
}

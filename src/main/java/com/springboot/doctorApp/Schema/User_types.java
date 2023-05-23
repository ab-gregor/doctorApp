package com.springboot.doctorApp.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.catalina.User;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User_types {
    @Id
    @GeneratedValue
    int user_type_id;
    String type;

    @OneToMany(fetch=FetchType.EAGER)
    public List<Users> usersList;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy = "user_type_Id")
//    private List<Users> users;

}

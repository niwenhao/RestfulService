package per.nwh.learn.springboot.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class User {
    @Id @GeneratedValue
    long id;

    String name;
    String address;
}

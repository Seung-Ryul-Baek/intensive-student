package edu.intensive;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Student {
    @Id
    @GeneratedValue
    Long studentId;
    String studentName;
}

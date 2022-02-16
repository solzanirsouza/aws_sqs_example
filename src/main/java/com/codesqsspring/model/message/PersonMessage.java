package com.codesqsspring.model.message;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonMessage implements Serializable {

    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "PersonMessage{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

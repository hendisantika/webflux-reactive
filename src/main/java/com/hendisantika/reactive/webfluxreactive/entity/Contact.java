package com.hendisantika.reactive.webfluxreactive.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:32
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "contact")
public class Contact implements Serializable {
    private String id;
    private String name;
    private String email;
    private String address;
    private Date createdDate;
}

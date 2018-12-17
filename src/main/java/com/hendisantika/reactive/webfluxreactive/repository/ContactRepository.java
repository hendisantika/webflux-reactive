package com.hendisantika.reactive.webfluxreactive.repository;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:33
 */
public interface ContactRepository extends ReactiveMongoRepository<Contact, String>, ContactRepositoryCustom {
}

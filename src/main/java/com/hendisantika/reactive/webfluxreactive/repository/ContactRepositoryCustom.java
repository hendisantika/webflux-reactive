package com.hendisantika.reactive.webfluxreactive.repository;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:34
 */
public interface ContactRepositoryCustom {
    Mono<Page<Contact>> findAll(Pageable pageable);
}

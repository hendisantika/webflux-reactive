package com.hendisantika.reactive.webfluxreactive.service;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import com.hendisantika.reactive.webfluxreactive.utils.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:46
 */
public interface ContactService {
    Mono<Page<Contact>> getAll(Pageable pageable);

    void init();
}

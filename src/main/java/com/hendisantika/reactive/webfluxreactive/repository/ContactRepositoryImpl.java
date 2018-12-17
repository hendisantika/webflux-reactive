package com.hendisantika.reactive.webfluxreactive.repository;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import com.hendisantika.reactive.webfluxreactive.utils.PageUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.Query;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:35
 */
public class ContactRepositoryImpl implements ContactRepositoryCustom {

    @Autowired
    private PageUtils pageUtils;

    @Override
    public Mono<Page<Contact>> findAll(Pageable pageable) {
        Query query = new Query();
        query.with(pageable);
        return pageUtils.toPage(query, pageable, Contact.class);
    }
}

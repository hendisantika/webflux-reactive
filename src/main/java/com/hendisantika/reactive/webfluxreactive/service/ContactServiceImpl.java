package com.hendisantika.reactive.webfluxreactive.service;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import com.hendisantika.reactive.webfluxreactive.repository.ContactRepository;
import com.hendisantika.reactive.webfluxreactive.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:47
 */
public class ContactServiceImpl implements ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImpl(ContactRepository basicRepository) {
        this.contactRepository = basicRepository;
    }

    @Override
    public Mono<Page<Contact>> getAll(Pageable page) {
        return Mono.<Page<Contact>>create(emitter -> {
            Mono<Page<Contact>> result = contactRepository.findAll(page);
            result.subscribe(emitter::success);
        }).subscribeOn(Schedulers.elastic());
    }

    @Override
    public void init() {
        for (int i = 0; i < 1000; i++) {
            contactRepository.save(new Contact(null, "Name - " + i, "name" + i + "@konohagakure,com", "address - " + i, new Date())).block();
        }
    }
}

package com.hendisantika.reactive.webfluxreactive.controller;

import com.hendisantika.reactive.webfluxreactive.entity.Contact;
import com.hendisantika.reactive.webfluxreactive.service.ContactService;
import com.hendisantika.reactive.webfluxreactive.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : webflux-reactive
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2018-12-18
 * Time: 06:50
 */

@RestController
@RequestMapping(value = "/contact")
public class ContactController {
    @Autowired
    private ContactService basicService;


    @GetMapping("/all")
    public Mono<Page<Contact>> getEntitiesPage(
            @RequestParam(name = "page") int page,
            @RequestParam(name = "size") int size,
            @RequestParam(required = false) Sort sortDirection
    ) {
        return basicService.getAll(PageRequest.of(page, size));
    }

    @GetMapping("/init")
    public void init() {
        basicService.init();
    }
}

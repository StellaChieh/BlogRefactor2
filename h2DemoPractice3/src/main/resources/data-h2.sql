insert into author(id, first_name, last_name, email_address) values (1, "mike", "lee","mike@gmail.com");
insert into author(id, first_name, last_name, email_address) values (2, "ola", "lin", "ola@gmail.com");
insert into post(id, title, slug, teaser, posted_on, author_id, body) values(1, "blog 1", "post1", "1111111", CURRENT_TIMESTAMP , 1, "aa");
insert into post(id, title, slug, teaser, posted_on, author_id, body) values(2, "blog 2", "post2", "2222222", CURRENT_TIMESTAMP , 1, "bb");
insert into post(id, title, slug, teaser, posted_on, author_id, body) values(3, "blog 3", "post3", "3333333", CURRENT_TIMESTAMP , 2, "cc");
insert into post(id, title, slug, teaser, posted_on, author_id, body) values(4, "blog 4", "post4", "4444444", CURRENT_TIMESTAMP , 2, "dd");


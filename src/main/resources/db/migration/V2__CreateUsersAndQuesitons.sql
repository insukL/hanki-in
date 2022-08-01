CREATE TABLE users (
   id SERIAL PRIMARY KEY,
   account VARCHAR(50) NOT NULL,
   password CHAR(60) NOT NULL,
   semester SMALLINT DEFAULT 1,
   is_semester_off BOOLEAN DEFAULT FALSE,
   university VARCHAR(12) NOT NULL,
   answer_point INT DEFAULT 0,
   deleted_at DATE,
   create_at DATE DEFAULT NOW(),
   updated_at DATE DEFAULT NOW()
);

create table questions (
    id SERIAL PRIMARY KEY,
    writer INT,
    title VARCHAR(50) NOT NULL,
    content VARCHAR(2000) NOT NULL,
    choice_answer INT,
    deleted_at DATE,
    create_at DATE DEFAULT NOW(),
    updated_at DATE DEFAULT NOW(),
    CONSTRAINT fk_writer FOREIGN KEY(writer)
       REFERENCES "users"(id) ON DELETE NO ACTION
);
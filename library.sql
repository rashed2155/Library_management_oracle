DROP TABLE customer;
DROP TABLE orders;
DROP TABLE bookreturn;
DROP TABLE booklend;
DROP TABLE addmember;
DROP TABLE employe;
DROP TABLE addbook;
DROP TABLE userr;

CREATE TABLE userr(
    username VARCHAR(30),
    password varchar(30),
    PRIMARY KEY(username)
);
INSERT INTO userr VALUES ('rashed', '2155');
INSERT INTO userr VALUES ('abir', '1219');
COMMIT;

CREATE TABLE addbook(
    book_id VARCHAR(20) not null,
    nam VARCHAR(30),
    book_code VARCHAR(30),
    dat VARCHAR(20),
    category VARCHAR(30),
    book_type VARCHAR(30),
    publisher VARCHAR(30),
    price VARCHAR(30),
    PRIMARY key (book_id)
);

CREATE TABLE employe(
    emp_id VARCHAR(30) not null,
    emp_name VARCHAR(40),
    emp_num VARCHAR(15),
    emp_add VARCHAR(50),
    emp_typ VARCHAR(20),
    dob VARCHAR(30),
    stats VARCHAR(20),
    PRIMARY KEY (emp_id)
);

CREATE TABLE addmember(
    mid VARCHAR(20) not null,
    nam VARCHAR(30),
    student_id VARCHAR(30),
    birthday VARCHAR(30),
    gender VARCHAR(30),
    addres VARCHAR(50),
    email VARCHAR(20),
    contact VARCHAR(15),
    typ VARCHAR(30),
    PRIMARY KEY (mid)
);

CREATE TABLE booklend(
    record_no VARCHAR(30) not null,
    member_id VARCHAR(30),
    book_id VARCHAR(30),
    issue_date VARCHAR(30),
    return_date VARCHAR(30),
    PRIMARY KEY (record_no),
    FOREIGN KEY (member_id) REFERENCES addmember(mid) ON DELETE CASCADE,
    FOREIGN KEY (book_id) REFERENCES addbook(book_id) ON DELETE CASCADE
);



CREATE TABLE bookreturn(
    bid VARCHAR(30),
    member_id VARCHAR(30),
    late_days VARCHAR(30),
    fine VARCHAR(30),
    FOREIGN KEY (member_id) REFERENCES addmember(mid) ON DELETE CASCADE,
    FOREIGN KEY (bid) REFERENCES addbook(book_id) ON DELETE CASCADE
);

CREATE TABLE orders(
    order_no VARCHAR(30) not null,
    Book_Code VARCHAR(30),
    book_name VARCHAR(30),
    cus_nam VARCHAR(30),
    cus_number VARCHAR(15) not null,
    customer_add VARCHAR(30) not null,
    quan NUMBER(10) not null,
    PRIMARY KEY (order_no)
);


CREATE TABLE customer(
    cus_id VARCHAR(30),
    name VARCHAR(30),
    dob VARCHAR(30),
    phone VARCHAR(20),
    username VARCHAR(30),
    passwd VARCHAR(30),
    address VARCHAR(50),
    PRIMARY KEY(cus_id)
);

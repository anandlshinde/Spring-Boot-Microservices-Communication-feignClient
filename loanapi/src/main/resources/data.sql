create table tbl_loan_info(
	loan_id int primary key,
	loan_name varchar(50),
	interest_rate double(20),
	processing_fee double(20),
	min_tenor int(10)
	);
insert into tbl_loan_info values(1,'HL',6.90,2,120);
insert into tbl_loan_info values(2,'PL',13.20,5,180);
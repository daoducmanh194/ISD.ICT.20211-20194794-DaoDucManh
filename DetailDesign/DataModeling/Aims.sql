CREATE TABLE media (
	mid int SERIAL PRIMARY KEY  NOTNULL,
	category varchar(45) NOTNULL,
	price int NOTNULL,
	quantity int NOTNULL,
	title varchar(45) NOTNULL,
	mvalue int NOTNULL,
	imageUrl varchar(45) NOTNULL
);

CREATE TABLE cd (
	CDid int SERIAL PRIMARY KEY NOTNULL,
	artist varchar(45) NOTNULL,
	recordLabel varchar(45) NOTNULL,
	musicType varchar(45) NOTNULL,
	releasedDate Date,
	CONSTRAINT fk_CD_Media FOREIGN KEY (CDid) REFERENCES media(mid)
);

CREATE TABLE book (
	bookId int SERIAL PRIMARY KEY NOTNULL,
	author varchar(45) NOTNULL,
	coverType varchar(45) NOTNULL,
	publisher varchar(45) NOTNULL,
	publishDate Date NOTNULL,
	numOfPages int NOTNULL,
	bookLanguage varchar(45) NOTNULL,
	bookCategory varchar(45) NOTNULL,
	CONSTRAINT fk_Book_Media FOREIGN KEY (bookId) REFERENCES media(mid)
);

CREATE TABLE dvd (
	DVDid int SERIAL PRIMARY KEY NOTNULL,
	discType varchar(45) NOTNULL,
	director varchar(45) NOTNULL,
	runtime int NOTNULL,
	studio varchar(45) NOTNULL,
	subtitle varchar(45) NOTNULL,
	releasedDate Date NOTNULL,
	CONSTRAINT fk_DVD_Media FOREIGN KEY (DVDid) REFERENCES media(mid)
);

CREATE TABLE deliveryInfo (
	deliveryInfoId int SERIAL PRIMARY KEY NOTNULL,
	deliveryName varchar(45),
	province varchar(45),
	instructions varchar(200),
	address varchar(100), 
	rushOrder bool,
);

CREATE TABLE card (
	cardId int SERIAL PRIMARY KEY NOT NULL,
	cardCode varchar(15) NOTNULL,
	cardOwner varchar(45) NOTNULL,
	cvvCode varchar(3) NOTNULL,
	dateExpired Date NOTNULL
);

CREATE TABLE order (
	orderID int NOTNULL,
	shippingFees int NOTNULL,
	deliveryInfoId int NOTNULL,
	PRIMARY KEY(orderId, deliveryInfoId),
	FOREIGN KEY (deliveryInfoId) REFERENCES deliveryIno(deliveryInfoId)
);

CREATE TABLE orderMedia (
	orderId int NOTNULL,
	price int NOTNULL,
	quantity int NOTNULL,
	mid int NOTNULL,
	PRIMARY KEY(orderId, mid),
	FOREIGN KEY (orderId) REFERENCES order(orderid),
	FOREIGN KEY (mid) REFERENCES media(mid)
);

CREATE TABLE invoice (
	invoiceId int NOTNULL PRIMARY KEY,
	totalAmount int NOTNULL,
	orderId int NOTNULL,
	FOREIGN KEY (orderId) REFERENCES order(orderId)
);

CREATE TABLE paymentTransaction (
	paymentTransactionId int NOTNULL PRIMARY KEY,
	createAt Date NOTNULL,
	contents varchar(45),
	methods varchar(45),
	cardId int NOTNULL,
	invoiceId int NOTNULL,
	FOREIGN KEY (cardId) REFERENCES card(cardId),
	FOREIGN KEY (invoiceId) REFERENCES invoice(invoiceId)
);
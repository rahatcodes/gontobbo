/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  DCL
 * Created: 26 Dec 2024
 */

BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "seattype" (
	"id"	integer NOT NULL,
	"name"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "tripcategory" (
	"id"	integer NOT NULL,
	"name"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "trip" (
	"id"	integer NOT NULL,
	"from_location"	varchar(100) NOT NULL,
	"to_location"	varchar(100) NOT NULL,
	"start_time"	datetime NOT NULL,
	"price"	decimal NOT NULL,
	"total_seats"	integer NOT NULL,
	"available_seats"	integer NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	"seat_type_id"	bigint NOT NULL,
	"trip_category_id"	bigint NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("trip_category_id") REFERENCES "tripcategory"("id") DEFERRABLE INITIALLY DEFERRED,
	FOREIGN KEY("seat_type_id") REFERENCES "seattype"("id") DEFERRABLE INITIALLY DEFERRED
);
CREATE TABLE IF NOT EXISTS "booking" (
	"id"	integer NOT NULL,
	"passenger_name"	varchar(100) NOT NULL,
	"passenger_phone"	varchar(100) NOT NULL,
	"passenger_nid"	varchar(100) NOT NULL,
	"total_seats"	integer NOT NULL,
	"total_price"	decimal NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	"seller_id"	bigint NOT NULL,
	"trip_id"	bigint NOT NULL,
	PRIMARY KEY("id" AUTOINCREMENT),
	FOREIGN KEY("seller_id") REFERENCES "receptionist"("id") DEFERRABLE INITIALLY DEFERRED,
	FOREIGN KEY("trip_id") REFERENCES "trip"("id") DEFERRABLE INITIALLY DEFERRED
);
CREATE TABLE IF NOT EXISTS "admin" (
	"id"	integer NOT NULL,
	"password"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	"is_admin"	bool NOT NULL,
	"username"	varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "receptionist" (
	"id"	integer NOT NULL,
	"password"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL,
	"updated_at"	datetime NOT NULL,
	"is_admin"	bool NOT NULL,
	"username"	varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
INSERT INTO "seattype" ("id","name","created_at","updated_at") VALUES (1,'Ac','2024-12-14 08:33:58.643011','2024-12-14 08:33:58.643972'),
 (2,'Non-Ac','2024-12-14 08:34:03.433182','2024-12-14 08:34:03.433182');
INSERT INTO "tripcategory" ("id","name","created_at","updated_at") VALUES (1,'Bus','2024-12-14 08:33:44.480863','2024-12-14 08:33:44.480863'),
 (2,'Train','2024-12-14 08:33:48.712301','2024-12-14 08:33:48.712301');
INSERT INTO "admin" ("id","password","created_at","updated_at","is_admin","username") VALUES (1,'Ab@12345','2024-12-14 08:38:35.507473','2024-12-14 08:38:35.507473',1,'admin');
INSERT INTO "receptionist" ("id","password","created_at","updated_at","is_admin","username") VALUES (1,'Ab@12345','2024-12-14 08:39:06.156629','2024-12-14 08:39:06.156629',0,'user');
CREATE INDEX IF NOT EXISTS "trip_seat_type_id_33311535" ON "trip" (
	"seat_type_id"
);
CREATE INDEX IF NOT EXISTS "trip_trip_category_id_aae6a017" ON "trip" (
	"trip_category_id"
);
CREATE INDEX IF NOT EXISTS "booking_seller_id_0cf92687" ON "booking" (
	"seller_id"
);
CREATE INDEX IF NOT EXISTS "booking_trip_id_887fb698" ON "booking" (
	"trip_id"
);
COMMIT;

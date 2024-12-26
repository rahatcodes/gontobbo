/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  DCL
 * Created: 26 Dec 2024
 */

BEGIN TRANSACTION;
CREATE TABLE IF NOT EXISTS "trip" (
	"id"	integer NOT NULL,
	"from_location"	varchar(100) NOT NULL,
	"to_location"	varchar(100) NOT NULL,
	"start_time"	datetime NOT NULL,
	"price"	decimal NOT NULL,
	"total_seats"	integer NOT NULL,
	"available_seats"	integer NOT NULL,
	"seat_type" varchar(10) NOT NULL,
	"trip_category" varchar(10) NOT NULL,
	"created_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"updated_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "booking" (
	"id"	integer NOT NULL,
	"passenger_name"	varchar(100) NOT NULL,
	"passenger_phone"	varchar(100) NOT NULL,
	"passenger_nid"	varchar(100) NOT NULL,
	"total_seats"	integer NOT NULL,
	"total_price"	decimal NOT NULL,
	"created_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"updated_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"seller_id"	bigint NOT NULL,
	"trip_id"	bigint NOT NULL,
	FOREIGN KEY("trip_id") REFERENCES "trip"("id") DEFERRABLE INITIALLY DEFERRED,
	FOREIGN KEY("seller_id") REFERENCES "receptionist"("id") DEFERRABLE INITIALLY DEFERRED,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "admin" (
	"id"	integer NOT NULL,
	"password"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"updated_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"is_admin"	bool NOT NULL,
	"username"	varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);
CREATE TABLE IF NOT EXISTS "receptionist" (
	"id"	integer NOT NULL,
	"password"	varchar(100) NOT NULL,
	"created_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"updated_at"	datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
	"is_admin"	bool NOT NULL,
	"username"	varchar(100) NOT NULL UNIQUE,
	PRIMARY KEY("id" AUTOINCREMENT)
);

INSERT INTO "admin" ("id","password","created_at","updated_at","is_admin","username") VALUES (1,'Ab@12345','2024-12-14 08:38:35.507473','2024-12-14 08:38:35.507473',1,'admin');
INSERT INTO "receptionist" ("id","password","created_at","updated_at","is_admin","username") VALUES (1,'Ab@12345','2024-12-14 08:39:06.156629','2024-12-14 08:39:06.156629',0,'Rahat');

CREATE INDEX IF NOT EXISTS "booking_seller_id_0cf92687" ON "booking" (
	"seller_id"
);
CREATE INDEX IF NOT EXISTS "booking_trip_id_887fb698" ON "booking" (
	"trip_id"
);
COMMIT;

/*
 Navicat Premium Data Transfer

 Source Server         : example
 Source Server Type    : PostgreSQL
 Source Server Version : 160001 (160001)
 Source Host           : 127.0.0.1:5432
 Source Catalog        : exam
 Source Schema         : public

 Target Server Type    : PostgreSQL
 Target Server Version : 160001 (160001)
 File Encoding         : 65001

 Date: 12/12/2023 22:16:14
*/


-- ----------------------------
-- Table structure for user_db
-- ----------------------------
DROP TABLE IF EXISTS "public"."user_db";
CREATE TABLE "public"."user_db" (
  "id" int8 NOT NULL DEFAULT nextval('user_db_id_seq'::regclass),
  "birth_date" date,
  "first_name" varchar(255) COLLATE "pg_catalog"."default",
  "last_name" varchar(255) COLLATE "pg_catalog"."default",
  "middle_name" varchar(255) COLLATE "pg_catalog"."default",
  "password" varchar(255) COLLATE "pg_catalog"."default",
  "username" varchar(255) COLLATE "pg_catalog"."default"
)
;
ALTER TABLE "public"."user_db" OWNER TO "postgres";

-- ----------------------------
-- Records of user_db
-- ----------------------------
BEGIN;
INSERT INTO "public"."user_db" ("id", "birth_date", "first_name", "last_name", "middle_name", "password", "username") VALUES (2, '2022-05-11', 'edwin', 'bato', 'F', '121c60df0c03083d2693c251f15fdfb2', 'miui');
INSERT INTO "public"."user_db" ("id", "birth_date", "first_name", "last_name", "middle_name", "password", "username") VALUES (4, '2019-07-17', 'Hans', 'Solo', 'Q', '8ee2027983915ec78acc45027d874316', 'merchant321');
INSERT INTO "public"."user_db" ("id", "birth_date", "first_name", "last_name", "middle_name", "password", "username") VALUES (1, '2023-12-11', 'meow', 'kitty', 'P', 'a021411eb98f3501a463f01e9c091dd4', 'daijobu');
INSERT INTO "public"."user_db" ("id", "birth_date", "first_name", "last_name", "middle_name", "password", "username") VALUES (3, '2022-01-15', 'mellow', 'walis', 'G', 'a2a973f6b7bd19816dffdc801d142220', 'amd123');
COMMIT;

-- ----------------------------
-- Primary Key structure for table user_db
-- ----------------------------
ALTER TABLE "public"."user_db" ADD CONSTRAINT "user_db_pkey" PRIMARY KEY ("id");

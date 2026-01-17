CREATE TABLE IF NOT EXISTS accounts (
  user_id int REFERENCES users(id),
   account_number SERIAL PRIMARY KEY,
  account_type varchar(100) NOT NULL,
  branch_address varchar(200) NOT NULL
);
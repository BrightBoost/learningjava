CREATE SCHEMA cars;
USE cars;

CREATE TABLE dealerships (
    dealership_id INT AUTO_INCREMENT PRIMARY KEY,
    name          VARCHAR(50)  NOT NULL,
    address       VARCHAR(50)  NOT NULL,
    phone         VARCHAR(12)  NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE vehicles (
    VIN           CHAR(17)      NOT NULL,
    make          VARCHAR(30)   NOT NULL,
    model         VARCHAR(50)   NOT NULL,
    model_year    INT           NOT NULL,
    color         VARCHAR(20)   NOT NULL,
    mileage_km    INT           NOT NULL,
    price_eur     DECIMAL(10,2) NOT NULL,
    sold          TINYINT(1)    NOT NULL DEFAULT 0,
    PRIMARY KEY (VIN)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE inventory (
    dealership_id INT     NOT NULL,
    VIN           CHAR(17) NOT NULL,
    PRIMARY KEY (dealership_id, VIN),
    CONSTRAINT fk_inventory_dealership
        FOREIGN KEY (dealership_id)
        REFERENCES dealerships (dealership_id)
        ON DELETE CASCADE
        ON UPDATE CASCADE,
    CONSTRAINT fk_inventory_vehicle
        FOREIGN KEY (VIN)
        REFERENCES vehicles (VIN)
        ON DELETE CASCADE
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE sales_contracts (
    id              INT AUTO_INCREMENT PRIMARY KEY,
    VIN             CHAR(17)      NOT NULL,
    dealership_id   INT           NOT NULL,
    customer_name   VARCHAR(100)  NOT NULL,
    customer_phone  VARCHAR(20)   NULL,
    sale_price_eur  DECIMAL(10,2) NOT NULL,
    sale_date       DATE          NOT NULL,
    payment_type    VARCHAR(20)   NOT NULL,
    notes           VARCHAR(255)  NULL,
    CONSTRAINT fk_sales_vehicle
        FOREIGN KEY (VIN)
        REFERENCES vehicles (VIN)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT fk_sales_dealership
        FOREIGN KEY (dealership_id)
        REFERENCES dealerships (dealership_id)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE lease_contracts (
    id                  INT AUTO_INCREMENT PRIMARY KEY,
    VIN                 CHAR(17)      NOT NULL,
    dealership_id       INT           NOT NULL,
    lessee_name         VARCHAR(100)  NOT NULL,
    lease_start_date    DATE          NOT NULL,
    lease_end_date      DATE          NOT NULL,
    monthly_payment_eur DECIMAL(10,2) NOT NULL,
    mileage_limit_km    INT           NOT NULL,
    notes               VARCHAR(255)  NULL,
    CONSTRAINT fk_lease_vehicle
        FOREIGN KEY (VIN)
        REFERENCES vehicles (VIN)
        ON DELETE RESTRICT
        ON UPDATE CASCADE,
    CONSTRAINT fk_lease_dealership
        FOREIGN KEY (dealership_id)
        REFERENCES dealerships (dealership_id)
        ON DELETE RESTRICT
        ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


INSERT INTO dealerships (name, address, phone) VALUES
('Princess Cars',     '123 Sakura Street, Tokyo',  '010-1234567'),
('Maaikes Carshop',   '456 Blossom Ave, Osaka',   '020-7654321');


INSERT INTO vehicles (VIN, make, model, model_year, color, mileage_km, price_eur, sold) VALUES
('JTDBR32E720123456', 'Toyota',     'Corolla Hybrid', 2021, 'Red',       15000, 21000.00, 0),
('JH4KA8270MC012345', 'Honda',      'Civic',          2020, 'Blue',      23000, 19500.00, 1),
('JN1BZ34D34M012345', 'Nissan',     'Leaf',           2022, 'White',      8000, 26000.00, 0),
('JM1BPACL2M1234567', 'Mazda',      'Mazda3',         2019, 'Black',     34000, 17800.00, 1),
('JF1GTABC3M1234567', 'Subaru',     'Impreza',        2021, 'Silver',    12000, 22500.00, 0),
('JS2YB415695012345', 'Suzuki',     'Swift',          2018, 'Yellow',    41000, 11000.00, 0),
('JA4AD2A39HZ012345', 'Mitsubishi', 'Outlander PHEV', 2020, 'White',     27000, 28500.00, 1),
('JTHBK1EG0B2123456', 'Lexus',      'ES 300h',        2022, 'Dark Blue',  9000, 43000.00, 0);


INSERT INTO inventory (dealership_id, VIN) VALUES
(1, 'JTDBR32E720123456'),
(1, 'JN1BZ34D34M012345'),
(1, 'JF1GTABC3M1234567'),
(1, 'JA4AD2A39HZ012345'),

(2, 'JH4KA8270MC012345'),
(2, 'JM1BPACL2M1234567'),
(2, 'JS2YB415695012345'),
(2, 'JTHBK1EG0B2123456');


INSERT INTO sales_contracts
    (VIN, dealership_id, customer_name, customer_phone, sale_price_eur, sale_date, payment_type, notes)
VALUES
('JH4KA8270MC012345', 2, 'Yuki Tanaka',     '+31-6-11111111', 19000.00, '2024-03-15', 'Cash',    'Student discount applied.'),
('JM1BPACL2M1234567', 2, 'Kenji Nakamura',  '+31-6-22222222', 17500.00, '2024-05-02', 'Finance', '36-month financing.'),
('JA4AD2A39HZ012345', 1, 'Akira Sato',      '+31-6-33333333', 28000.00, '2024-06-21', 'Cash',    'Trade-in accepted.');


INSERT INTO lease_contracts
    (VIN, dealership_id, lessee_name, lease_start_date, lease_end_date,
     monthly_payment_eur, mileage_limit_km, notes)
VALUES
('JTDBR32E720123456', 1, 'Hana Suzuki',   '2024-01-01', '2027-01-01', 350.00, 45000, '36-month private lease.'),
('JTHBK1EG0B2123456', 2, 'Maaike van P.', '2024-09-01', '2028-09-01', 595.00, 80000, 'Business lease, maintenance included.');
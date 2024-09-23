-- Insert Categories First
INSERT INTO category (id, description, name)
VALUES
    (1, 'Electronics and gadgets', 'Electronics'),
    (2, 'Home and kitchen appliances', 'Home Appliances'),
    (3, 'Outdoor and fitness equipment', 'Sports & Outdoors'),
    (4, 'Books and stationary items', 'Books'),
    (5, 'Clothing and accessories', 'Fashion');

-- Insert Products
INSERT INTO product (id, description, name, available_quantity, price, category_id)
VALUES
    (nextval('product_seq'), 'Smartphone with 6GB RAM and 128GB storage', 'Smartphone', 100, 299.99, 1),  -- Electronics
    (nextval('product_seq'), 'LED 4K Ultra HD TV 55-inch', 'LED TV', 50, 499.99, 1),                      -- Electronics
    (nextval('product_seq'), 'Refrigerator with 300L capacity', 'Refrigerator', 20, 799.99, 2),            -- Home Appliances
    (nextval('product_seq'), 'Microwave oven with convection mode', 'Microwave', 30, 149.99, 2),           -- Home Appliances
    (nextval('product_seq'), 'Mountain bike with 21 gears', 'Mountain Bike', 10, 599.99, 3),               -- Sports & Outdoors
    (nextval('product_seq'), 'Treadmill with adjustable incline', 'Treadmill', 15, 899.99, 3),             -- Sports & Outdoors
    (nextval('product_seq'), 'Science fiction novel', 'Sci-Fi Book', 200, 14.99, 4),                       -- Books
    (nextval('product_seq'), 'Notebook with 200 pages', 'Notebook', 500, 3.49, 4),                         -- Books
    (nextval('product_seq'), 'Leather jacket', 'Leather Jacket', 25, 199.99, 5),                           -- Fashion
    (nextval('product_seq'), 'Running shoes for men', 'Running Shoes', 60, 79.99, 5);                      -- Fashion

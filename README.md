# automationTestStoreSelenium

The Selenium test suite (with positive/negative test cases) of the test web store

#Tech Requirements:

 1.Java JDK 8 or higher 
 
 2.Apache Maven 
 
 3.IntelliJ IDEA (or another IDE that supports Java and Maven)

#Setup

1. Clone this repository into IntelliJ(or other IDE) workspace folder (or wherever the project can be launched by IDE)
2. Open the IDE and open the project folder
3. Navigate to the pom.xml file and install all required dependencies for the test run
4. Run the test suite on the IDE

# Test list:

1.	// Test 001 -> user navigation to login/register page test
2.	// Test 002 -> valid user account creation test
3.	// Test 002a -> invalid user account creation test (no first name)
4.	// Test 002b -> invalid user account creation test (no last name)
5.	// Test 002c -> invalid user account creation test (no email address)
6.	// Test 002d -> invalid user account creation test (no user address)
7.	// Test 002e -> invalid user account creation test (no user city)
8.	// Test 002f -> invalid user account creation test (no user state selection)
9.	// Test 002g -> invalid user account creation test (no user country selection)
10.	// Test 002h -> invalid user account creation test (no login username)
11.	// Test 002i -> invalid user account creation test (no user password)
12.	// Test 002j -> invalid user account creation test (no confirm password)
13.	// Test 002k -> invalid user account creation test (no 'Agree to terms' checkbox click)
14.	// Test 002m -> invalid user account creation test (too long first name)
15.	// Test 002n -> invalid user account creation test (too long last name)
16.	// Test 002o -> invalid user account creation test (invalid email address format)
17.	// Test 002p -> invalid user account creation test (too short email address) (the user account gets created)
18.	// Test 002q -> invalid user account creation test (too long email address)
19.	// Test 002r -> invalid user account creation test (existing email address (in database))
20.	// Test 002s -> invalid user account creation test (too short user address)
21.	// Test 002t -> invalid user account creation test (too long user address)
22.	// Test 002u -> invalid user account creation test (too short user city)
23.	// Test 002v -> invalid user account creation test (too long user city)
24.	// Test 002w -> invalid user account creation test (too short zip code)
25.	// Test 002x -> invalid user account creation test (no zip code)
26.	// Test 002y -> invalid user account creation test (too long zip code)
27.	// Test 002z -> invalid user account creation test (too short login username)
28.	// Test 002aa -> invalid user account creation test (too long login username)
29.	// Test 002ab -> invalid user account creation test (too short user password)
30.	// Test 002ac -> invalid user account creation test (too long user password)
31.	// Test 002ad -> invalid user account creation test (existing login username)
32.	//Test 003 -> valid user account logout test
33.	//Test 004 -> valid user account login test
34.	//Test 004a -> invalid user account login test -> no username
35.	//Test 004b -> invalid user account login test -> no password
36.	//Test 004c -> invalid user account login test -> invalid username
37.	//Test 004d -> invalid user account login test -> invalid password
38.	// Test 005 -> add featured products to cart test (as a non-registered user)
39.	// Test 005a -> add latest products to cart test (as a non-registered user)
40.	// Test 005b -> add bestseller products to cart test (as a non-registered user)
41.	// Test 005c -> add special products to cart test (as a non-registered user)
42.	// Test 006 -> add featured products to check out test (as a non-registered user)
43.	// Test 006a -> add latest products to check out test (as a non-registered user)
44.	// Test 006b -> add bestseller products to check out test (as a non-registered user)
45.	// Test 006c -> add special products to check out test (as a non-registered user)
46.	// Test 007 -> add featured products to check out test (as a non-registered user) with valid guest account creation
47.	// Test 008 -> add latest products to check out test (as a non-registered user) with valid guest account creation
48.	// Test 009 -> add bestseller products to check out test (as a non-registered user) with valid guest account creation
49.	// Test 010 -> add special products to check out test (as a non-registered user) with valid guest account creation
50.	// Test 010a -> add special products to check out test (as a non-registered user) with invalid guest account creation (no first name)
51.	// Test 010b -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short first name)
52.	// Test 010c -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long first name)
53.	// Test 010d -> add special products to check out test (as a non-registered user) with invalid guest account creation (without last name)
54.	// Test 010e -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short last name)
55.	// Test 010f -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long last name)
56.	// Test 010g -> add special products to check out test (as a non-registered user) with invalid guest account creation (no email address)
57.	// Test 010h -> add special products to check out test (as a non-registered user) with invalid guest account creation (invalid email address format)
58.	// Test 010i -> add special products to check out test (as a non-registered user) with invalid guest account creation (existing email address)
59.	// Test 010j -> add special products to check out test (as a non-registered user) with invalid guest account creation (no address1)
60.	// Test 010k -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short address1)
61.	// Test 010l -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long address1)
62.	// Test 010m -> add special products to check out test (as a non-registered user) with invalid guest account creation (no city)
63.	// Test 010n -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short city)
64.	// Test 010o -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long city)
65.	// Test 010o -> add special products to check out test (as a non-registered user) with invalid guest account creation (no zip code)
66.	// Test 010p -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short zip code)
67.	// Test 010q -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long zip code)
68.	// Test 010r -> add special products to check out test (as a non-registered user) with invalid guest account creation (no country)
69.	// Test 010s -> add special products to check out test (as a non-registered user) with invalid guest account creation (no state)
70.	// Test 011 -> confirm featured products addition to check out test (as a non-registered user)
71.	// Test 011a -> verify featured products order is indeed placed (as a non-registered user)
72.	// Test 012 -> confirm latest products addition to check out test (as a non-registered user)
73.	// Test 012a -> verify latest products order is indeed placed (as a non-registered user)
74.	// Test 013 -> confirm bestseller products addition to check out test (as a non-registered user)
75.	// Test 013a ->  verify bestseller products order is indeed placed (as a non-registered user)
76.	// Test 014 -> confirm  special products addition to check out test (as a non-registered user)
77.	// Test 014a -> verify special products order is indeed placed (as a non-registered user)
78.	// Test 015 -> add Benefit (single brand) products to cart test (as a non-registered user)
79.	// Test 015a -> add Pantene (single brand) products to cart test (as a non-registered user)
80.	// Test 015b -> add Mac (single brand) products to cart test (as a non-registered user)
81.	// Test 015c -> add Lancome (single brand) products to cart test (as a non-registered user)
82.	// Test 015d -> add Gucci (single brand) products to cart test (as a non-registered user)
83.	// Test 015e -> add Giorgio Armani (single brand) products to cart test (as a non-registered user)
84.	// Test 015f -> add Dove (single brand) products to cart test (as a non-registered user)
85.	// Test 015g -> add Calvin Klein (single brand) products to cart test (as a non-registered user)
86.	// Test 015h -> add Bulgari (single brand) products to cart test (as a non-registered user)
87.	// Test 015i -> add Sephora (single brand) products to cart test (as a non-registered user)
88.	// Test 016 -> add Benefit (single brand) products to check out test (as a non-registered user)
89.	// Test 016a -> add Pantene (single brand) products to check out test (as a non-registered user)
90.	// Test 016b -> add Mac (single brand) products to check out test (as a non-registered user)
91.	// Test 016c -> add Lancome (single brand) products to check out test (as a non-registered user)
92.	// Test 016d -> add Gucci (single brand) products to check out test (as a non-registered user)
93.	// Test 016e -> add Giorgio Armani (single brand) products to check out test (as a non-registered user)
94.	// Test 016f -> add Dove (single brand) products to check out test (as a non-registered user)
95.	// Test 016g -> add Calvin Klein (single brand) products to check out test (as a non-registered user)
96.	// Test 016h -> add Bulgari (single brand) products to check out test (as a non-registered user)
97.	// Test 016i -> add Sephora (single brand) products to check out test (as a non-registered user)
98.	// Test 017 -> add apparel & accessories products (Shoes) to cart as a registered user
99.	// Test 017a -> add apparel & accessories products (men t-shirts) to cart as a registered user
100.	// Test 018 -> add makeup products (Cheeks) to cart as a registered user
101.	// Test 018a -> add makeup products (Eyes) to cart as a registered user
102.	// Test 018b -> add makeup products (Face) to cart as a registered user
103.	// Test 018c -> add makeup products (Lips) to cart as a registered user
104.	// Test 018d -> add makeup products (Nails) to cart as a registered user
105.	// Test 018e -> add makeup products (Value Sets) to cart as a registered user
106.	// Test 019 -> add skincare products (Eyes) to cart as a registered user
107.	// Test 019a -> add skincare products (Face) to cart as a registered user
108.	// Test 019b -> add skincare products (Gift Ideas & Sets) to cart as a registered user
109.	// Test 019c -> add skincare products (Hands & Nails) to cart as a registered user
110.	// Test 019d -> add skincare products (Sun) to cart as a registered user
111.	// Test 020 -> add fragrance products (Men) to cart as a registered user
112.	// Test 020a -> add fragrance products (Women) to cart as a registered user
113.	// Test 021 -> add men products (Body & Shower) to cart as a registered user
114.	// Test 021a -> add men products (Fragrance Sets) to cart as a registered user
115.	// Test 021b -> add men products (Pre Shave & Shaving) to cart as a registered user
116.	// Test 021c -> add men products (Skincare) to cart as a registered user
117.	// Test 022 -> add hair care products (Conditioners) to cart as a registered user
118.	// Test 022a -> add hair care products (Shampoo) to cart as a registered user
119.	// Test 023 -> add book products (Audio CD) to cart as a registered user
120.	// Test 023a -> add book products (Paperback) to cart as a registered user
121.	// Test 024 -> add apparel & accessories products (Shoes) to check out as a registered user
122.	// Test 024a -> add apparel & accessories products (men t-shirts) to check out as a registered user
123.	// Test 025 -> add makeup products (Cheeks) to check out as a registered user
124.	// Test 025a -> add makeup products (Eyes) to check out as a registered user
125.	// Test 025b -> add makeup products (Face) to check out as a registered user
126.	// Test 025c -> add makeup products (Lips) to check out as a registered user
127.	// Test 025d -> add makeup products (Nails) to check out as a registered user
128.	// Test 025e -> add makeup products (Value Sets) to check out as a registered user
129.	// Test 026 -> add skincare products (Eyes) to check out as a registered user
130.	// Test 026a -> add skincare products (Face) to check out as a registered user
131.	// Test 026b -> add skincare products (Gift Ideas & Sets) to check out as a registered user
132.	// Test 027 -> add fragrance products (Men) to check out as a registered user
133.	// Test 027a -> add fragrance products (Women) to check out as a registered user
134.	// Test 028 -> add men products (Fragrance Sets) to check out as a registered user
135.	// Test 028a -> add men products (Skincare) to check out as a registered user
136.	// Test 029 -> add hair care products (Conditioners) to check out as a registered user
137.	// Test 029a -> add hair care products (Shampoo) to check out as a registered user
138.	// Test 030 -> add book products (Paperback) to check out as a registered user



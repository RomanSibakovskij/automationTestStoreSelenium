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

// Test 001 -> user navigation to login/register page test
// Test 002 -> valid user account creation test
// Test 002a -> invalid user account creation test (no first name)
// Test 002b -> invalid user account creation test (no last name)
// Test 002c -> invalid user account creation test (no email address)
// Test 002d -> invalid user account creation test (no user address)
// Test 002e -> invalid user account creation test (no user city)
// Test 002f -> invalid user account creation test (no user state selection)
// Test 002g -> invalid user account creation test (no user country selection)
// Test 002h -> invalid user account creation test (no login username)
// Test 002i -> invalid user account creation test (no user password)
// Test 002j -> invalid user account creation test (no confirm password)
// Test 002k -> invalid user account creation test (no 'Agree to terms' checkbox click)
// Test 002m -> invalid user account creation test (too long first name)
// Test 002n -> invalid user account creation test (too long last name)
// Test 002o -> invalid user account creation test (invalid email address format)
// Test 002p -> invalid user account creation test (too short email address) (the user account gets created)
// Test 002q -> invalid user account creation test (too long email address)
// Test 002r -> invalid user account creation test (existing email address (in database))
// Test 002s -> invalid user account creation test (too short user address)
// Test 002t -> invalid user account creation test (too long user address)
// Test 002u -> invalid user account creation test (too short user city)
// Test 002v -> invalid user account creation test (too long user city)
// Test 002w -> invalid user account creation test (too short zip code)
// Test 002x -> invalid user account creation test (no zip code)
// Test 002y -> invalid user account creation test (too long zip code)
// Test 002z -> invalid user account creation test (too short login username)
// Test 002aa -> invalid user account creation test (too long login username)
// Test 002ab -> invalid user account creation test (too short user password)
// Test 002ac -> invalid user account creation test (too long user password)
// Test 002ad -> invalid user account creation test (existing login username)
//Test 003 -> valid user account logout test
//Test 004 -> valid user account login test
//Test 004a -> invalid user account login test -> no username
//Test 004b -> invalid user account login test -> no password
//Test 004c -> invalid user account login test -> invalid username
//Test 004d -> invalid user account login test -> invalid password
// Test 005 -> add featured products to cart test (as a non-registered user)
// Test 005a -> add latest products to cart test (as a non-registered user)
// Test 005b -> add bestseller products to cart test (as a non-registered user)
// Test 005c -> add special products to cart test (as a non-registered user)
// Test 006 -> add featured products to check out test (as a non-registered user)
// Test 006a -> add latest products to check out test (as a non-registered user)
// Test 006b -> add bestseller products to check out test (as a non-registered user)
// Test 006c -> add special products to check out test (as a non-registered user)
// Test 007 -> add featured products to check out test (as a non-registered user) with valid guest account creation
// Test 008 -> add latest products to check out test (as a non-registered user) with valid guest account creation
// Test 009 -> add bestseller products to check out test (as a non-registered user) with valid guest account creation
// Test 010 -> add special products to check out test (as a non-registered user) with valid guest account creation
// Test 010a -> add special products to check out test (as a non-registered user) with invalid guest account creation (no first name)
// Test 010b -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short first name)
// Test 010c -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long first name)
// Test 010d -> add special products to check out test (as a non-registered user) with invalid guest account creation (without last name)
// Test 010e -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short last name)
// Test 010f -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long last name)
// Test 010g -> add special products to check out test (as a non-registered user) with invalid guest account creation (no email address)
// Test 010h -> add special products to check out test (as a non-registered user) with invalid guest account creation (invalid email address format)
// Test 010i -> add special products to check out test (as a non-registered user) with invalid guest account creation (existing email address) (The checkout is being complete)
// Test 010j -> add special products to check out test (as a non-registered user) with invalid guest account creation (no address1)
// Test 010k -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short address1)
// Test 010l -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long address1)
// Test 010m -> add special products to check out test (as a non-registered user) with invalid guest account creation (no city)
// Test 010n -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short city)
// Test 010o -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long city)
// Test 010o -> add special products to check out test (as a non-registered user) with invalid guest account creation (no zip code)
// Test 010p -> add special products to check out test (as a non-registered user) with invalid guest account creation (too short zip code)
// Test 010q -> add special products to check out test (as a non-registered user) with invalid guest account creation (too long zip code)
// Test 010r -> add special products to check out test (as a non-registered user) with invalid guest account creation (no country)
// Test 010s -> add special products to check out test (as a non-registered user) with invalid guest account creation (no state)
// Test 011 -> confirm featured products addition to check out test (as a non-registered user)
// Test 011a -> verify featured products order is indeed placed (as a non-registered user)
// Test 012 -> confirm latest products addition to check out test (as a non-registered user)
// Test 012a -> verify latest products order is indeed placed (as a non-registered user)
// Test 013 -> confirm bestseller products addition to check out test (as a non-registered user)
// Test 013a ->  verify bestseller products order is indeed placed (as a non-registered user)
// Test 014 -> confirm  special products addition to check out test (as a non-registered user)
// Test 014a -> verify special products order is indeed placed (as a non-registered user)
// Test 015 -> add Benefit (single brand) products to cart test (as a non-registered user)
// Test 015a -> add Pantene (single brand) products to cart test (as a non-registered user)
// Test 015b -> add Mac (single brand) products to cart test (as a non-registered user)
// Test 015c -> add Lancome (single brand) products to cart test (as a non-registered user)
// Test 015d -> add Gucci (single brand) products to cart test (as a non-registered user)
// Test 015e -> add Giorgio Armani (single brand) products to cart test (as a non-registered user)
// Test 015f -> add Dove (single brand) products to cart test (as a non-registered user)
// Test 015g -> add Calvin Klein (single brand) products to cart test (as a non-registered user)
// Test 015h -> add Bulgari (single brand) products to cart test (as a non-registered user)
// Test 015i -> add Sephora (single brand) products to cart test (as a non-registered user)
// Test 016 -> add Benefit (single brand) products to check out test (as a non-registered user)
// Test 016a -> add Pantene (single brand) products to check out test (as a non-registered user)
// Test 016b -> add Mac (single brand) products to check out test (as a non-registered user)
// Test 016c -> add Lancome (single brand) products to check out test (as a non-registered user)
// Test 016d -> add Gucci (single brand) products to check out test (as a non-registered user)
// Test 016e -> add Giorgio Armani (single brand) products to check out test (as a non-registered user)
// Test 016f -> add Dove (single brand) products to check out test (as a non-registered user)
// Test 016g -> add Calvin Klein (single brand) products to check out test (as a non-registered user)
// Test 016h -> add Bulgari (single brand) products to check out test (as a non-registered user)
// Test 016i -> add Sephora (single brand) products to check out test (as a non-registered user)
// Test 017 -> add apparel & accessories products (Shoes) to cart as a registered user
// Test 017a -> add apparel & accessories products (men t-shirts) to cart as a registered user
// Test 018 -> add makeup products (Cheeks) to cart as a registered user
// Test 018a -> add makeup products (Eyes) to cart as a registered user
// Test 018b -> add makeup products (Face) to cart as a registered user
// Test 018c -> add makeup products (Lips) to cart as a registered user
// Test 018d -> add makeup products (Nails) to cart as a registered user
// Test 018e -> add makeup products (Value Sets) to cart as a registered user
// Test 019 -> add skincare products (Eyes) to cart as a registered user
// Test 019a -> add skincare products (Face) to cart as a registered user
// Test 019b -> add skincare products (Gift Ideas & Sets) to cart as a registered user
// Test 019c -> add skincare products (Hands & Nails) to cart as a registered user
// Test 019d -> add skincare products (Sun) to cart as a registered user
// Test 020 -> add fragrance products (Men) to cart as a registered user
// Test 020a -> add fragrance products (Women) to cart as a registered user
// Test 021 -> add men products (Body & Shower) to cart as a registered user
// Test 021a -> add men products (Fragrance Sets) to cart as a registered user
// Test 021b -> add men products (Pre Shave & Shaving) to cart as a registered user
// Test 021c -> add men products (Skincare) to cart as a registered user
// Test 022 -> add hair care products (Conditioners) to cart as a registered user
// Test 022a -> add hair care products (Shampoo) to cart as a registered user
// Test 023 -> add book products (Audio CD) to cart as a registered user
// Test 023a -> add book products (Paperback) to cart as a registered user
// Test 024 -> add apparel & accessories products (Shoes) to check out as a registered user
// Test 024a -> add apparel & accessories products (men t-shirts) to check out as a registered user
// Test 025 -> add makeup products (Cheeks) to check out as a registered user
// Test 025a -> add makeup products (Eyes) to check out as a registered user
// Test 025b -> add makeup products (Face) to check out as a registered user
// Test 025c -> add makeup products (Lips) to check out as a registered user
// Test 025d -> add makeup products (Nails) to check out as a registered user
// Test 025e -> add makeup products (Value Sets) to check out as a registered user
// Test 026 -> add skincare products (Eyes) to check out as a registered user
// Test 026a -> add skincare products (Face) to check out as a registered user
// Test 026b -> add skincare products (Gift Ideas & Sets) to check out as a registered user
// Test 027 -> add fragrance products (Men) to check out as a registered user
// Test 027a -> add fragrance products (Women) to check out as a registered user
// Test 028 -> add men products (Fragrance Sets) to check out as a registered user
// Test 028a -> add men products (Skincare) to check out as a registered user
// Test 029 -> add hair care products (Conditioners) to check out as a registered user
// Test 029a -> add hair care products (Shampoo) to check out as a registered user
// Test 030 -> add book products (Paperback) to check out as a registered user


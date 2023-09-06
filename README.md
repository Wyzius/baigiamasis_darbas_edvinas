## "Skonis ir Kvapas" Automation test
### Link to page: [www.skonis-kvapas.lt](skonis-kvapas.lt)
 
#### 1. Try to create account with preexisting account
* Under Login press create new account
* Input Name
* Input Last name
* Input e.mail
* Input password
* Click on checkbox terms and conditions
* Press button save
> Expected result: This e.mail is already in use.

#### 2. Log in with valid account
* Input email
* Input password
* Click on button login
> Expected result: Able to see at main page "My Account".

#### 3. Changing account first and last names
* Log in
* Go to my account 
* Go to information
* Input new first name 
* Input new last name
* Input password
* Click on checkbox terms and conditions 
> Expected result: Information is updated.

#### 4. Search item
* Click on Search box
* Input item name
* Click On search button
> Expected Result: Find named items.

#### 5. Add tea to cart
* Select wanted tea.
* From item pages click add to cart
* Select go to payment
> Expected result: Able to see same item in cart
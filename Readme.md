For spring boot project
we can start with spring initializr
create your project and add dependencies you want for your project

Dependencies I added are:

* spring boot dev tools
* spring boot starter data jpa -> Entity
* postgresql
* lombok -> getter, setter
* spring boot starter data jdbc -> jdbc , postgres connection
* spring boot starter web

Things to remember with some example:

1.Entity/Model:
* Table name
* Columns

2. DAO/Repository:
* Repository extends JpaRepository
* Custom Query
  * findAllById(Integer Id)

3. DTO:
* Transferring object from one layer to another
  * Like setting value for the user in userService and using it in another service or layer

4.Controller/Api:
* RestController
* GetMapping
  * mapping name
  * calling the service function
  * return the response with DTO type

5.Service:
* getNameById(Id)
  * calling repository findById(Id)
  * getting username from above response
  * setting the username to the DTO
  * sending to controller


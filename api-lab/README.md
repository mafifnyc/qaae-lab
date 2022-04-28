# API Lab

## Overview
Let's Work With Postman and learn API. Postman is REST API Client. We will use this tool to learn more about API, Create API calls and validate the API responses manually and programmatically.

1. Use this document to [Send your first request](https://learning.postman.com/docs/getting-started/sending-the-first-request/) using postman.
    *  Can you tell us in your own word what just happened after making your first request?
2. [Create your first collection](https://learning.postman.com/docs/getting-started/creating-the-first-collection/), Collection Name: api-lab
    * Save your request from step 1 in  collection. 
    * Save all your request in this collection
3. Building a request requires many components. Please read every paragraph in this document and learn every component by implementing in your postman. [Building  Requests](https://learning.postman.com/docs/sending-requests/requests/).
This task will take sometime. Once you are done with this rest of the task will be very easy. Fasten Your Seat Belt and Keep moving. Enjoy the ride and joy of doing practical things!!!

## Make API calls using the following URIs and record the status code and response body for each API call (You will write the answer after every  question and any screen  capture in this document)
1. Get authentication token using URI: `https://postman-echo.com/basic-auth`
   <br/>Question:
   * How did you get the response?
   * Answer: 401 Unauthorized
2. Get information about all users using URI: `https://reqres.in/api/users`
   <br/>Question:
   * How many lists can you see in the response body?
   * Answer: 1

3. Get information about the user with id 3 using URI: `https://reqres.in/api/users/3`
   <br/>Question:
   * How many lists can you see in the response body?
   * Answer: 0
   * What are the available property(Key) names in the response body?
   * Answer:data, id, email, first_name, last_name, avatar, support, url, text.
4. Delete the User with id 9 using URI `https://reqres.in/api/users/9`
   <br/>Question:
   * What is the response?
   * Answer: 204 No Content
   * How many users are now on the users list? `https://reqres.in/api/users`
   * Answer: 12
   * Can you see the deleted user record?
   * Answer: No
5. Get information of the user with id 40 using URI: `https://reqres.in/api/users/40`
   <br/>Question:
   * How many lists can you see in the response body?
   * Answer: 0
   * What are the available property(Key) names in the response body?
   * Null
6. Create a new user in a system using
   `URI: https://reqres.in/api/users
   Verb: POST
   Request Body:`
```json
        { 
          "name": "yourname",  
          "job": "dreamjob"
        }
```
![img.png](img.png)

<br/>Question:
* What is the response code?
* Answer: 201 Created
* What are the available property(Key) names in the response body?
* Answer: id, createdAt
* What is the value of response Header  Etag?
* Answer: W/"33-m5otTxQVyBvFT4MtIcMOJ7AJ2Ps"

7. Sign in to the system using URI: `https://reqres.in/api/login` and  {"email": "peter@klaven"}
   <br/>Question:
   * What is the response code?
   * Answer: 200 OK
8. Sign in to the system using URI: `https://reqres.in/api/login` and
   ```json
   {
       "email": "eve.holt@reqres.in",
       "password": "cityslicka"
   }
   ```
   <br/>Question:
   * What is the value of response Header  Etag?
   * Answer: W/"2c1-N6Rqerxquq2kgQhL51EiSg4x0R8"
   * What is the response?
   * Answer: 200 OK
9. Get information about all planets using URI: `https://swapi.dev/api/planets`. Carefully observe the response body and make a list of all attributes and write their data types.

   Answer: 
   <br/>Question: Count -> Integer, 
                  next -> String, 
                  previous -> null, 
                  results -> array, 
                  name -> String, 
                  rotation_period -> String, 
                  orbital_period -> String, 
                  diameter -> String, 
                  climate -> String, 
                  gravity -> String, 
                  terrain -> String, 
                  surface_water -> String, 
                  population -> String, 
                  residents -> array, 
                  films -> array, 
                  created -> String, 
                  edited -> String, 
                  url -> String
   * How many lists can you see in the response body?
   * Answer: 21
10. Get information about the third planet using URI: `https://swapi.dev/api/planets/3/`
   <br/>Question:
     * How many properties you can see in response body?
     * Answer: 14
11. Get information about all the starships using URI: `https://swapi.dev/api/starships`. Carefully observe the response body and make a list of all attributes and write their data types.

    * Answer: Count -> Integer, 
              next -> String, 
              previous -> null, 
              results -> array,
              name -> String,
              model -> String,
              menufacturer -> String,
              const_in_credits -> String,
              length -> String,
              max_atmophering_speed -> String,
              crew -> String,
              passengers -> String,
              cargo_capacity -> String,
              consumables -> String,
              hyperdriver_rating -> String,
              MGLT -> String,
              starship_class -> String,
              pilots -> array,
              films -> array,
              created -> String,
              edited -> String,
              url -> String
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 3
12. Get information about the ninth starship using URI: `https://swapi.dev/api/starships/9/`
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 2
13. Get information about all films using URI: `https://swapi.dev/api/films`. Carefully observe the response body and make a list of all attributes and write their data types.

    * Answer: count -> integer
              next -> null
              previous -> null
              results -> array
              title -> String
              episode_id -> integer
              opening_crawl -> String
              director -> String
              producer -> String
              release_date -> String
              characters -> Array
              planets -> Array
              starships -> Array
              vehicles -> Array
              species -> Array
              created -> String
              edited -> String
              url -> String
              
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 31
14. Get information about the third planet using URI: `https://swapi.dev/api/species`
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 21
15. Get all booking ids using URI: `https://restful-booker.herokuapp.com/booking`
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 1
16. Get details about booking id 23 using URI: `https://restful-booker.herokuapp.com/booking/23`
    <br/>Question:
    * What is the response?
    * Answer: 200 OK
17. Get details about booking id 3 using URI: `https://restful-booker.herokuapp.com/booking/3`
    <br/>Question:
    * What is the response?
    * Answer: 200 OK
18. Get information about all planets using URI: `https://jsonplaceholder.typicode.com/users`
    <br/>Question:
    * What is the response?
    * Answer: 200 OK
    * How many lists can you see in the response body?
    * Answer: 1
19. Get information about all species using URI: `https://swapi.dev/api/species`. Carefully observe the response body and make a list of all attributes and write their data types.

    * Answer: count -> integer
              next -> String
              previous -> null
              results -> array
              name -> String
              classification -> String
              designation -> String
              average_height -> String
              skin_colors -> String
              hair_colors -> String
              eye_colors -> String
              average_lifespan -> String
              homeworld -> String
              language -> String
              people -> Array
              films -> Array
              created -> String
              edited -> String
              url -> String
              
 
    <br/>Question:
    * How many lists can you see in the response body?
    * Answer: 21
    * What is the response?
    * Answer: 200 OK
20. Write JSON path for following JSON file:
```json
        {
   "studio": {
      "movie": [
         {
            "category": "history",
            "director": "John",
            "title": "History",
            "rating": 6.60
         },
         {
            "category": "comedy",
            "director": "Paul",
            "title": "Laugh",
            "rating": 4.00
         },
         {
            "category": "fiction",
            "director": "Jack",
            "title": "Wake",
            "isbn": "87877676879",
            "rating": 8.01
         },
         {
            "category": "drama",
            "director": "Edward",
            "title": "Wuthering Heights",
            "isbn": "8754543578",
            "rating": 4.50
         }
      ],
      "music": {
         "song": "pale",
         "rate": 5.4
      }
   },
   "ranking": 20
}
```
    a. To retrieve all direct properties of the studio object
    b. To find out the music’s song
    Answer: $.studio.music.song
    c. To find the rating of all items in the studio
    Answer: $.studio.movie.[*].rating
    d. To retrieve information on all movies
    Answer: $.studio.movie
    e. To find out the titles of all movies
    Answer: $.studio.movie.[*].title
    f. To retrieve the titles of all movies by Jack
    Answer: $..movie[?(@.director == "Jack")]
    g. To retrieve the category of the last movie
    Answer: $..movie[-1:].category
    i. To retrieve all movies that have the isbn property
    Answer: $..movie[?(@.isbn)]
21. Get information about all employess using URI: `http://dummy.restapiexample.com/api/v1/employees`
    <br/>Question:
    * Answer: Bad Gateway 502, nothing shows up.  
    * How many lists can you see in the response body?
    * What is the response?
    * What are the available property(Key) names in the response body?
    * Make a list of all attributes and write the data types.
22. Get a single employee data using URI: `http://dummy.restapiexample.com/api/v1/employee/3`
    <br/>Question:
    * How many data you can see in response body?
    * Answer: 8
    * What is the response status?
    * Answer: 200 OK
23.Create a new employee in a system by using
      `URI: http://dummy.restapiexample.com/api/v1/create
      Verb: POST
      Request Body:`
```json
        {
            "name":"your name",
            "salary":"123",
            "age":"23"
        }
```
<br/>Question:
* What is the response?
* Answer: 405 Method Not Allowed
* can you see "id" property  in the response? if Yes, note the "id" value.
* Answer: no
24. Delete an employee record whose employee id in 2 by using URI `http://dummy.restapiexample.com/api/v1/delete/2`
<br/>Question:
    * What is the response?
    * Answer: 200 OK
    * How many employees are now in the employees list? `http://dummy.restapiexample.com/api/v1/employees`
    * Answer: 404 Not Found
    * Can you see the deleted employee record?
    * Answer: NA
25. Register a user by using      
    `URI: https://reqres.in/api/register
    Verb: POST
    Request Body:`
```json
        {
        "email": "john.jack@example.com",
        "password": "@izaanSchool"
          }
```
   <br/>Question:
   * What is the response?
   * Answer: 201 Created
   * What are the available property(Key) names in the response body?
   * Answer: id, createdAt
   26. Get an user Using URL `https://reqres.in/api/unknown/2` 
<br/> Question:
    * What is the response?
    * Answer: 200 OK
27. A simple health check endpoint to confirm whether the API is up and running using `https://restful-booker.herokuapp.com/ping`
    <br/>Question:
    * What is the response?
    * Answer: 201 Created
28. Get information using Delayed Response using URI: `https://reqres.in/api/users?delay=3`
  <br/>Question:
    * What is the response?
    * Answer: 200 OK
    * How many seconds delay to respond?
    * Answer: 3.26s
29. Get information about vehicles using URL `https://swapi.dev/api/vehicles/schema/`
<br/>Question:
    * What type of response it is?
    * Answer: Not Found
    * What is response status code?
    * Answer: 404
30. Get information about starships using URL `https://swapi.dev/api/starships/schema/`
    <br/>Question:
    * What type of response it is?
    * Answer: 404 Not Found
    * Write down the response status code.
    * Answer: 404
    * What are the available property(Key) names in the response body?
    * Answer: NA
    
31. Let's try something interesting. Can we remember bash script? Choose any 5 GET API. Use one bash script to make call and save the response in 5 different json file. If you can't achieve it that's fine. This is for fun.Example `curl www.google.com >> response1.json`

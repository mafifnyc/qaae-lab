# API Lab

## Make API calls using the following URIs and record the status code and response body for each API call (You will write the answer after every  question and any screen  capture in this document)
1. 
2. Get information about all users using URI: `https://reqres.in/api/users`
   
Question:
   * How many list you can see in response body?

3. Get information about the user with id 3 using URI: `https://reqres.in/api/users/3`
4. Get information of the user with id 40 using URI: `https://reqres.in/api/users/40`
5.  Create a new user in a system using
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

Question:
* What is the response code?
* What are the available property(Key) name in the response body?
* What is the value of response Header  Etag?

6. Sign in to the system using URI: https://reqres.in/api/login and  {"email": "peter@klaven"}

7. Sign in to the system using URI: `https://reqres.in/api/login` and 
   ```json
   {
       "email": "eve.holt@reqres.in",
       "password": "cityslicka"
   }
   ```
8. Get information about all planets using URI: `https://swapi.dev/api/planets`. Carefully observe the response body and make a list of all attributes and write their data types.

9. Get information about the third planet using URI: `https://swapi.dev/api/planets/3/`

10. Get information about all the starships using URI: `https://swapi.dev/api/starships`. Carefully observe the response body and make a list of all attributes and write their data types.

11. Get information about the ninth starship using URI: `https://swapi.dev/api/starships/9/`

12. Get information about all films using URI: `https://swapi.dev/api/films`. Carefully observe the response body and make a list of all attributes and write their data types.

13. Get information about the third planet using URI: `https://swapi.dev/api/species`

14. Get all booking ids using URI: `https://restful-booker.herokuapp.com/booking`

15. Get details about booking id 23 using URI: `https://restful-booker.herokuapp.com/booking/23`

16. Get details about booking id 3 using URI: `https://restful-booker.herokuapp.com/booking/3`

17. Get authentication token using URI: `https://postman-echo.com/basic-auth`

18. Write JSON path for following JSON file:
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
    c. To find the rating of all items in the studio
    d. To retrieve information on all movies
    e. To find out the titles of all movies
    f. To retrieve the titles of all movies by Jack
    g. To retrieve the category of the last movie
    i. To retrieve all movies that have the isbn property
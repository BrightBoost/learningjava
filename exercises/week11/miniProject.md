
# Sakila Actor & Film API – Extended Assignment (JDBC Only)

You already have a Spring Boot Web API that connects to the **Sakila** database using **manual JDBC (no Spring Data JPA!)** and supports:

* `GET /actors`
* `GET /actors/{id}`
* `POST /actors`
* `PUT /actors/{id}`
* `DELETE /actors/{id}`

Now you’ll **extend** this API with **search endpoints, a second resource (Film), and some bonus improvements.**

---

## Part 1 – Finish & Polish the Actor Resource (Core)

1. **Make sure CRUD for Actor is complete**

   For `/actors`:

    * `GET /actors` → returns a list of all actors
    * `GET /actors/{id}` → returns one actor or **404** if not found
    * `POST /actors` → creates a new actor
    * `PUT /actors/{id}` → updates an existing actor, or returns **404** if the actor doesn’t exist
    * `DELETE /actors/{id}` → deletes an actor, returns **204 No Content** (or 404 if not found)

   **Technical requirements:**

    * Use **PreparedStatement** for all SQL queries.
    * Map **ResultSet → Actor** manually (no ORM).
    * Handle SQL exceptions and convert them to meaningful HTTP responses.

---

## Part 2 – Custom Searches for Actors (Core + Bonus)

Add **search endpoints** for actors. All of these must use **manual JDBC**.

### 2.1 Search by last name (Core)

**Endpoint:**

```http
GET /actors/search/by-lastname?lastName=CRU
```

**Requirements:**

* Returns all actors where `last_name` **contains** the given value (e.g., `%CRU%`, case-insensitive if possible).
* If there are no matches → return an empty list (not an error).

---

### 2.2 Combined search on first and last name (Core)

**Endpoint:**

```http
GET /actors/search?firstName=ED&lastName=CHASE
```

**Requirements:**

* Both parameters are optional.
* If only `firstName` is present → filter on first name.
* If only `lastName` is present → filter on last name.
* If both are present → filter on both.

Examples:

* `/actors/search?firstName=ED`
* `/actors/search?lastName=CHASE`
* `/actors/search?firstName=ED&lastName=CHASE`

---

### 2.3 Pagination for actors (Bonus)

**Endpoint:**

```http
GET /actors?limit=20&offset=40
```

**Requirements:**

* Support two optional query parameters:

    * `limit` – how many actors to return (default: 20)
    * `offset` – how many records to skip (default: 0)
* If the client sends weird values (negative numbers, very large limit), return **400 Bad Request** with a short error message.

---

### 2.4 Actors sorted alphabetically (Bonus)

Extend `GET /actors` to support sorting:

```http
GET /actors?sortBy=lastName&direction=asc
```

**Requirements:**

* `sortBy` can be `firstName` or `lastName`
* `direction` can be `asc` or `desc`
* If invalid values are passed → return **400 Bad Request**

**Important:** build your SQL carefully and **do not directly concatenate unvalidated input** into the ORDER BY clause (avoid SQL injection).

---

## Part 3 – Add a Second Resource: Film (Core)

Now choose a second resource. **Recommended: `Film`**.

### 3.1 Design your Film model (Core)

Create a `Film` class with at least:

* `filmId` (int)
* `title` (String)
* `description` (String)
* `releaseYear` (int)
* `languageId` (int)
* `length` (int)
* `rating` (String)

You may add more fields if you like, but keep it manageable.

---

### 3.2 Implement Film CRUD with JDBC (Core)

Create endpoints:

* `GET /films` – list all films (you may already limit to first 100)
* `GET /films/{id}` – get details of one film
* `POST /films` – insert a new film
* `PUT /films/{id}` – update an existing film
* `DELETE /films/{id}` – delete a film (if allowed by FK constraints)

**Technical requirements:**

* Implement a `FilmDao` or similar class with methods like `findAll`, `findById`, `insert`, `update`, `delete`.
* Use **PreparedStatement** everywhere.
* Use **try-with-resources** for connections, statements, and result sets.

---

## Part 4 – Custom Searches for Films (Core + Bonus)

### 4.1 Search films by title (Core)

**Endpoint:**

```http
GET /films/search/by-title?title=ACADEMY
```

**Requirements:**

* Returns all films where title contains the given string (`%ACADEMY%`).
* Case-insensitive if possible.

---

### 4.2 Filter films by length and rating (Core)

**Endpoint:**

```http
GET /films/search/filter?minLength=60&maxLength=120&rating=PG
```

**Requirements:**

* All parameters are optional.

    * `minLength` – minimum length (in minutes)
    * `maxLength` – maximum length
    * `rating` – exact rating (e.g., `G`, `PG`, `PG-13`, `R`)
* If no parameters are provided → return **400 Bad Request** and explain that at least one filter must be specified.

---

### 4.3 Films by actor (Bonus – joins!)

**Endpoint:**

```http
GET /actors/{actorId}/films
```

**Requirements:**

* Return all films that the given actor has played in.
* You’ll need to join:

    * `actor`
    * `film_actor`
    * `film`
* If the actor does not exist → return **404 Not Found**.

---

### 4.4 Top N shortest or longest films (Bonus)

**Endpoint:**

```http
GET /films/top?order=longest&limit=10
```

**Requirements:**

* `order` can be `shortest` or `longest`
* `limit` = how many films to return
* Sort by `length`.

---

## Part 5 – Independent Research Bonus Challenges

These are **extra** but will seriously level up your API.

### 5.1 Proper HTTP status codes & error messages (Bonus)

* Return **404 Not Found** when a record doesn’t exist (actor/film).
* Return **400 Bad Request** when:

    * Required query parameter is missing.
    * A parameter has an invalid value (e.g., negative limit).

---

### 5.2 Basic validation (Bonus)

Before hitting the database, validate incoming DTOs:

* `Actor`:

    * `firstName` and `lastName` may not be empty.
* `Film`:

    * `title` may not be empty.
    * `length` must be positive.
    * `rating` must be one of the allowed values.

If validation fails → return **400** with a simple error message.

---

### 5.3 Global exception handling (Bonus+)

Create a `@ControllerAdvice` with an `@ExceptionHandler` to:

* Catch SQL exceptions and return a nice **500 Internal Server Error** JSON message.
* Catch your own custom exceptions (e.g., `NotFoundException`) and return **404**.

---

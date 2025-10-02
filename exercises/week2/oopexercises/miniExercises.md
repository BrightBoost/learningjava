# 1) TextMessage 📱

**Goal:** Model a simple SMS.

### Build the class `TextMessage`

1. **Package & imports**

    * Package: `com.pluralsight.week2.oop`
    * Import: `import java.time.LocalDate;`
   
2. **Class & fields**

    * Class name: `TextMessage`
    * Private fields:

        * `String senderNumber`
        * `String receiverNumber`
        * `String body`
        * `LocalDate sentOn`
      
3. **Constructors**

    * No-args constructor.
    * All-args constructor with parameters for all fields.
4. **Getters/Setters** for each field.
5. **Behavior**

    * Method `public void display()` printing:

      ```
      [sentOn] SMS from <senderNumber> to <receiverNumber>: <body>
      ```
6. **Validation (tiny)**

    * In `setBody`, if `body` is `null` or empty (`length() == 0`), set it to `"--empty--"`.

### Use it (in `TextMessageApp.main`)

1. Create an empty `TextMessage`, then call setters:

    * sender `"+31611111111"`
    * receiver `"+31622222222"`
    * body `"On my way!"`
    * sentOn `LocalDate.now()`
2. Call `display()`.
3. Create a second `TextMessage` using the all-args constructor with different values and `LocalDate.now()`.
4. Call `display()` again.

---

# 2) Appointment 🗓️ 

**Goal:** Represent a calendar appointment.

### Build the class `Appointment`

1. **Fields**

    * `String title`
    * `String organizer`
    * `String attendee`
    * `LocalDate date`
    * `String location`
2. **Constructors**

    * No-args.
    * All-args.
3. **Getters/Setters** for all.
4. **Behavior**

    * `public void printDetails()` →

      ```
      <title> on <date> at <location> (organizer: <organizer>, attendee: <attendee>)
      ```
5. **Tiny rule**

    * In `setLocation`, if `location` is `null` or blank, set to `"TBD"`.

### Use it (`AppointmentApp.main`)

1. Make an empty `Appointment`, set all fields, then `printDetails()`.
2. Make another with all-args constructor and `printDetails()`.

---

# 3) SupportTicket 🎫 

**Goal:** Track a helpdesk ticket.

### Build the class `SupportTicket`

1. **Fields**

    * `String reporter`
    * `String assignee`
    * `String subject`
    * `String description`
    * `LocalDate createdOn`
    * `String status` (allowed: `"OPEN"`, `"IN_PROGRESS"`, `"RESOLVED"`)
2. **Constructors**

    * No-args.
    * All-args.
3. **Getters/Setters**

    * In `setStatus`, if not one of the allowed values, set to `"OPEN"`.
4. **Behavior**

    * `public void printSummary()`:

      ```
      [<createdOn>] <subject> — <status> (reported by <reporter>, assigned to <assignee>)
      ```

### Use it (`SupportTicketApp.main`)

1. Create with no-args, set fields, call `printSummary()`.
2. Create with all-args (status `"IN_PROGRESS"`), call `printSummary()`.
3. Change status to `"RESOLVED"` and print again.

---

# 4) ProductReview ⭐ 

**Goal:** Store a simple product review.

### Build the class `ProductReview`

1. **Fields**

    * `String productName`
    * `String reviewer`
    * `int rating` (1–5)
    * `String comment`
    * `LocalDate reviewDate`
2. **Constructors**

    * No-args.
    * All-args.
3. **Getters/Setters**

    * In `setRating`, if rating < 1 set to 1; if > 5 set to 5.
4. **Behavior**

    * `public void show()`:

      ```
      <productName> rated <rating>/5 by <reviewer> on <reviewDate>: <comment>
      ```

### Use it (`ProductReviewApp.main`)

1. Create via setters; call `show()`.
2. Create via all-args; call `show()`.

---

# 5) PackageShipment 📦

**Goal:** Track a package shipment.

### Build the class `PackageShipment`

1. **Fields**

    * `String senderName`
    * `String receiverName`
    * `String trackingNumber`
    * `String carrier` (e.g., `"DHL"`, `"UPS"`, `"PostNL"`)
    * `LocalDate shipDate`
    * `String status` (e.g., `"CREATED"`, `"IN_TRANSIT"`, `"DELIVERED"`)
2. **Constructors**

    * No-args.
    * All-args.
3. **Getters/Setters**

    * In `setStatus`, if value is `null` or empty, set `"CREATED"`.
4. **Behavior**

    * `public void printTracking()`:

      ```
      <carrier> <trackingNumber> — <status> (from <senderName> to <receiverName> on <shipDate>)
      ```

### Use it (`PackageShipmentApp.main`)

1. Create one via setters; call `printTracking()`.
2. Create one via all-args; call `printTracking()`.
3. Update status to `"DELIVERED"` and print again.

---

## Next 10 exercises (concise specs)

> Use only what you know: classes, constructors, getters/setters, `if`/`switch`, String methods, primitives, `LocalDate`. **No loops or arrays.** Each should have a tiny “behavior” method to call in `main`.

### 6) PasswordResetRequest 🔐

* **Fields:** `String userEmail`, `String token`, `LocalDate requestedOn`, `boolean used`.
* **Rules:** In `setUserEmail`, ensure it contains `"@"`; if not, set `"invalid@example.com"`.
* **Behavior:** `printInfo()` →
  `Password reset for <userEmail> on <requestedOn> (used: <used>)`.

### 7) TemperatureAlert 🌡️

* **Fields:** `String location`, `double celsius`, `LocalDate measuredOn`.
* **Behavior:** `severityLabel()` returns `"LOW"` if `< 0`, `"NORMAL"` if `0–30`, `"HIGH"` if `> 30`.
  `printReading()` shows `<location> <celsius>°C on <measuredOn> — <label>`.

### 8) MovieTicket 🎬

* **Fields:** `String movie`, `String seatClass` (`"REGULAR"`, `"PREMIUM"`, `"VIP"`), `double basePrice`, `LocalDate date`.
* **Behavior:** `finalPrice()` uses `if`/`switch`:

    * REGULAR: base
    * PREMIUM: base + 3.0
    * VIP: base + 6.0
* **Print:** `<movie> <seatClass> on <date>: €<finalPrice>`.

### 9) BankTransfer 💸

* **Fields:** `String fromIban`, `String toIban`, `double amount`, `LocalDate date`, `String note`.
* **Behavior:** `fee()` → `0.0` if `amount <= 1000`, else `2.5`.
  `summary()` prints transfer and fee.

### 10) DiscountCoupon 🎟️

* **Fields:** `String code`, `int percent`, `LocalDate start`, `LocalDate end`.
* **Rules:** limit `percent` to 0–80.
* **Behavior:** `isValidOn(LocalDate d)` → `true` if `d` between `start` and `end` (inclusive).
  `print()` with code, percent, and validity today.

### 11) LoginAttempt 👤

* **Fields:** `String username`, `String ip`, `LocalDate date`, `boolean success`, `String reason` (e.g., `"OK"`, `"WRONG_PASSWORD"`, `"LOCKED"`).
* **Behavior:** `message()` returns different text depending on `success` and `reason` using `if`/`switch`.
  `print()` shows `<date> <username>@<ip> — <message>`.

### 12) ParcelDimensions 📦📐

* **Fields:** `int lengthCm`, `int widthCm`, `int heightCm`.
* **Behavior:** `volume()` returns `length*width*height`.
  `isOversize()` returns `true` if any side > 100 or volume > 100_000.
  `print()` shows dimensions, volume, and oversize flag.

### 13) CourseEnrollment 🎓

* **Fields:** `String student`, `String course`, `String level` (`"BEGINNER"`, `"INTERMEDIATE"`, `"ADVANCED"`), `LocalDate enrolledOn`.
* **Behavior:** `welcomeMessage()` varies by `level` (use `switch`).
  `printCard()` shows a one-line enrollment card.

### 14) UrlPreview 🔗

* **Fields:** `String url`, `String title`, `String description`.
* **Behavior:** `shortDescription(int max)` returns `description` truncated to `max` characters with `"..."` if it was longer (use `length()` and `substring`, **no loops**).
  `print()` shows title + short description (e.g., 30 chars).

### 15) ContactCard 📇

* **Fields:** `String firstName`, `String lastName`, `String email`, `String phone`.
* **Behavior:** `fullName()` returns `"First Last"` with **first letters uppercase** using `substring(0,1).toUpperCase()` + `substring(1).toLowerCase()` (guard against empty strings).
  `isCorporateEmail()` returns `true` if email does **not** end with `"@gmail.com"` or `"@yahoo.com"` (use `endsWith`).
  `print()` shows full name, email, and whether it’s corporate.

---

## Tips for running each exercise

For every class:

1. Create an `*App` class with `public static void main(String[] args)`.
2. Instantiate **one object with setters** and **one with the all-args constructor**.
3. Call the class’s behavior/print method(s).
4. Change one field and call the behavior method again to observe state changes.


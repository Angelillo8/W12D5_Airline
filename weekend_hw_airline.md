# Airline!

:star: This is a PDA Homework :star:

Your task is to model a system for the world renowned airline __JavaAir__, to allow them to manage their flights. You should use the tools you have learnt this week _where appropriate and useful_. Remember to **TDD**! Look for opportunities to use inheritance to capture shared behaviour / properties.

JavaAir doesn't really exist (sadly) - don't stress about how a "real" example of this would work differently. This is just an exercise to practice some different concepts.

## MVP
A `Passenger` has:

* a name
* a number of bags

A `CrewMember` has:

* a name
* a rank (e.g Captain, First Officer, Lead Attendant, Flight Attendant)
<details>
    <summary>Hint</summary>
    <p>Perhaps use an `enum` for this</p>
  </details>

A `Pilot` has:

* a name
* a rank
* a pilot licence number (you can use a `String` for this)
  
A `Pilot` should be able to:

* fly the plane (a simple method which returns a String is sufficient)

A `CabinCrewMember` should be able to:

* relay messages to the passengers(a simple method which returns a String is sufficient)

A `Flight` has:

* at least one `Pilot`
* some `CabinCrewMembers`
* a collection of `Passenger`'s
* flight number (i.e. "FR756")
* destination (i.e. GLA, EDI)
* departure airport (i.e. GLA, EDI)
* departure time (use a String)
* a total weight allowance for all baggage / passengers / cargo

The `Flight`  should be able to:

* return the number of available seats
* book a passenger (if there are remaining seats)

### Extensions
Create a `FlightManager` which can:

* For a given Flight calculate how much weight is remaining for cargo. Take into account -
    - The weight of the passengers (guesstimate)
    - The weight of all passengers' luggage based on number of bags and the bag weight allowance
    - The total weight allowance of the flight

### More Extensions
* Refactor the Flight's departure time to use a more suitable class
* Add a 'flight' property to the `Passenger` which is assigned when a passenger is added to a flight
* Add a 'seat number' property to the `Passenger` as an integer. Set it to a random number which is assigned when a `Passenger` is booked on a flight
* Make sure the flight doesn't double book the same seat number to more than one passenger

### PDA Reminder:

As part of this homework you are required to take screenshots of the following:

```
- An example of encapsulation in a program.
```

Demonstrate testing in your program. Take screenshots of:

```
- Example of test code
- The test code failing to pass
- Example of the test code once errors have been corrected
- The test code passing
```

- Submit your PDA evidence (screenshots, etc.) to Canvas

- PDA Reference: I.T 1, P18

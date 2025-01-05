## Behavioural Design Patterns

These design pattern are the ones that focus on how the classes & Objects communicate with each other & distribute the tasks .


### Chain of responsibilty

Chain of responsiblity design patterns forms chain of the request handlers which process the request,
At each point the handler decides to handle the request or pass on to the next.

Use case : Logging, Customer support & escalation

### Iterator

Iterator design pattern is used when we want to iterate over the collection of the objects & want to decouple the algorithm of iteration out of the actual data structure used by the collection.

Use case : Library with books

### Observer

Observer design pattern is when the state change of the object has to broadcasted to all the listeners/observers.
There can be multiple observer for a subject. 
Subject will hold the data & list of observers.

Use case : stock price changes, weather updates,

### State

State design pattern is used when there are only a set of functionalities available at every state, and on performing certain action will move to the other state.

Use Case : ATM, Vending machine : Where there are defined states that the system goes through.

### Strategy 

Strategy design pattern is used when there are some list of strategies that are avialable to solve the problem. At runtime gives the option to change the strategy.

Use Case : Sort Strategy, Parking place alottment strategy etc.

### Template method pattern

Used when we need all the subclasses to follow certain steps to perform the operation, but also give the flexibility for the logic of those steps are performed.

Use case : Order booking includes validation, credit, debit, book steps: Each subclasses should implement their own way of doing the following operation.

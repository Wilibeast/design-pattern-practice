# Design patterns practice

Examples of common design patterns to practice with.

## Creational Patterns

1. **Abstract Factory**
    - Provides an interface to create families of related or dependent objects without specifying their
      concrete classes.

2. **Builder**
    - Separates the construction of complex objects from their representation, allowing the same
      construction process to create different representations.

3. **Factory Method**
    - Defines an interface for creating an object, but lets subclasses alter the type of objects that will
      be created. It provides an abstract method for creating objects, allowing subclasses to provide their
      implementation.

4. **Prototype**
    - Allows you to create new objects by copying an existing object, serving as a blueprint for object
      creation. It promotes creating objects by copying an existing object.

5. **Singleton**
    - Ensures that a class has only one instance and provides a global point of access to that instance. It
      is commonly used for logging, driver objects, caching, thread pools, and database connections.

6. **Simple Factory (Factory)**
    - Provides an interface for creating objects in a super factory. The factory method pattern is often
      considered a more advanced version of the simple factory.

## Structural Patterns

1. **Adapter**
    - Allows the interface of an existing class to be used as another interface. It is often used to make
      existing classes work with others without modifying their source code.

2. **Decorator**
    - Attaches additional responsibilities to an object dynamically. Decorators provide a flexible
      alternative to subclassing for extending functionality.

3. **Mediator**
    - Defines an object that encapsulates how a set of objects interact. It promotes loose coupling by
      keeping objects from referring to each other explicitly and allows for more maintainable code.

## Behavioral Patterns

1. **Command**
    - Encapsulates a request as an object, thereby allowing for parameterization of clients with
      operations, queueing requests, and providing support for undoable operations.

2. **Command-Dispatch (Command Processor)**
    - A design pattern that handles command execution, request queuing, and parameterization. It often
      involves a command dispatcher, which is responsible for invoking specific commands based on user inputs or events.

3. **Memento**
    - Captures and externalizes an object's internal state so the object can be restored to that state
      later. It allows you to implement undo/redo functionality in an application.

4. **Observer (Publish-Subscribe)**
    - Defines a one-to-many dependency between objects, so that when one object changes state, all its
      dependents are notified and updated automatically. It is used for implementing distributed event handling systems,
      in which one object (the subject) maintains a list of its dependents (observers) and notifies them of state
      changes.

5. **State**
    - Allows an object to alter its behavior when its internal state changes. The object will appear to
      change its class.

6. **Strategy**
    - Defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets
      the algorithm vary independently from clients that use it.

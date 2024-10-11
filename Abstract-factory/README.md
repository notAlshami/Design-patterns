# Abstract factory
## Overview
The Abstract Factory is a creational design pattern that allows you to produce families of related objects without specifying their concrete classes. This pattern is particularly useful when the system needs to be independent of how its objects are created, composed, and represented.

## Key Concepts
- Creational Design Pattern: Focuses on object creation mechanisms.
- Families of Related Objects: Produces sets of objects that are designed to work together.
- Decoupling: Clients are decoupled from the specific classes of objects they create, enhancing flexibility and maintainability.
## Benefits
- Encapsulation of Object Creation: Hides the details of object creation from the client.
- Increased Flexibility: Easily switch between different families of objects.
- Consistency: Ensures that objects created within a family are compatible.
## Components
- Abstract Factory: Declares an interface for creating abstract products.
- Concrete Factory: Implements the abstract factory interface to create concrete products.
- Abstract Product: Declares an interface for a type of product.
- Concrete Product: Implements the abstract product interface.
- App: Uses only the factories that implements by the abstract factory interfaces.

# Builder

## Overview
Builder is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

## Components
- **Builder**: an interface declares product construction steps that are common to all types of builders.

- **Concrete Builders**: provide different implementations of the construction steps. Concrete builders may produce products that don’t follow the common interface.

- **Products**: are resulting objects. Products constructed by different builders don’t have to belong to the same class hierarchy or interface.

- **Director**: a class defines the order in which to call construction steps, so you can create and reuse specific configurations of products.
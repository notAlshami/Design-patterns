
# Abstract Factory

## Overview
Abstract Factory is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

## Components
- **Abstract Products**: declare interfaces for a set of distinct but related products which make up a product family.

- **Concrete Products**: are various implementations of abstract products, grouped by variants. Each abstract product (chair/sofa) must be implemented in all given variants (Victorian/Modern).

- **Abstract Factory**: an interface declares a set of methods for creating each of the abstract products.

- **Concrete Factories**: implement creation methods of the abstract factory. Each concrete factory corresponds to a specific variant of products and creates only those product variants.
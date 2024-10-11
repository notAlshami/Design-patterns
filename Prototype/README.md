
# Prototype

## Overview
Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

## Components
- **Prototype**: an interface declares the cloning methods. In most cases, it’s a single clone method.

- **Concrete Prototype**: a class implements the cloning method. In addition to copying the original object’s data to the clone, this method may also handle some edge cases of the cloning process related to cloning linked objects, untangling recursive dependencies, etc.
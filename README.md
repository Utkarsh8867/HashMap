# HashMap
In Java, a HashMap is part of the Java Collections Framework and is used to store key-value pairs. It allows for efficient retrieval of values based on their associated keys.

# HashMap in Java

## Overview
- A `HashMap` is part of the Java Collections Framework.
- It stores data as key-value pairs.
- Provides constant-time performance for basic operations (`O(1)`), assuming a good hash function.
- Keys are unique, but values can be duplicated.
- Allows one `null` key and multiple `null` values.

## Key Features
- **Unordered**: Does not maintain any order for the elements.
- **Null Values**: Allows one `null` key and multiple `null` values.
- **Non-Synchronized**: It is not synchronized, meaning it is not thread-safe by default. Use `Collections.synchronizedMap()` to make it synchronized.
- **Time Complexity**: Basic operations like get and put have `O(1)` time complexity.

## Basic Operations
### Initialization
```java
HashMap<KeyType, ValueType> map = new HashMap<>();

# Java Generics Practice

This repository contains multiple hands-on Java programs that demonstrate the use of **Generics** in real-world and interview-level scenarios. Each file is structured around a key concept like generic classes, interfaces, methods, wildcards, bounded types, and stack operations.

---

## 📂 Project Structure

### ✅ `Box.java`
Demonstrates:
- Generic class `Box<T>`
- Generic methods like `swap`, `compareNumber`, `studentName`
- Bounded types with `T extends Number & Comparable<T>`

### ✅ `GenericInterface.java`
Implements:
- A custom generic interface `Repositor<T>`
- Concrete implementation `IntegerRepository` that stores and retrieves integer values.

### ✅ `GenericStack.java`
Implements:
- A generic stack data structure with methods `push`, `pop`, `peek`, and `isEmpty`
- Used for both `Integer` and `String` types

### ✅ `Pair.java`
Shows:
- Generic class `Pair<K, V>` to store and retrieve key-value pairs
- Internal use of `HashMap` to simulate associative mapping

### ✅ `SorterApp.java`
Demonstrates:
- A generic sorting utility using a comparator
- Learner class with custom sort by marks
- Static generic method `contains` for checking existence in a list

### ✅ `GenericStacks.java`
Covers:
- Generic methods using **bounded wildcards** (`extends` and `super`)
- Methods:
  - `maxnumber()` – returns max of three numbers
  - `SumNumbers()` – sum of list of numbers
  - `PrintList()` – prints any type list
  - `EvenNumbers()` – adds even integers to a list

---

## 🔍 Concepts Covered

- ✅ Generic Classes
- ✅ Generic Interfaces
- ✅ Generic Methods
- ✅ Bounded Types (`<T extends ...>`)
- ✅ Wildcards (`<? extends T>`, `<? super T>`)
- ✅ Custom Implementations (Stack, Repository, Pair)
- ✅ Real-World Use Cases (Sorting, Max Finder, Swapper)

---

## 🚀 How to Run

1. Clone this repository:
   ```bash
   git clone https://github.com/pravalikareddy-1414/java-generics-Practice.git
   cd java-generics-Practice

# 📌 Entry Point of a Java Program

In Java, the point from where the program starts its execution is called the **entry point**, which is the `main()` method.

- The **Java Virtual Machine (JVM)** searches for the `main` method to start program execution.
- If not found, the execution will not take place.
- When a Java program starts, a **daemon thread** is attached to the `main()` method.
- This thread is destroyed only when the program terminates.

---

## ✅ Example: Function Signature of main()

```java
public static void main(String[] args)
```

### Breakdown:
- **public** – Access specifier; makes the method accessible from anywhere.
- **static** – Allows the JVM to call the method without creating an object.
- **void** – Return type; means the method doesn’t return any value.
- **main** – Method name; this is the entry point searched by the JVM.
- **()** – Denotes that it's a method.
- **String** – Data type of the parameter.
- **[]** – Specifies that the parameter is an array.
- **args** – Local variable name used to hold command-line arguments.

---

## 🔍 Why `main()` Uses `public`?

- `public` is an access modifier that allows visibility from outside the class.
- JVM is external to the class and needs access to `main()` to start execution.
- Hence, it must be `public`.

---

## 🔍 Why `main()` Is `static`?

- Declaring `main()` as `static` allows it to be called by the JVM **without creating an instance** of the class.
- This avoids unnecessary object creation and saves memory.
- JVM can call `main()` directly using the class name.

---

## 🔍 Why `main()` Uses `void`?

- `void` indicates that the method doesn't return any value.
- Since the JVM doesn’t use any return value from `main()`, it’s declared as `void`.
- Although `return` can be used inside, it won’t return a value to the JVM.

---

## ❓ What Is `main`?

- `main` is the **method name** used by the JVM as the starting point of execution.
- It is not a Java keyword, just a conventionally recognized identifier.

---

## ⚠️ Can We Execute Java Without `main()`?

Yes, **but only in Java versions prior to Java 8** using **static blocks**.

### Example:
```java
class JavaPlusDSA {
    static {
        System.out.println("Mai chala toh sbko current laga re!!!!");
    }
}
```

- A **static block** runs once when the class is loaded into memory.
- It is useful for initialization tasks.
- This approach **won’t work in Java 8 and above** as the JVM mandates a `main()` method.

---

## 💬 What Are Comments in Java?

Comments help in explaining the code and improving readability.

### Types of Comments:

- **Single-line comments:**  
  Start with `//`  
  Example: `// This is a single-line comment`

- **Multi-line comments:**  
  Start with `/*` and end with `*/`  
  Example:
  ```java
  /* This is
     a multi-line
     comment */
  ```

> 💡 **Joke:**  
> "Best use of comments is that you can comment out a bug and it’ll be fixed!"  
> 😅 Don't try this – the bug will be gone, but so might your job opportunity!

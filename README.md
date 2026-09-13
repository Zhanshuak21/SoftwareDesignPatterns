# Assignment #1: Builder Pattern Implementation

**Course:** Software Design Patterns 
**Institution:** Astana IT University  
**Student:** Zhanshuak Nurlankyzy 
**Group:** SE-2504  

---

## Project Overview
This repository contains a Java implementation of the **Builder Creational Design Pattern** applied to a complex `Report` generation system. 

The system allows generating reports in multiple distinct formats (PDF and HTML) with step-by-step construction, method chaining (fluent API), and strict build-time state validation.

---

## Pattern Architecture
The implementation consists of the following key components[cite: 1]:
* **`Report` (Product):** Represents the complex immutable report object being built[cite: 1].
* **`ReportBuilder` (Builder Interface):** Defines the construction steps and fluent method contracts[cite: 1].
* **`PdfReportBuilder` & `HtmlReportBuilder` (Concrete Builders):** Implement build steps for specific representations (PDF-style formatting vs. HTML tags)[cite: 1].
* **`ReportDirector` (Director):** Encapsulates predefined, reusable report build sequences (e.g., Academic Reports)[cite: 1].
* **`Main` (Client):** Demonstrates project execution using both the Director and fluent method chaining directly[cite: 1].

---

## How to Run

### Prerequisites
* Java Development Kit (JDK 17 or higher)[cite: 1]
* IntelliJ IDEA (or any Java-compatible IDE)[cite: 1]

### Execution Steps
1. Clone the repository to your local machine[cite: 1].
2. Open the project in IntelliJ IDEA[cite: 1].
3. Navigate to `src/com/assignment/builder/Main.java`.
4. Run the `main` method.

---

## Clean Code Highlights
* **Immutability:** Constructed `Report` instances cannot be mutated after creation (`Collections.unmodifiableList`)[cite: 1].
* **Validation:** The `build()` method executes internal state checks (`validateState()`), throwing clear exceptions for invalid or missing mandatory attributes[cite: 1].
* **Fluent Interface:** Builder methods return `this` to enable expressive method chaining[cite: 1].

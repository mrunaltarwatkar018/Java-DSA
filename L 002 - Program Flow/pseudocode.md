# Topper Finder Logic

This document outlines the step-by-step logic to find the overall topper across all classes and sections.

## Steps

1. **Initialize a Result List**
   - Create an empty list called `result` to store toppers from all classes and sections.

2. **Iterate Through Classes (1 to 12)**
   - For each class from 1 to 12:
     - Initialize an empty list `class_toppers` to hold toppers from each section.
     - Set the section to `'A'`.

3. **Iterate Through Sections (A to C)**
   - While the section is not beyond `'C'`:
     - Retrieve the **name** and **marks** of the topper in the current class and section.
     - Add the topper’s details to the `class_toppers` list.
     - Move to the next section (e.g., `'A'` to `'B'`).

4. **Store Section Toppers in Result**
   - After collecting toppers from sections `'A'`, `'B'`, and `'C'` of a class, add them to the `result` list.

5. **Determine the Overall Topper**
   - After all classes and sections are processed, find the student with the highest marks in the `result` list.


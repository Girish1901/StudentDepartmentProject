﻿# Student Department Project

 A Java-based college management system. This system models the organizational structure of RLJIT college with departments and student management capabilities.

## Classes

### 1. RLJIT Class
- Main college class that manages departments
- Uses ArrayList to store departments
- Methods:
  - `AddDpt(Dept dept)`: Add new department
  - `DisplayDep()`: Show all departments
  - `findDepartmentbyname(String deptname)`: Search for department

### 2. Dept Class
- Extends RLJIT
- Properties:
  - departmentname
  - HOD (Head of Department)
  - students (ArrayList)
- Methods:
  - `addStudent(Student student)`
  - `ListStudent()`
  - `findStudentByUSN(String USN)`
  - `getname()`

### 3. Student Class
- Properties:
  - name
  - USN (University Serial Number)
- Methods:
  - `displayInfo()`
  - `getUSN()`

## Example Usage

```java
RLJIT college = new RLJIT();
Dept DS = new Dept("Data Science", "DSS");

// Adding students
Student s1 = new Student("Xyz", "cd011");
Student s2 = new Student("YYY", "cd022");
DS.addStudent(s1);
DS.addStudent(s2);

// Finding student by USN
Student found = DS.findStudentByUSN("cd022");
if(found != null) {
    System.out.println("Student found");
    found.displayInfo();
}
```

## Features
- Department management
- Student enrollment
- Student search by USN
- Department information display
- Hierarchical structure modeling


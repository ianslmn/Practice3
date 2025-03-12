Monte Carlo PI Estimation Project

Description

This project implements a Monte Carlo method to estimate the value of π. It generates random points within a unit square and determines how many fall inside a quarter-circle, using the ratio to approximate π.

Project Structure

ceu/
├── programming/
│   ├── practices/
│   │   ├── practice3/
│   │   │   ├── Practice3.java
│   │   │   ├── Practice3Main.java
│   │   ├── Makefile
│   │   ├── README.md

Practice3.java: Implements the Monte Carlo method for estimating π.

Practice3Main.java: Main class that runs the Monte Carlo simulation.

Makefile: Automates the compilation and execution of the project.

Requirements

Java Development Kit (JDK) installed

GNU Make (optional, for using the Makefile)

Compilation & Execution

Using Makefile:

make
make run

Manual Compilation & Execution:

javac -d bin ceu/programming/practices/practice3/Practice3.java ceu/programming/practices/practice3/Practice3Main.java
java -cp bin edu.ceu.programming.practices.practice3.Practice3Main

Cleaning Up

To remove compiled files, run:

make clean

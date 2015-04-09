# Distributed-HGN

## Introduction

This respository contains java classes for Distributed Hierarchical Graph Neuron (DHGN) implementation for simple pattern recognition application.  

DHGN is an associative memory network that comprises a number of modified Hierarchical Graph Neuron (HGN) subnets and a Stimulator/Interpreter Module (SI Module) node. Each HGN subnet consists of processing nodes known as Graph Neuron (GN). DHGN has been developed for distributed pattern recognition application, in which the respective recognition procedure can be applied in a distributed manner.

This package is the DHGN Java version of original Graph Neuron (GN) algorithm. This program accepts multiple-value patterns (up to 10000 patterns tested) with multiple character input element.

## Contents

This repo contains a "DHGN.jar" file for DHGN subnet implementation, together with input and parameter files. This jar file includes the following java classes:
- DHGN.java
- GN.java
- BiasArray.java

## How to execute?

To run the project from the command line, go to the dist folder and type the following:

java -jar "DHGN.jar" 

To distribute this project, zip up the dist folder (including the lib folder) and distribute the ZIP file.

## Author

Anang Hudaya Muhamad Amin.  
Thundercloud Research Lab.  
Faculty of Information Science & Technology (FIST).  
Multimedia University.  

## Last Update

9th of April 2015

# Distributed-HGN

## Introduction

This respository contains java classes for Distributed Hierarchical Graph Neuron (DHGN) implementation for simple pattern recognition application.  

DHGN is an associative memory network that comprises a number of modified Hierarchical Graph Neuron (HGN) subnets and a Stimulator/Interpreter Module (SI Module) node. Each HGN subnet consists of processing nodes known as Graph Neuron (GN). DHGN has been developed for distributed pattern recognition application, in which the respective recognition procedure can be applied in a distributed manner.

This package is the DHGN Java version of original Graph Neuron (GN) algorithm. This program accepts multiple-value patterns (up to 10000 patterns tested) with multiple character input element.

## Contents

This repo contains a "DHGN.jar" file for DHGN subnet implementation, together with input and parameter files. This jar file includes the following java classes:
- DHGN.class * Main java class for DHGN implementation
- GN.class
- BiasArray.class

## How to Execute?

To directly run the project from the command line with sample inputs provided, go to the destination folder and type the following:

`java -jar "DHGN.jar"` 

### Sample inputs

Sample inputs provided in this package are seven 5-digit length patterns as shown in the following table:   

|   Inputs      |
|---------------|
|   1 1 1 1 2   |
|   1 1 1 1 2   |
|   1 1 2 1 1   |
|   1 2 1 1 1   |
|   2 1 1 1 1   |
|   1 1 6 1 2   |
|   1 6 1 2 1   |
-----------------

## Author

Anang Hudaya Muhamad Amin.  
Thundercloud Research Lab.  
Faculty of Information Science & Technology (FIST).  
Multimedia University.  

## References

Here are some references as the base for our work on DHGN:

1. Amin, Anang Hudaya Muhamad, and Asad I. Khan. "A divide-and-distribute approach to single-cycle learning HGN network for pattern recognition." Control Automation Robotics & Vision (ICARCV), 2010 11th International Conference on. IEEE, 2010.  
2. Amin, Anang Hudaya Muhamad, and Asad I. Khan. "Recognising complex patterns through a distributed multi-feature approach." Hybrid Intelligent Systems (HIS), 2011 11th International Conference on. IEEE, 2011.
3. Amin, Anang Hudaya Muhamad, Asad I. Khan, and Benny B. Nasution. Internet-scale Pattern Recognition: New Techniques for Voluminous Data Sets and Data Clouds. CRC Press, 2012.

## Last Update

9th of April 2015

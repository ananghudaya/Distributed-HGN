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

### Jar File Execution

To directly run the project from the command line with sample inputs provided, go to the destination folder and type the following:

`java -jar "DHGN.jar"` 

#### Sample inputs

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

#### Output

The output of recognition process using this DHGN recognition tool would be in the form of index for each of the particular input. Similar inputs may produce similar indices (recall), while new inputs introduced in the network will generate new indices. The output is also automatically saved in output.txt file.

Code below shows the output from the built-in input patterns:

`b[0]:1  b[1]:1  b[2]:1  b[3]:1  b[4]:1  m[10]:1 m[11]:1 m[12]:1 t:1`  
`b[0]:1  b[1]:1  b[2]:1  b[3]:1  b[4]:1  m[10]:1 m[11]:1 m[12]:1 t:1`  
`b[0]:1  b[1]:2  b[2]:1  b[3]:2  b[4]:1  m[10]:2 m[11]:2 m[12]:2 t:2`  
`b[0]:2  b[1]:1  b[2]:2  b[3]:3  b[4]:1  m[10]:3 m[11]:3 m[12]:3 t:3`  
`b[0]:1  b[1]:3  b[2]:1  b[3]:3  b[4]:1  m[10]:4 m[11]:4 m[12]:4 t:4`  
`b[0]:1  b[1]:4  b[2]:1  b[3]:4  b[4]:1  m[10]:5 m[11]:5 m[12]:5 t:5`  
`b[0]:3  b[1]:1  b[2]:3  b[3]:3  b[4]:2  m[10]:6 m[11]:6 m[12]:6 t:6`  

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

# Distributed-HGN

## Introduction

This respository contains java classes for Distributed Hierarchical Graph Neuron (DHGN) implementation for simple pattern recognition application.  

DHGN is an associative memory network that comprises a number of modified Hierarchical Graph Neuron (HGN) subnets and a Stimulator/Interpreter Module (SI Module) node. Each HGN subnet consists of processing nodes known as Graph Neuron (GN) in a pyramid-like structure (See references for more details). DHGN has been developed for distributed pattern recognition application, in which the respective recognition procedure can be applied in a distributed manner.

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

Code below shows a snippet of output from the built-in input patterns:

`b[0]:1  b[1]:1  b[2]:1  b[3]:1  b[4]:1  m[10]:1 m[11]:1 m[12]:1 t:1`  

The output shows indices from all GNs within the HGN subnet composition. 

- `b[0]:1` shows the index 1 produced by base-layer GN with position 0.
- `m[10]:1` shows the index 1 produced by first middle-layer GN with position 0.
- `t:1` shows the index 1 produced by top-layer GN with position.

### Extracting jar file

The basic command to use for extracting the contents of a DHGN JAR file is:

`jar xf jar-file DHGN.jar`

To use different sets of input patterns, please modify the entry in `input.txt`.

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

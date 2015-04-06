/*
#################################################################################################
# FILE: DHGN.java
#
# Version: 1.1
#
# DESCRIPTION: 	This package is the DHGN Java version of Original GN algorithm by Dr. Asad I. Khan
#				This program accepts multiple-value patterns (up to 10000 patterns tested) with
#				multiple character input element.
#				This program will be used for pattern recognition process.
#
# CREATED ON: 16th of March, 2015 by Anang Hudaya Muhamad Amin, Multimedia University
# LAST REVISED: 23rd of March, 2015 by Anang Hudaya Muhamad Amin, Multimedia University
#
#################################################################################################
*/

package dhgn;

import java.io.*;
import java.util.*;

/**
 *
 * @author admin
 */
public class DHGN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int w, x, y, z;                 //internal counters
        int baseIndex;                  //base indices
        int midIndex;                   //middle-GN indices
        int count = 0;                  //no. of input patterns
        int length = 0;                 //pattern size
        int height = 0;                 //DHGN subnet layers
        int topIndex[];                 //top index
        String output = "";
        int[] tempIndex;
        
        PrintWriter writer = null;
        
        BaseGN [] bgn;                  //base GN node declaration
        MiddleGN[] mgn;                 //middle GN node declaration
       
        //Reading config file
        int[] inConfig = new int[2];
        String strFP = "/Users/admin/Documents/NetBeansProjects/DHGN/src/dhgn/config.txt"; //for mac
 
        try{
            File inCon = new File(strFP);
            Scanner inc = new Scanner(inCon);

            while(inc.hasNext())
            {
                for(x = 0; x < 2; x++){
                    inConfig[x] = inc.nextInt(); 
                }
            }  
        }
        catch(IOException ioe){
          System.out.println("IOException : " + ioe);
        }
        
        count = inConfig[0];        //initialize no. of patterns value
        length = inConfig[1];       //initialize length of patterns value
        height = (length + 1)/2;    //initialize DHGN subnet height value
        
        topIndex = new int[count];
        tempIndex = new int[height];
        bgn = new BaseGN[length]; 
        mgn = new MiddleGN[length-2];
        
        //setting up base GN
        for(x = 0; x < bgn.length; x++){
            bgn[x] = new BaseGN();
        }
        
        //setting up middle GN
        for(x = 0; x < mgn.length; x++){
                mgn[x] = new MiddleGN();
        }
        
        
        //reading data from input file
        int[][] inPattern = new int[count][length];
        String strFilePath = "/Users/admin/Documents/NetBeansProjects/DHGN/src/dhgn/input.txt"; //for mac
 
        try{
            File inFile = new File(strFilePath);
            Scanner in = new Scanner(inFile);

            while(in.hasNext())
            {
                for(x = 0; x < count; x++){
                    for(y = 0; y < length; y++){
                        inPattern[x][y] = in.nextInt();
                        
                    }
                }  
            }
        }
        catch(IOException ioe){
          System.out.println("IOException : " + ioe);
        }
        
        try{
            writer = new PrintWriter("/Users/admin/Documents/NetBeansProjects/DHGN/src/dhgn/output.txt", "UTF-8");
        }
        catch(IOException ioe){
          System.out.println("IOException : " + ioe);
        }
        
        //recognition procedure
        for(x = 0; x < count; x++){
            //Base Layer
            for(y = 0; y < length; y++){
                if(y == 0){
                    baseIndex = bgn[y].storePattern(999, inPattern[x][y+1]);
                }
                else if(y > 0 && y < length-1){
                     baseIndex = bgn[y].storePattern(inPattern[x][y-1], inPattern[x][y+1]);
                     mgn[y-1].mid = baseIndex;
                }
                else{
                   baseIndex = bgn[y].storePattern(inPattern[x][y-1], 999); 
                }
                //output = output + "b[" + y + "]:" + baseIndex + "\t";
            } 
            
            //Middle Layers
            for(w = 1; w < height-1; w++){
                for(z=0; z < length-(2*w); z++){
                    if(w == height - 2){
                        if(z==0){
                            midIndex = mgn[z].storePattern(mgn[z].mid, 999, mgn[z+1].mid);
                            //midIndex = tempIndex[w-1];
                        }
                        else if(z > 0 && z  < length-((2*w)+1)){
                            midIndex = mgn[z].storePattern(mgn[z].mid, mgn[z-1].mid, mgn[z+1].mid);
                            //midIndex = tempIndex[w-1];
                            topIndex[x] = midIndex;
                        }
                        else{
                            //midIndex = mgn[z].temp;
                            midIndex = mgn[z].storePattern(mgn[z].mid, mgn[z-1].mid, 999);
                            //midIndex = tempIndex[w-1];
                        }
                    }
                    else{
                        if(z==0){
                            midIndex = mgn[z].storePattern(mgn[z].mid, 999, mgn[z+1].mid);
                            tempIndex[w] = midIndex;
                        }
                        else if(z > 0 && z  < length-((2*w)+1)){
                            //if(w == height - 2){  //Top Layer
                                midIndex = mgn[z].storePattern(mgn[z].mid, mgn[z-1].mid, mgn[z+1].mid);
                                tempIndex[w] = midIndex;
                           //     topIndex[x] = midIndex;
                           // }
                           // else
                           //     midIndex = mgn[z].storePattern(mgn[z].mid, mgn[z-1].mid, mgn[z+1].mid);
                        }
                        else{
                            midIndex = mgn[z].storePattern(mgn[z].mid, mgn[z-1].mid, 999);
                            tempIndex[w] = midIndex;
                        }
                    }
                    output = output + "m[" + w + z + "]:" + midIndex + "\t";
                }
            }
            output = output + "t:" + topIndex[x] + "\n";
            output = output + "\n";
        }
        writer.println(output);
        writer.close();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dhgn;

/**
 *  This class defines the structure of GN nodes. 
 * @author admin
 */
public class GN {
    
    protected int _left;
    protected int _right;
    protected int _middle;
    protected int _index;
    private int x;
    private int index;
    
    BiasArray[] bArr = new BiasArray[100];
    
    public GN(){
        for(int z = 0; z < 100; z++){
            bArr[z] = new BiasArray();
        }
    }
    
    public int getIndex(int l, int r){
        
        
        for(x = 0; x < bArr.length; x++)
	{
		if((l == bArr[x].bLeft) && (r == bArr[x].bRight))
		{
			index = x+1;
                        //index = x;
			break;
		}
		else
		{
			if((bArr[x].bLeft == 0) && (bArr[x].bRight == 0))
			{
				bArr[x].bLeft = l;
				//bArr[x].bMiddle = m;
				bArr[x].bRight = r;
				index = x+1;
                                //index = x;
				break;
			}
                        //else
                            //index = x+1;
		}
	}
        
        return index;
    }
    
    public int getMidIndex(int l, int m, int r){
        
        
        for(x = 0; x < bArr.length; x++)
	{
		if((l == bArr[x].bLeft) && (r == bArr[x].bRight) && (m == bArr[x].bMiddle))
		{
			index = x+1;
                        //index = x;
			break;
		}
		else
		{
			if((bArr[x].bLeft == 0) && (bArr[x].bRight == 0) && (bArr[x].bMiddle == 0))
			{
				bArr[x].bLeft = l;
				bArr[x].bMiddle = m;
				bArr[x].bRight = r;
				index = x+1;
                                //index = x;
				break;
			}
                        //else
                            //index = x+1;
		}
	}
        
        return index;
    }
}

class BaseGN extends GN{
   
    public BaseGN(){
        super();
    }
    
    public int storePattern(int frLeft, int frRight){ 
        _left = frLeft;
        _right = frRight;
        
        _index = getIndex(frLeft, frRight);
        
        return _index;
    }
}

class MiddleGN extends GN{
    
    public int mid;
    
    public MiddleGN(){
        super();
    }
    
    public int storePattern(int frMiddle, int frLeft, int frRight){ 
        _left = frLeft;
        _middle = frMiddle;
        _right = frRight;
        
        _index = getMidIndex(frLeft, frMiddle, frRight);
        //_index = frMiddle;
        
        return _index;
    }
}




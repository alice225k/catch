package me;

public class mine {
	

	    public static void main(String Args[]){
		        int[] array = new int[3];
		        try{	            
		        	for(int i=0;i<4;++i){
		                array[i] = i;
		            }
		            System.out.println(array);
		        }
		        catch(ArrayIndexOutOfBoundsException e){
		            
	            System.out.println("OOPS, YOU HAVE GONE TOO FAR, BETTER GO BACK TO  0!");
		        }
		    }
		

		}
		




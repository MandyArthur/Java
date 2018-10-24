package thenewboston; 

class MultidimensionalArray{
    public static void main(String[] args){
        int firstarray[][]={{8,9,10,11},{12,13,14,15}}; 
        int secondarray[][]={{30,31,32,33},{6},{2,3,4,5}, {5,4,3}};
        System.out.println("This is the first array"); 
        display(firstarray); 
        System.out.println("This is the second array"); 
        display(secondarray); 
        
    }
    public static void display(int x[][]){
        for (int[] x2 : x) {
            for (int column = 0; column < x2.length; column++) {
                System.out.print(x2[column] + "\t"); 
            }
            System.out.println();
        }
    }
}

/*        for(int row=0;row<x.length;row++){
            for(int column = 0; column<x[row].length; column++){
                System.out.print(x[row][column]+"\t"); */
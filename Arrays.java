class Arrays{
    public static void main(String[] args) {
        int [] arr = new int[5]; // No garbage value , initialised with 0
        arr[3] = 56; 
        arr[4] = 56; 
        arr[2] = 56; 
        int[] marks = {2, 3, 4, 5, 6}; // marks.length();
        for (int i=0 ; i<5 ; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println(" ");
        for (int i=0 ; i<5 ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
        for (int i:marks) // For each loop
        {
            System.out.print(i + " ");
        }
    }
}
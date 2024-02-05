class Methode {
    int add(int a, int b) // If we are not using the static keyword we must make an object
    {
        return a + b;
    }

    public static void main(String[] args) {
        Methode obj = new Methode();
        System.out.println(obj.add(2, 3));
    }
}
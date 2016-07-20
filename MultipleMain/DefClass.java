class DefClass {

    public static void main (String args[]){
        System.out.println(" using DefClass");
        Sum a = new Sum();
        System.out.println("Sum is :" + a.add(5, 10));
        Sum.main(null);
        Sum.main(1);
    }
}

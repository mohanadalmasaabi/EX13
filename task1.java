public class task1 {


}
    public static void main(String[] args) {

    }
        ArrayList<String> Employees= new ArrayList<String>();
        try(BufferedReader br = new BufferedReader(new FileReader("Names.txt"))){
            while (br.ready()) {
                Employees.add(br.readLine());
            }

        }catch (IOException ex){
            System.out.println("Error reading the file"+ ex);
        }
        //Displaying the size of the collection
        System.out.println("Size of the collection is: "+Employees.size());

        System.out.println("Displaying the collection of employees:");

        //Printing the Arraylist using for loop
        for (int i = 0; i < Employees.size();i++) {
            System.out.println(Employees.get(i));
        }
        System.out.println("--------------------------------");

        //Printing the ArrayList using for-each loop
        for(String names : Employees) {
            System.out.print(Employees+ "\n");
        }
        System.out.println("--------------------------------");

        //Printing the ArrayList using iterator
        Iterator<String> it = Employees.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
}

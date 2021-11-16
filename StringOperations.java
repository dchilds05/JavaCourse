public class StringOperations {
    public static void main(String[] args){
        String name = "Danny";
        System.out.println("name: " + name);

        String newName = 'A' + name.substring(1,4) + 'Z';
        System.out.println("newName: " + newName);

        String address = "www.stackoverflow.com";
        System.out.println("address: " + address);

        String newAddress = address.substring(4,address.length()-4) + "1331";
        System.out.println("newAddress: " + newAddress);
    }
}
public class Main {
    public static void main(String[] args) {
        HashInfo hashMapData = new HashMapData();

        // adapt-ee
        EmployeeInterface employeeAdapter = new EmployeeAdapter(hashMapData);

        employeeAdapter.printUserInfo();
        System.out.println("Size: " + employeeAdapter.getSize());

        wait3sec();

        // Adding another item
        addNewItem(employeeAdapter);

        employeeAdapter.printUserInfo();

        System.out.println("Size: " + employeeAdapter.getSize());
    }

    public static void wait3sec() {
        System.out.println("-----------------------------");
        System.out.println("waiting 3 sec ...");
        System.out.println("-----------------------------");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void addNewItem(EmployeeInterface employeeAdapter) {
        UserModel item = new UserModel(
                "Gabriel",
                "Jesus",
                "gabriel@email.com",
                "Street1, Brazil"
        );

        employeeAdapter.addItem(item);
    }
}
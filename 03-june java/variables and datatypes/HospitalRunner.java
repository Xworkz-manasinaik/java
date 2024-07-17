class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("Main method started");
        boolean patientRegistered = Hospital.registerPatient(101, "John", "Doe", 30, "Male", "1234567890", "john.doe@example.com", "123 Main St", "2024-07-07", "Flu");

        if (patientRegistered) {
            Hospital.getPatientData();
        } else {
            System.out.println("Patient registration was unsuccessful. Please check the entered details.");
        }
        System.out.println("Main method ended");
    }
}
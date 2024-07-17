class Hospital {
    static int patientId;
    static String firstName;
    static String lastName;
    static int age;
    static String gender;
    static String contactNumber;
    static String email;
    static String address;
    static String admissionDate;
    static String disease;

    public static boolean registerPatient(int pId, String fName, String lName, int pAge, String pGender, String contact, String emailAddr, String addr, String admDate, String dis) {
        boolean isRegistrationSuccessful = true;
        boolean isPatientIdValid = true;
        boolean isFirstNameValid = true;
        boolean isLastNameValid = true;
        boolean isAgeValid = true;
        boolean isGenderValid = true;
        boolean isContactNumberValid = true;
        boolean isEmailValid = true;
        boolean isAddressValid = true;
        boolean isAdmissionDateValid = true;
        boolean isDiseaseValid = true;

        if (pId <= 0) {
            System.out.println("Invalid patient ID.");
            isPatientIdValid = false;
        } else {
            patientId = pId;
        }

        if (fName == null || fName.isEmpty()) {
            System.out.println("Invalid first name.");
            isFirstNameValid = false;
        } else {
            firstName = fName;
        }

        if (lName == null || lName.isEmpty()) {
            System.out.println("Invalid last name.");
            isLastNameValid = false;
        } else {
            lastName = lName;
        }

        if (pAge <= 0) {
            System.out.println("Invalid age.");
            isAgeValid = false;
        } else {
            age = pAge;
        }

        if (pGender == null || pGender.isEmpty()) {
            System.out.println("Invalid gender.");
            isGenderValid = false;
        } else {
            gender = pGender;
        }

        if (contact == null || contact.isEmpty() || contact.length() != 10) {
            System.out.println("Invalid contact number. It should be 10 digits long.");
            isContactNumberValid = false;
        } else {
            contactNumber = contact;
        }

        if (emailAddr == null || emailAddr.isEmpty() || !emailAddr.contains("@")) {
            System.out.println("Invalid email.");
            isEmailValid = false;
        } else {
            email = emailAddr;
        }

        if (addr == null || addr.isEmpty()) {
            System.out.println("Invalid address.");
            isAddressValid = false;
        } else {
            address = addr;
        }

        if (admDate == null || admDate.isEmpty()) {
            System.out.println("Invalid admission date.");
            isAdmissionDateValid = false;
        } else {
            admissionDate = admDate;
        }

        if (dis == null || dis.isEmpty()) {
            System.out.println("Invalid disease.");
            isDiseaseValid = false;
        } else {
            disease = dis;
        }

        if (isPatientIdValid && isFirstNameValid && isLastNameValid && isAgeValid && isGenderValid && isContactNumberValid && isEmailValid && isAddressValid && isAdmissionDateValid && isDiseaseValid) {
            System.out.println("Patient registration successful.......");
            isRegistrationSuccessful = true;
        } else {
            System.out.println("Patient registration failed.......");
            isRegistrationSuccessful = false;
        }

        return isRegistrationSuccessful;
    }

    public static void getPatientData() {
        System.out.println("Patient Details:");
        System.out.println("Patient ID: " + patientId);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact Number: " + contactNumber);
        System.out.println("Email: " + email);
        System.out.println("Address: " + address);
        System.out.println("Admission Date: " + admissionDate);
        System.out.println("Disease: " + disease);
        System.out.println("Patient Successfully Registered.");
    }
}



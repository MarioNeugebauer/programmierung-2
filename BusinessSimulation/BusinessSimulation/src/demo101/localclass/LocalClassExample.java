package demo101.localclass;

public class LocalClassExample {
    static String regularExpression = "[^0-9]";
    public static void validatePhoneNumber(String phoneNumber) {
        final int numberLength = 10;
        
        class PhoneNumber {
            String formattedPhoneNumber = null;
            PhoneNumber(String phoneNumber){
                String currentNumber = phoneNumber.replaceAll(
                  regularExpression, "");
                if (currentNumber.length() == numberLength)
                    formattedPhoneNumber = currentNumber;
                else
                    formattedPhoneNumber = null;
            }
            public String getNumber() {
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(phoneNumber);
        System.out.println("Number is " + myNumber1.getNumber());
    }
}
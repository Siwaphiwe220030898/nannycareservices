package za.ac.cput.util;

import za.ac.cput.domain.Nanny;
   public class Helper {

       //----------Nanny Methods ---------//
       //Author: Nakedi Puleng Veronica (222914556)
       //Date 28/03/2025
       public static boolean isValidNanny(Nanny nanny) {
            if (nanny == null) return false;

            if (isNullOrEmpty(nanny.getName()) ||
                    isNullOrEmpty(nanny.getPhoneNumber()) ||
                    isNullOrEmpty(nanny.getAvailability())) {
                return false;
            }

            if (nanny.getYearsOfExperience() < 0 || nanny.getHourlyRate() < 0) {
                return false;
            }

            if (!isValidPhoneNumber(nanny.getPhoneNumber())) {
                return false;
            }

            return true;
        }

        private static boolean isNullOrEmpty(String value) {
            return value == null || value.trim().isEmpty();
        }

        private static boolean isValidPhoneNumber(String phoneNumber) {
            // Example of a simple check for a phone number (adjust pattern as needed)
            String regex = "^\\+?[0-9]{10,15}$";
            return phoneNumber.matches(regex);


        }
       //---------------Child Methods-------------//
        public static boolean isValidAge(int age) {
            return age >0 && age < 18;
        }

        public static boolean hasMedicalInfo(String medicalInfo) {
            return medicalInfo != null && !medicalInfo.trim().isEmpty();
        }

        public static boolean isValidChildId(String childId) {
            return childId.matches("\\d{6,8}");}
    }







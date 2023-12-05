package org.example;

public class Rex {
    public boolean PhoneNumber(String phoneNumber) {
        return phoneNumber.matches("\\(\\+380\\)\\d{2}-\\d{3}-\\d{2}-\\d{2}");
    }

    public String Spaces(String input) {
        return input.replaceAll("\\s+", " ");
    }

    public String DelHtmlTags(String input) {
        return input.replaceAll("<[^>]*>", "");
    }
}

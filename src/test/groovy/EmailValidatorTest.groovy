package com.example.demo

import com.example.demo.EmailValidator

class EmailValidatorTest extends spock.lang.Specification {
    private final EmailValidator isValidEmail = new EmailValidator();
    void setup() {
    }

    void cleanup() {
    }

    def "Test Valid email"() {
        when:
            String em = "hello@gmail.om"

        then:""
            isValidEmail.test(em) == true;
    }

    def "Test Invalid email"() {
        when:
        String em = "hellogmail.om"

        then:""
        isValidEmail.test(em) == true;
    }
}

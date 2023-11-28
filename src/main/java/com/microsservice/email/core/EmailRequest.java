package com.microsservice.email.core;

public record EmailRequest(String to, String subject, String body) {
}

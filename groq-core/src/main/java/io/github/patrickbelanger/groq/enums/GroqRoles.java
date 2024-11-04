package io.github.patrickbelanger.groq.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum GroqRoles {
    ASSISTANT("assistant"),
    SYSTEM("system"),
    USER("user")
    ;

    private final String roleName;

    GroqRoles(String roleName) {
        this.roleName = roleName;
    }

    @JsonCreator
    public static GroqRoles fromValue(String value) {
        return Arrays.stream(GroqRoles.values())
            .filter(role -> role.roleName.equalsIgnoreCase(value))
            .findFirst()
            .orElseThrow(() -> new IllegalArgumentException("Unknown role: " + value));
    }

    @JsonValue
    public String getRoleName() {
        return roleName;
    }
}

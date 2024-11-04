package io.github.patrickbelanger.groq.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Arrays;

public enum GroqRoles {
    /**
     * Assistant role: Represents the AI model responding to the user.
     */
    ASSISTANT("assistant"),
    /**
     * System role: Sets the assistant's behavior and can be used to provide specific instructions
     * for how it should behave throughout the conversation.
     */
    SYSTEM("system"),
    /**
     * User role: Sets the role to send messages for the assistant to respond to.
     */
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

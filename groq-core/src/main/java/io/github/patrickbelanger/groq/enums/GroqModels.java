package io.github.patrickbelanger.groq.enums;

public enum GroqModels {
    LLAMA3_3B_8192("llama3-8b-8192")
    ;

    private final String name;

    GroqModels(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

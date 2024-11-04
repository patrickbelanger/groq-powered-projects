package io.github.patrickbelanger.groq.dto;

import java.util.List;

public class GroqModelsResponseDTO {
    private List<GroqModelResponseDTO> data;

    public String getObject() {
        return "list";
    }

    public List<GroqModelResponseDTO> getData() {
        return data;
    }

    public void setData(List<GroqModelResponseDTO> data) {
        this.data = data;
    }
}

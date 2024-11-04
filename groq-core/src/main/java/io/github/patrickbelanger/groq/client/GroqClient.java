package io.github.patrickbelanger.groq.client;

import io.github.patrickbelanger.groq.dto.GroqModelResponseDTO;
import io.github.patrickbelanger.groq.dto.GroqModelsResponseDTO;
import io.github.patrickbelanger.groq.dto.GroqRequestDTO;
import io.github.patrickbelanger.groq.dto.GroqResponseDTO;
import io.github.patrickbelanger.groq.enums.GroqEndPoints;

public class GroqClient extends GroqWebClient {

    public GroqClient() {
         super();
    }

    public GroqResponseDTO createChatCompletion(GroqRequestDTO requestBody) {
        return post(GroqEndPoints.CREATE_CHAT_COMPLETION.getPath(), requestBody);
    }

    public GroqModelsResponseDTO getListModels() {
        return get(GroqEndPoints.LIST_MODELS.getPath(), GroqModelsResponseDTO.class).block();
    }

    public GroqModelResponseDTO getModel(String modelName) {
        return get(GroqEndPoints.RETREIVE_MODEL.getPath().formatted(modelName), GroqModelResponseDTO.class).block();
    }
}
